package 设计模式.建造者模式.Demo;

public class Test {
    public static void main(String[] args) {
        Worker worker = new Worker();
        //链式编程：在原来基础上，可以自由组合，如果不组合，也有默认套餐
        Product product = worker.builderA("全家桶").builderB("雪碧").getProduct();
        System.out.println(product.toString());
    }
}
