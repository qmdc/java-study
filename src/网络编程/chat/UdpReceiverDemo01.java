package 网络编程.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiverDemo01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(4855);
        while (true) {
            //准备接收
            byte[] data=new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, 0, data.length);
            socket.receive(packet);


            //断开连接
            byte[] datas=packet.getData();
            String receivedata=new String(datas,0,data.length);
            //System.out.println(new String(packet.getData(),0,packet.getLength()));

            System.out.println(packet);

            if(receivedata.equals("bye")){
                break;
            }
        }
        socket.close();
    }
}
