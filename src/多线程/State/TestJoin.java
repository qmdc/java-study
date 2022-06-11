package 多线程.State;

public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println("join..."+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin testJoin=new TestJoin();
        Thread thread=new Thread(testJoin);
        thread.start();

        //主线程
        for (int i = 0; i < 200; i++) {
            System.out.println("main..."+i);
            if (i==100) {
                thread.join();//main线程阻塞,最后在执行main线程
            }
        }
    }
}
