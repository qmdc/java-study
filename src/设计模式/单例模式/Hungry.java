package 设计模式.单例模式;

//饿汉式单例
public class Hungry {
    private byte[] buffer1=new byte[1024];
    private byte[] buffer2=new byte[1024];
    private byte[] buffer3=new byte[1024];
    private Hungry() {
    }

    private static final Hungry hungry=new Hungry();

    public Hungry getHungty() {
        return hungry;
    }
}
