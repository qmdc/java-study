package 注解和反射.反射;

//类加载器
/*
类加载的作用:将class文件字节码内容加载到內存中,并将这些静态数据转换成方法区的运行时数据结构,然后在堆中生成一个代表这个类的java.lang.Class对象,作为方法区中类数据的访问入口。
类缓存:标准的Javase类加载器可以按要求查找类,但一旦某个类被加载到类加载器中,它将维持加载(缓存)一段时间。不过JVM垃圾回收机制可以回收这些class对象
 */
public class Test05 {
    public static void main(String[] args) throws ClassNotFoundException {

        //获取系统的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统类加载器的父类加载器-->扩展加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展加载器的父类加载器-->根加载器（c/c++)
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //测试当前类是哪个加载器加载的
        ClassLoader classLoader = Class.forName("注解和反射.反射.Test05").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println(classLoader1);

        //获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
