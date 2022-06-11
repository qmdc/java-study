package 设计模式.工厂模式.抽象工厂模式;

//华为工厂，生产手机和路由器
public class HuaweiFactory implements IProductFactory{
    @Override
    public IphoneProduct phoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct RouterProduct() {
        return new HuaweiRouter();
    }
}
