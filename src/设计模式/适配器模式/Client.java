package 设计模式.适配器模式;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Adater apater = new Adater();

        computer.net(apater);
    }
}
