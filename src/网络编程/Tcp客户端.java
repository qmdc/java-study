package 网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class Tcp客户端 {
    public static void main(String[] args) {
        InetAddress serverIP=null;
        Socket socket=null;
        OutputStream os=null;

        try{
            serverIP=InetAddress.getByName("localhost");
            System.out.println(serverIP);
            socket=new Socket("192.168.0.108",9921);
            os=socket.getOutputStream();
            os.write("庞嘉明在吗？".getBytes());
            System.out.println("发送成功");

        }catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                if (os !=null) {
                    os.close();
                }
                if(socket!=null){
                    socket.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
