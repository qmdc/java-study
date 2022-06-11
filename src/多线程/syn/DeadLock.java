package 多线程.syn;

//死锁：多个线程互相抱着对方需要的资源，然后形成僵持
public class DeadLock {
    public static void main(String[] args) {
        Makeup t1=new Makeup("灰姑娘",0);
        Makeup t2=new Makeup("白雪公主",1);

        new Thread(t1).start();
        new Thread(t2).start();
//        t1.start();
//        t2.start();
    }
}

//口红
class Lipsrick{
}

//镜子
class  Mirror{
}

class Makeup extends Thread{
    //用static来保证所需的资源只有一份
    static Lipsrick lipsrick=new Lipsrick();
    static Mirror mirror=new Mirror();

    int choice;//选择
    String name;//姓名

    public Makeup(String name,int choice){
        this.name=name;
        this.choice=choice;
    }

    @Override
    public void run(){
        try {
            makeup();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void makeup() throws InterruptedException {
        if (choice==1) {
            synchronized (lipsrick){
                System.out.println(this.name+"拿到了口红💄");
                Thread.sleep(100);
            }
            synchronized (mirror){
                System.out.println(this.name+"拿到了镜子🪞");
            }
        }else{
            synchronized (mirror){
                System.out.println(this.name+"拿到了镜子🪞");
                Thread.sleep(100);
            }
            synchronized (lipsrick){
                System.out.println(this.name+"拿到了口红💄");
            }
        }
    }
}


