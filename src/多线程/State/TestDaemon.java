package 多线程.State;

public class TestDaemon {
    public static void main(String[] args) {
        You you=new You();
        God god=new God();

        //守护线程
        Thread thread=new Thread(god);
        thread.setDaemon(true);//默认是false表示用户线程，默认的都是用户线程...
        thread.start();

        //用户线程
        new Thread(you).start();
    }
}

class God implements Runnable{
    @Override
    public void run() {
        while (true) {
            System.out.println("上帝守护着你");
        }
    }
}

class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("hello world! 第 "+i+" 天");
        }
    }
}
