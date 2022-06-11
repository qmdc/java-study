package 网络编程.chat;

public class TalkTeacher {
    public static void main(String[] args) {
        //开启两个线程
        new Thread(new TalkSend("localhost",8834)).start();
        new Thread(new TalkReceive("学生",5678)).start();
    }
}
