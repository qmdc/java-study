package 注解和反射.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//性能检测
public class Test08 {
    public static void Test01(){
        User user=new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            user.getName();
        }
        for (int i = 0; i < 2000000000; i++) {
            user.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行10亿次"+(endTime-startTime)+"ms");
    }

    public static void Test02(){
        User user=new User();
        Class c1=user.getClass();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            c1.getName();
        }
        for (int i = 0; i < 2000000000; i++) {
            c1.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过反射执行10亿次"+(endTime-startTime)+"ms");
    }

    public static void Test03() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        User user=new User();
        Class c1=user.getClass();
        Method name = c1.getDeclaredMethod("getName", null);
        name.setAccessible(true);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000000; i++) {
            c1.getName();
        }
        for (int i = 0; i < 2000000000; i++) {
            c1.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("（关闭检测）通过反射执行10亿次"+(endTime-startTime)+"ms");
    }

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Test01();
        Test02();
        Test03();
    }

}
