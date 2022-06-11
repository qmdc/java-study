package 注解和反射.反射;

public class Test04 {
    static {
        System.out.println("main方法被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1.主动引用(发生类初始化）
//        Son son=new Son();

        //2.反射也会产生主动引用
//        Class.forName("注解和反射.反射.Son");

        //3.类的被动引用（不发生类的初始化）

//        System.out.println(Son.b);//当访问一个静态域时,只有真正声明这个域的类才会被初始化。如:当通过子类引用父类的静态变量,不会导致子类初始化

//        System.out.println(Son.M);//引用常量不会触发此类的初始化(常量在链接阶段就存人调用类的常量池中了

//        Son[] array=new Son[10];//通过数组定义类引用,不会触发此类的初始化

    }
}

class Father{
    static int b=2;

    static {
        System.out.println("父类被加载");

    }
}

class Son extends Father{

    static {
        System.out.println("子类被加载");
        m=300;
    }

    static int m=20;
    static final int M=100;

}

/*
    1,加载到内存,会产生一个类对应Cass对象
            2.链接,链接结束后m=0
            3.初始化
    <clinit>(){
                System.out, println("静态代码块初始化")
                m=300
                m=100
              }
*/

/*
    当虚拟机启动,先初始化main方法所在的类 new个类的对象
    调用类的静态成员(除了 final常量)和静态方法使用java.lang.reflec包的方法对类进行反射调用
    当初始化一个类,如果其父类没有被初始化,则先会初始化它的父类
 */