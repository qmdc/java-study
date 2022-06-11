package 设计模式.单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

//懒汉式单例
public class LazyMan {
    private static boolean flag=false;
    private LazyMan() {
        synchronized (LazyMan.class) {
            if (flag == false) {
                flag = true;
            } else {
                throw new RuntimeException("不要试图用反射破坏单例模式");
            }
        }
    }

    private static volatile LazyMan lazeman;

    //双重锁模式的懒汉式单例 DCL懒汉式
    private static LazyMan getLazyMan() {
        if (lazeman==null) {
            synchronized (LazyMan.class){
                if (lazeman==null) {
                    lazeman=new LazyMan();
                }
            }
        }
        return lazeman;
    }

    public static void main(String[] args) throws Exception {
        Field newflag = LazyMan.class.getDeclaredField("flag");
        newflag.setAccessible(true);
        //反射会破坏单例模式
        Constructor<LazyMan> constructor = LazyMan.class.getDeclaredConstructor(null);
        LazyMan lazyMan1 = constructor.newInstance();

        newflag.set(flag,false);

        LazyMan lazyMan2 = constructor.newInstance();
        constructor.setAccessible(true);
        System.out.println(lazyMan1.hashCode());
        System.out.println(lazyMan2.hashCode());
    }
}




/**new对象的过程：
 * 分配内存空间
 * 执行构造函数，初始化对象
 * 把对象执行内存空间
 * ==>可能会进行重排，使用volatile禁止进行指令重排序
 */