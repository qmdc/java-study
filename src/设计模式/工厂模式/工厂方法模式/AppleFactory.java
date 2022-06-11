package 设计模式.工厂模式.工厂方法模式;

public class AppleFactory implements FruitFactory{
    @Override
    public Fruits getFruit() {
        return new Apple();
    }
}
