package 设计模式.桥接模式;

//抽象的电脑类型
public abstract class Computer {

    //电脑组合品牌
    protected Brand brand;

    public Computer(Brand brand) {
        this.brand=brand;
    }

    public void info() {
        brand.info();//自带品牌
    }
}

