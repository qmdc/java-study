package 设计模式.建造者模式.Demo;

public abstract class Builder {
    abstract Builder builderA(String msg);//汉堡
    abstract Builder builderB(String msg);//可乐
    abstract Builder builderC(String msg);//甜点
    abstract Builder builderD(String msg);//薯片

    abstract Product getProduct();
}
