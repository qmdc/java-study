package 设计模式.桥接模式;

public class Test {
    public static void main(String[] args) {
        //苹果笔记本
        Laptop laptop = new Laptop(new Apple());
        laptop.info();

        //联想台式机
        Desktop desktop = new Desktop(new Lenovo());
        desktop.info();
    }
}
