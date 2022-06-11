package 设计模式.适配器模式;

public class Client02 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        NetworkCable networkCable = new NetworkCable();
        Adater02 apater02 = new Adater02(networkCable);

        computer.net(apater02);
    }
}
