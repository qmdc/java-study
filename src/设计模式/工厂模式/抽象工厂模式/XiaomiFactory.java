package 设计模式.工厂模式.抽象工厂模式;

//小米工厂，生产手机和路由器
public class XiaomiFactory implements IProductFactory{
    @Override
    public IphoneProduct phoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct RouterProduct() {
        return new XiaomiRouter();
    }
}
