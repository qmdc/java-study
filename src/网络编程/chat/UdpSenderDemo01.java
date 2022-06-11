package 网络编程.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;


public class UdpSenderDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket(4888);
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//从控制台读取数据

            String data=reader.readLine();
            byte[] datas=data.getBytes();
            DatagramPacket packet=new DatagramPacket(datas,0,datas.length,new InetSocketAddress("localhost",4855));

            socket.send(packet);
            if (data.equals("bye")) {
                break;
            }
        }

        socket.close();
    }
}
