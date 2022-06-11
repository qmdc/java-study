package 设计模式.工厂模式.抽象工厂模式;

//用户
public class client {
    public static void main(String[] args) {
        System.out.println("===============小米系列功能===============");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.phoneProduct();
        iphoneProduct.start();
        iphoneProduct.sendSMS();

        System.out.println("===============华为系列功能===============");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IRouterProduct iRouterProduct = huaweiFactory.RouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.setting();
    }
}
