package 设计模式.建造者模式;

//用户：拿到产品
public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.builder(new Worker());
        System.out.println(product.toString());
    }
}
