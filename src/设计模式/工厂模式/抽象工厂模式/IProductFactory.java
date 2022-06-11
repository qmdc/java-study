package 设计模式.工厂模式.抽象工厂模式;

//生产手机和路由器接口
public interface IProductFactory {

    IphoneProduct phoneProduct();

    IRouterProduct RouterProduct();
}
