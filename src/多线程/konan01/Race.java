package 多线程.konan01;

public class Race implements Runnable{
    private String winner;
    private String name;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            if (Thread.currentThread().getName().equals("兔子🐰")&&i%10==0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Boolean fun=gameOver(i);
            if (fun) {
                break;
            }
            name=Thread.currentThread().getName();
            System.out.println(name+"跑了"+i+"步");
        }
    }
    public Boolean gameOver(int steps){
        if(winner!=null){
            System.out.println("已经有赢家了");
            return true;
        }{
            if (steps>=100) {
                winner=Thread.currentThread().getName();
                System.out.println(winner+"赢了！！");
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race thread=new Race();
        new Thread(thread,"兔子🐰").start();
        new Thread(thread,"乌龟🐢").start();
    }
}
