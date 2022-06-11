package 多线程.State;

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("/////");
        });

        //观察状态
        Thread.State state=thread.getState();
        System.out.println(state);//New

        //观察启动后
        thread.start();
        state=thread.getState();
        System.out.println(state);//Run

        while (state!=Thread.State.TERMINATED) {//只要线程不变，就一直输出状态
            Thread.sleep(100);
            state=thread.getState();//更新线程
            System.out.println(state);
        }

        thread.start();//线程死亡后不能再继续抛出
    }
}
