package 设计模式.建造者模式;

//抽象的建造者：方法
public abstract class Builder {
    abstract void builderA();//地基
    abstract void builderB();//钢筋水泥
    abstract void builderC();//线缆
    abstract void builderD();//粉刷

    abstract Product getProduct();//完工
}
