package 多线程.PC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPool {
    public static void main(String[] args) {
        //1.创建服务，创建线程池
        //newFixeddThreadPool 参数为：线程池大小
        ExecutorService service= Executors.newFixedThreadPool(10);

        //执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());

        //2.关闭连接
        service.shutdown();
    }
}

class MyThread implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
