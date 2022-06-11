package 网络编程.konan02;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClientDemoe02 { //客户端
    public static void main(String[] args)throws Exception{
        //1.建立连接
        Socket socket=new Socket(InetAddress.getByName("127.0.0.1"),1256);
        //2.建立一个输出流
        OutputStream os=socket.getOutputStream();
        //3.读取文件
        FileInputStream fos=new FileInputStream(new File("src/网络编程/花丛.JPG"));
        //4.写出文件
        byte[] buffer=new byte[1024];
        int len;
        while ((len=fos.read(buffer))!=-1) {
            os.write(buffer,0,len);
        }

        //通知服务器，我已经结束了
        socket.shutdownInput();

        //确定服务器接受完毕，才能够断开连接
        InputStream inputStream=socket.getInputStream();
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        byte[] buffer3=new byte[1024];
        int len3;
        while ((len3=inputStream.read(buffer3))!=-1) {
            baos.write(buffer3,0,len3);
        }
        System.out.println(buffer3.toString());

        //5.关闭资源
        fos.close();
        os.close();
        socket.close();
    }
}
