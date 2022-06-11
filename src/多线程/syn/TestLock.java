package 多线程.syn;

import java.util.concurrent.locks.ReentrantLock;

//测试Lock锁🔒
//比synchronized更高效，JVM将花费较少的时间来调度线程
public class TestLock {
    public static void main(String[] args) {
        TestLock2 testLock2=new TestLock2();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
        new Thread(testLock2).start();
    }
}

class TestLock2 implements Runnable{
    int tickteNums=10;
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (tickteNums > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(tickteNums--);
                } else {
                    break;
                }
            }finally{
                lock.unlock();//释放锁
            }
        }
    }
}
