package 多线程.PC;

//测试：生产者消费者模型->利用缓冲区解决：管程法

//生产者，消费者，产品，缓冲区
public class TestPC {
    public static void main(String[] args) {
        SynContainer container=new SynContainer();
        new Productor(container).start();
        new Consumer(container).start();
    }
}


//生产者
class Productor extends Thread{
    SynContainer container;
    public Productor(SynContainer container){
        this.container  =container;
    }
    @Override
    public void run(){
        for (int i = 1; i < 100; i++) {
            System.out.println("生产了第"+i+"只鸡腿🍗");
            container.push(new Chicken(i));
        }
    }
}

//消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container){
        this.container=container;
    }
    @Override
    public void run(){
        for (int i = 1; i < 100; i++) {
//            container.pop();
            System.out.println("消费者吃了第"+container.pop().id+"只鸡腿🍗");
        }
    }
}

//产品
class Chicken{
    int id;//产品编号
    public Chicken(int id){
        this.id=id;
    }
}

//缓冲区
class SynContainer{
    Chicken[] chickens=new Chicken[10];
    int count=0;

    //生产者放入产品
    public synchronized void push(Chicken chicken){
        if (count==chickens.length-1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        chickens[count]=chicken;

        this.notifyAll();
    }

    //消费者消费商品
    public synchronized Chicken pop(){
        if (count==0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Chicken chicken=chickens[count];
        count--;

        this.notifyAll();
        return chicken;
    }
}
