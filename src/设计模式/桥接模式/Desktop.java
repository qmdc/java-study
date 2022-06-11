package 设计模式.桥接模式;

//台式机
public class Desktop extends Computer{
    public Desktop(Brand brand){
        super(brand);
    }

    @Override
    public void info(){
        super.info();
        System.out.println("台式机");
    }
}
