package 多线程.konan01;

//创建线程方式2：实现Runnable接口，重写run方法，
public class TestThread03 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }

    public static void main(String[] args) {
        TestThread03 testThread03=new TestThread03();
        new Thread(testThread03).start();//创建线程对象，通过线程对象来开启我们的线程，代理
//        Thread thread = new Thread(testThread03);
//        thread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在看Java代码" + i);
        }
    }
}
