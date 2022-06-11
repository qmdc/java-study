package 多线程.syn;

//购票不安全
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket buyTicket=new BuyTicket();
        Thread t1 = new Thread(buyTicket,"me");
        Thread t2 = new Thread(buyTicket,"you");
        Thread t3 = new Thread(buyTicket,"黄牛党");

        t1.start();
        t2.start();
        t3.start();
    }
}

class BuyTicket implements Runnable{
    private int i=10;
    boolean flag=true;

    @Override
    public synchronized void run() {
        while (flag) {
            try {
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void buy() throws InterruptedException {
        if(i<=0){
            flag=false;
            return;
        }
        Thread.sleep(100);
        System.out.println(Thread.currentThread().getName()+"买到了第"+i--+"张票");
    }
}


