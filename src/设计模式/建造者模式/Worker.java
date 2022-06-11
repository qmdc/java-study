package 设计模式.建造者模式;

//工人
public class Worker extends Builder{
    private Product product;

    public Worker(){
        product=new Product();
    }
    @Override
    void builderA() {
        product.setBuilderA("地基");
        System.out.println("地基");
    }

    @Override
    void builderB() {
        product.setBuilderB("钢筋水泥");
        System.out.println("钢筋水泥");
    }

    @Override
    void builderC() {
        product.setBuilderC("线缆");
        System.out.println("线缆");
    }

    @Override
    void builderD() {
        product.setBuilderD("粉刷");
        System.out.println("粉刷");
    }

    @Override
    Product getProduct() {
        return product;
    }
}
