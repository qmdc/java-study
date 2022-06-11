package 多线程.State;

public class TestSleep2 {
    public static void main(String[] args) {
        try {
            Dowmss();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //倒计时打印
    public static void Dowmss() throws InterruptedException {
        for (int i = 10; i >0; i--) {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
