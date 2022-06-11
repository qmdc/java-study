package 接口.three;

 class Interlmpl implements Inter {
    @Override
    public void show() {
        System.out.println("show方法");    }
}

//定义测试类

public class InterDemo {
    public static void main(String[] args) {
        Inter i = new Interlmpl();
        i.show();        //抽象方法强制被重写
        i.method();      //默认方法不强制被重写，但可以被重写，重写时去掉default关键字
        Inter.test();   //静态方法只能通过接口名调用,不能通过实现类名或者对象名调用
    }
}