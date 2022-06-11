package 多线程.PC;

//测试生产者消费者问题2：信号灯法，标识位解决
public class TestPC2 {
    public static void main(String[] args) {
        TV tv=new TV();
        new Player(tv).start();
        new Watcher(tv).start();
    }
}

//生产者-->演员
class Player extends Thread{
    TV tv;
    public Player(TV tv){
        this.tv=tv;
    }
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            if (i%2==0) {
                tv.play("今日说法");
            }else if(i%3==0){
                tv.play("焦点访谈");
            }else {
                tv.play("NBA总决赛");
            }
        }
    }
}

//消费者-->观众
class  Watcher extends Thread{
    TV tv;
    public Watcher(TV tv){
        this.tv=tv;
    }
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            tv.watch();
        }
    }
}

//产品-->节目
class TV{
    String voice;
    Boolean flag=true;//为true时演员表演，为false时观众观看

    public synchronized void play(String voice){
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了" + voice);
        this.voice=voice;
        this.notifyAll();//通知唤醒
        this.flag=!this.flag;
    }

    public synchronized void watch(){
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观众观看了"+this.voice);
        this.notifyAll();
        this.flag=!this.flag;
    }
}