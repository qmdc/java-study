package 网络编程.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalkReceive implements Runnable {
    DatagramSocket socket = null;
    private int Port;
    private String msgFrom;

    public TalkReceive(String msgFrom,int port) {
        this.msgFrom=msgFrom;
        this.Port=port;
        try {
            socket = new DatagramSocket(Port);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                //准备接收
                byte[] data=new byte[1024];
                DatagramPacket packet = new DatagramPacket(data, 0, data.length);
                socket.receive(packet);

                int k=0;
                for (byte dataum : data) {
                    if (dataum != (byte) 0) {
                        k++;
                    }
                }

                //断开连接
                byte[] datas=packet.getData();
                String receivedata=new String(datas,0,k);

                System.out.println(msgFrom+":"+receivedata);

                if(receivedata.equals("bye")){
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        socket.close();
    }
}
