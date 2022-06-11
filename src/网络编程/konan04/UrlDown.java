package 网络编程.konan04;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlDown {
    public static void main(String[] args) throws Exception {
        //1.下载地址
        URL url=new URL("https://p2.music.126.net/TsK8LcEDqIIU41ii7Clh9g==/109951166577876071.jpg?param=50y50");

        //2.连接到这个资源 HTTP
        HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();

        FileOutputStream fos=new FileOutputStream("/Users/ppsn/Downloads/文档/iiiiii.jpg");

        byte[] buffer=new byte[1024];
        int len;
        while ((len=inputStream.read(buffer))!=-1) {
            fos.write(buffer,0,len);//写入资源
        }

        fos.close();
        inputStream.close();
        urlConnection.disconnect();//断开连接

    }
}
