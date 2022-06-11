package 设计模式.适配器模式;

//适配器
public class Adater extends NetworkCable implements NetToUsb{
    @Override
    public void getCable() {
        super.getNet();
    }
}
