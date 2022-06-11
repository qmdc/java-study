package 设计模式.适配器模式;

public class Adater02 implements NetToUsb{
    NetworkCable networkCable;
    public Adater02(NetworkCable networkCable){
        this.networkCable=networkCable;
    }

    @Override
    public void getCable() {
        networkCable.getNet();
    }
}
