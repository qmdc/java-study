package 注解和反射.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获得class对象
        Class c1 = Class.forName("注解和反射.反射.User");

        //构造一个对象(本质是调用了类的无参数构造器)
        User user = (User) c1.newInstance();//.newInstance()使用.getDeclaredConstructor().newInstance()替代,见下面👇
        System.out.println(user);

        //通过构造器创建对象
        Constructor constructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) constructor.newInstance("konan", 187, 18);
        System.out.println(user2);

        //通过反射调用普通方法
        Constructor constructor1 = c1.getDeclaredConstructor();
        User user3 = (User) constructor1.newInstance();
        Method setName = c1.getDeclaredMethod("setName", String.class);//通过反射获取一个方法
        setName.invoke(user3,"PPSN");//invoke:激活的意思(对象,"方法的值"）
        System.out.println(user3.getName());

        //通过反射操作属性
        Constructor constructor2=c1.getDeclaredConstructor();
        User user4 = (User) constructor2.newInstance();
        Field name = c1.getDeclaredField("name");
        name.setAccessible(true);//不能直接操作私有属性，需要关闭程序的安全检测，属性或方法的setAccessible(true)为关闭检测，默认为false
        name.set(user4,"18");
        System.out.println(user4.getName());



    }
}
