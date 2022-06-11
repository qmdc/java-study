package 设计模式.单例模式;

//静态内部类
public class Holder {
    public Holder() {
    }

    public Holder getHolder() {
        return InnerClass.holder;
    }

    public static class InnerClass{
        private static final Holder holder=new Holder();
    }
}
