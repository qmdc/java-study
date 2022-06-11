package 接口.three;

public interface Inter {
    void show(); //抽象方法

    default void method() { //默认方法
        System.out.println("默认方法被实现了");    }

    static void test(){ //静态方法
        System.out.println("静态方法被实现了");    }
}
