package 设计模式.建造者模式;

//指挥：最核心
public class Director {

    public Product builder(Builder builder){
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
