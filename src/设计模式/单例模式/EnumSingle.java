package 设计模式.单例模式;

import java.lang.reflect.Constructor;

public enum EnumSingle {
    INSTANCE;

    public EnumSingle getInstance() {
        return  INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws Exception {
        EnumSingle enumSingle1=EnumSingle.INSTANCE;
        Constructor<EnumSingle> constructor = EnumSingle.class.getDeclaredConstructor(String.class,int.class);
        constructor.setAccessible(true);
        EnumSingle enumSingle2=EnumSingle.INSTANCE;

        System.out.println(enumSingle1.hashCode());
        System.out.println(enumSingle2.hashCode());
    }
}

