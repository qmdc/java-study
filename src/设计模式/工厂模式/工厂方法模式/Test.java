package 设计模式.工厂模式.工厂方法模式;

public class Test {
    public static void main(String[] args) {
        new AppleFactory().getFruit().name();
        new BananFactory().getFruit().name();
    }
}
