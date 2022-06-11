package 多线程.静态代理;

//真实对象和代理对象都要实现同一个接口
//代理对象要代理真实角色
public class StacticProxy {
    public static void main(String[] args) {
//        You you=new You();
        new Thread(()->System.out.println("我爱你！")).start();
//        WeddingCompany weddingCompany=new WeddingCompany(you);
//        weddingCompany.HappyMarry();
        new WeddingCompany(new You()).HappyMarry();
    }

}

interface Marry{
    void HappyMarry();
}

//真实角色
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("小明要结婚了，很开心！！");
    }
}

//代理角色
class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target){
        this.target=target;
    }

    @Override
    public void HappyMarry() {
        after();
        this.target.HappyMarry();
        before();
    }

    public void after(){
        System.out.println("结婚之前，布置现场");
    }
    public void before(){
        System.out.println("结婚之后，结尾款");
    }
}