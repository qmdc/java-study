package 网络编程.konan03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//不需要连接服务器
public class UdpClientDemo01 {
    public static void main(String[] args) throws Exception {
        //1、建立一个Socket
        DatagramSocket socket=new DatagramSocket();

        //2、建立包
        String msg="你好，服务器！";
        InetAddress localhost=InetAddress.getByName("localhost");
        int port=9090;

        //数据，数据的起始长度，要发送给谁
        DatagramPacket packet=new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);

        //3、发送包
        socket.send(packet);

        //4、关闭流
        socket.close();
    }
}
