package 多线程.konan01;

public class TestThread01 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程

        //创建一个线程对象
        TestThread01 testThread01=new TestThread01();

        //调用start方法开启线程
        testThread01.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("我在看java代码"+i);
        }
    }
}
