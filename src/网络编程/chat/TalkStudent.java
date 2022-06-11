package 网络编程.chat;

public class TalkStudent {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend("localhost",5678)).start();
        new Thread(new TalkReceive("老师",8834)).start();
    }
}
