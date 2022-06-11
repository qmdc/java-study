package 面向对象.JVM;

import java.util.Arrays;

public class Memory {
    public static void main(String[] args) {
        //返回JVM试图使用的最大内存-->1/4
        long maxMemory = Runtime.getRuntime().maxMemory();
        //返回JVM初始化时的内存-->1/64
        long totalMemory = Runtime.getRuntime().totalMemory();

        System.out.println("字节"+maxMemory+" 内存"+maxMemory/(double)1024/1024+"MB");
        System.out.println("字节"+totalMemory+" 内存"+totalMemory/(double)1024/1024+"MB");

        //内存调优
        //-Xms1024m -Xms1024m -XX:+PrintGCDetails
        System.out.println(Arrays.toString(args));
    }
}
