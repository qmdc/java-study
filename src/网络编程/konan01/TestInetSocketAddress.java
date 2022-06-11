package 网络编程.konan01;

import java.net.InetSocketAddress;

public class TestInetSocketAddress {
    public static void main(String[] args) {
        //端口
        InetSocketAddress socketAddress=new InetSocketAddress("127.0.0.1",8080);
        System.out.println(socketAddress);
        InetSocketAddress socketAddress2=new InetSocketAddress("localhost",8080);
        System.out.println(socketAddress2);

        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress.getPort());
    }
}
