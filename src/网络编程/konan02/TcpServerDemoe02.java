package 网络编程.konan02;

import java.io.*;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemoe02 { //服务端
    public static void main(String[] args)throws Exception {
        //1.创建服务
        ServerSocket serverSocket=new ServerSocket(1256);
        //2.监听客户端
        Socket socket=serverSocket.accept();
        //3.读取信息
        InputStream is=socket.getInputStream();

        //文件输出
        FileOutputStream fos=new FileOutputStream("src/网络编程/婚礼.JPG");
        byte[] buffer2=new byte[1024];
        int len2;
        while ((len2=is.read(buffer2))!=-1) {
            fos.write(buffer2,0,len2);
        }

        //通知客户端我已经接收完毕了
        OutputStream oss=socket.getOutputStream();
        oss.write("可以断开了".getBytes());

        //关闭资源
        fos.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
