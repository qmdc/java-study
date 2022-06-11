package 设计模式.工厂模式.简单工厂模式;

public class Test {
    public static void main(String[] args) {
//        Apple apple = new Apple();
//        Banana banana = new Banana();
//        apple.name();
//        banana.name();
        Fruits apple = FruitFactory.getFruit("苹果");
        apple.name();
        FruitFactory.getFruit("香蕉").name();

        FruitFactory.getApple().name();
        FruitFactory.getBanan().name();
    }
}
