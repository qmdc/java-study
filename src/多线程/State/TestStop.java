package 多线程.State;

public class TestStop implements Runnable{
    private Boolean flag=true;

    @Override
    public void run() {
        int i=0;
        while(flag){
            System.out.println("线程正在运行中"+i++);
        }
    }

    //定义一个停止线程的方法
    public void Stop(){
        this.flag=false;
        System.out.println("线程就此终结");
    }

    public static void main(String[] args) {
        TestStop testStop=new TestStop();
        new Thread(testStop).start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("陪伴线程"+i);
            if (i==900) {
                testStop.Stop();
            }
        }
    }
}
