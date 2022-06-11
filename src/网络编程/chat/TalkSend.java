package 网络编程.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class TalkSend implements Runnable{
    DatagramSocket socket=null;
    BufferedReader reader =null;

    private String toIP;
    private int toPort;


    public TalkSend(String toIP,int toPort){
        this.toIP=toIP;
        this.toPort=toPort;

        try{
            socket=new DatagramSocket();
            reader = new BufferedReader(new InputStreamReader(System.in));//从控制台读取数据
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            try{
                String data=reader.readLine();
                byte[] datas=data.getBytes(StandardCharsets.UTF_8);
                DatagramPacket packet=new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toIP,this.toPort));

                socket.send(packet);
                if (data.equals("bye")) {
                    break;
                }
            }catch(Exception e){
                    e.printStackTrace();
            }
        }
        socket.close();
    }
}
