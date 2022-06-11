package 注解和反射.反射;

import java.lang.annotation.ElementType;

//所有类型的class类
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = String[][].class;
        Class c5 = Override.class;
        Class c6 = ElementType.class;
        Class c7 = void.class;
        Class c8 = Integer.class;
        Class c9 = Class.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //只要元素类型于维度一样，就是一个class
        int[] a=new int[10];
        int[] b=new int[90];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());
    }
}
