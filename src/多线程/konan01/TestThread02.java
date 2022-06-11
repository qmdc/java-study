package 多线程.konan01;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

//使用多线程同时下载多张图片
public class TestThread02 extends Thread{
    private String url;
    public String name;

    public TestThread02(String url,String name){
        this.url=url;
        this.name=name;
    }

    @Override
    public void run(){
        WebDownloader webDownloader=new WebDownloader();
        webDownloader.downloader(url,name);
        System.out.println("下载的文件名为："+name);
    }

    public static void main(String[] args) {
        TestThread02 t1=new TestThread02("https://imglf4.lf127.net/img/fb33de6b9822905f/dllheWhOcWZhVzZoYURoU0hjQWI4S3hkaXVoWXg2bWhUWnUvZzdXTWJsZz0.jpg?imageView&thumbnail=1680x0&quality=96&stripmeta=0&type=jpg","1.jpg");
        TestThread02 t2=new TestThread02("https://imglf6.lf127.net/img/5043c15c8a7a7f0f/T1B1c2RyY0l3SzBKTnJhOFpDeENmRGo1NitaWjFPQmt2K0IvZTl3b1p6OD0.png?imageView&thumbnail=1680x0&quality=96&stripmeta=0","2.jpg");
        TestThread02 t3=new TestThread02("https://imglf5.lf127.net/img/8c168353b81440ab/alhLaUw4aG9TZTc1eFY5VVZLRDVSMG1BT2V5WTNnTWhJVmJFQmI5Ym5CQT0.jpg?imageView&thumbnail=1680x0&quality=96&stripmeta=0&type=jpg","3.jpg");
        t1.start();
        t2.start();
        t3.start();
    }
}

//下载器
class WebDownloader{
    //下载方法
    public void downloader(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现异常");
        }
    }
}
