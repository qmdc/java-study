package 网络编程.聊天室;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
//服务端
//注意：一定要先启动服务端，再启动客户端，不然会造成数据丢失
public class server extends JFrame implements ActionListener, KeyListener {
    public static void main(String[] args) {
        //调用构造方法
        new server();

    }
    //文本域
    private JTextArea jta;
    //滚动条
    private JScrollPane jsp;
    //面板
    private JPanel jp;
    //文本框
    private JTextField jtf;
    //按钮
    private JButton jb;
    //输出流
    private BufferedWriter bw=null;

    //构造方法

    public server(){
        //初始化组件
        jta=new JTextArea();
        //设置文本域不可编辑
        jta.setEditable(false);
        //将文本域添加到滚动条中，实现滚动效果
        jsp=new JScrollPane(jta);
        //面板
        jp=new JPanel();
        jtf=new JTextField(10);
        jb=new JButton("发送");
        //将文本框和按钮添加到面板中
        jp.add(jtf);
        jp.add(jb);

        //将滚动条和面板都添加到窗体中
        this.add(jsp, BorderLayout.CENTER);
        this.add(jp,BorderLayout.SOUTH);
        this.setTitle("QQ聊天服务端");
        this.setSize(300,300);
        this.setLocation(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//设置组件显示

        //TCP服务端
        //给发送按钮绑定一个监听点击事件
        jb.addActionListener(this);
        //给文本框绑定一个键盘点击事件
        jtf.addKeyListener(this);
        try{
            //创建一个服务端的套接字
            ServerSocket serverSocket=new ServerSocket(8888);
            //等待客户端的连接
            Socket socket=serverSocket.accept();
            //获取Socket通道的输入流
            //InputStream in=socket.getInputStream();
            BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取Socket通道的输出流
            bw=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            //读取数据
            String Line=null;
            while ((Line=br.readLine())!=null){
                jta.append(Line+System.lineSeparator());//拼接后换行
            }
            //关闭serverSocket通道
            serverSocket.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //调用发送数据的方法
        data();
    }
    //行为
    @Override
    public void keyPressed(KeyEvent e) {
        //判断是否是回车键
        if(e.getKeyCode()==KeyEvent.VK_ENTER);{
            //发送数据到Socket管道中
            data();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
    //定义一个方法，实现发送数据到Socket管道中
    private void data(){
        //获取文本框中的内容
        String text=jtf.getText();
        //拼接需要发送的内容
        text=this.getTitle()+": "+text;//获取发送人的名字和内容
        //发送
        try {
            bw.write(text);
            bw.newLine();//换行
            bw.flush();//刷新
            //发送完后，文本框内应没有内容
            jtf.setText(null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


