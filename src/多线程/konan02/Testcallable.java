package 多线程.konan02;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.net.URL;
import java.util.concurrent.*;

public class Testcallable implements Callable<Boolean> {
    private String url;
    public String name;

    public Testcallable(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public Boolean call() throws Exception {
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为："+name);
        return true;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Testcallable t1 = new Testcallable("https://imglf4.lf127.net/img/fb33de6b9822905f/dllheWhOcWZhVzZoYURoU0hjQWI4S3hkaXVoWXg2bWhUWnUvZzdXTWJsZz0.jpg?imageView&thumbnail=1680x0&quality=96&stripmeta=0&type=jpg", "1.jpg");
        Testcallable t2 = new Testcallable("https://imglf6.lf127.net/img/5043c15c8a7a7f0f/T1B1c2RyY0l3SzBKTnJhOFpDeENmRGo1NitaWjFPQmt2K0IvZTl3b1p6OD0.png?imageView&thumbnail=1680x0&quality=96&stripmeta=0", "2.jpg");
        Testcallable t3 = new Testcallable("https://imglf5.lf127.net/img/8c168353b81440ab/alhLaUw4aG9TZTc1eFY5VVZLRDVSMG1BT2V5WTNnTWhJVmJFQmI5Ym5CQT0.jpg?imageView&thumbnail=1680x0&quality=96&stripmeta=0&type=jpg", "3.jpg");
        //创建执行服务
        ExecutorService ser = Executors.newFixedThreadPool(3);

        //提交执行
        Future<Boolean> r1=ser.submit(t1);
        Future<Boolean> r2=ser.submit(t2);
        Future<Boolean> r3=ser.submit(t3);

        //获取结果
        boolean rs1=r1.get();
        boolean rs2=r2.get();
        boolean rs3=r3.get();

        System.out.println(rs1);
        System.out.println(rs2);
        System.out.println(rs3);
    }

    //下载器
    class WebDownloader {
        //下载方法
        public void downloader(String url, String name) {
            try {
                FileUtils.copyURLToFile(new URL(url), new File(name));
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("IO异常，downloader方法出现异常");
            }
        }
    }
}
