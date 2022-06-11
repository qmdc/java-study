package 多线程.State;

public class TestPriority {
    public static void main(String[] args) {
        //主线程默认优先级5
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());

        MyPriority myPriority=new MyPriority();
        Thread t1=new Thread(myPriority);
        Thread t2=new Thread(myPriority);
        Thread t3=new Thread(myPriority);
        Thread t4=new Thread(myPriority);
        Thread t5=new Thread(myPriority);
        Thread t6=new Thread(myPriority);
        Thread t7=new Thread(myPriority);

        t1.start();//默认5

        //先设置优先级，再抛出线程
        t2.setPriority(5);
        t2.start();

        t3.setPriority(8);
        t3.start();

        t4.setPriority(3);
        t4.start();

        t5.setPriority(Thread.MAX_PRIORITY);
        t5.start();

        t6.setPriority(Thread.MIN_PRIORITY);
        t6.start();

        t7.setPriority(9);
        t7.start();
    }
}

class MyPriority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}
