package 注解和反射.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//获取类运行时的结构
public class Test06 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class c1 = Class.forName("注解和反射.反射.User");

        //***************获得类的名字**************
        System.out.println("=============================================================");
        System.out.println(c1.getName());//类名+包名
        System.out.println(c1.getSimpleName());//类名

        //****************获得类的属性****************
        System.out.println("=============================================================");
        Field[] fields = c1.getFields();//只能找到public属性
        System.out.println(fields);
        Field[] field = c1.getDeclaredFields();//找到全部属性
        for (Field field1 : field) {
            System.out.println(field1);
        }

        //获取指定的属性
        Field name = c1.getDeclaredField("name");
        System.out.println(name);

        //*****************获得类的方法****************
        System.out.println("=============================================================");
        Method[] method = c1.getMethods();//获得本类及其父类的全部public方法
        for (Method method1 : method) {
            System.out.println("正常的"+method1);
        }

        Method[] declaredMethods = c1.getDeclaredMethods();//获得本类的所有方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println("getDeclaredMethods"+declaredMethod);
        }

        //获得指定的方法
        //有第二个参数是因为涉及重载
        Method getName = c1.getMethod("getName", null);
        Method setName = c1.getMethod("setName", String.class);
        System.out.println(getName);
        System.out.println(setName);

        //获得构造器
        System.out.println("=============================================================");
        Constructor[] constructor = c1.getConstructors();
        for (Constructor constructor1 : constructor) {
            System.out.println(constructor1);
        }
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("#"+declaredConstructor);
        }

        //获得指定构造器
        Constructor constructor1 = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println("指定"+constructor1);
    }
}
