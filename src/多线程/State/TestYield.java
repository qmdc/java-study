package 多线程.State;

public class TestYield {
    public static void main(String[] args) {
        Yield yield=new Yield();
        new Thread(yield,"A").start();
        new Thread(yield,"B").start();
    }
}

class Yield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程正在执行");
        Thread.yield();//线程礼让,可能会不成功
        System.out.println(Thread.currentThread().getName()+"线程正在停止！");
    }
}
