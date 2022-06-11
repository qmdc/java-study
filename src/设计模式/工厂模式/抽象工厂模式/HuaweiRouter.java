package 设计模式.工厂模式.抽象工厂模式;

public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器打开");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("华为路由器设置密码");
    }
}
