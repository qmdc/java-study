package 多线程.State;

import 多线程.konan01.TestThread04;

public class TestSleep implements Runnable{

    private int tacit=10;//票数

    @Override
    public void run() {
        while (true) {
            if (tacit<=0) {
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"拿到了第"+tacit--+"张票");
        }
    }

    public static void main(String[] args) {
        TestThread04 thread=new TestThread04();

        new Thread(thread,"小明").start();
        new Thread(thread,"小红").start();
        new Thread(thread,"黄牛党").start();
    }
}
