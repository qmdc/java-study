package 面向对象.JVM;

import java.util.ArrayList;

//-Xms设置初始内存分配大小 默认为1/64————256m
//-Xms设置最大内存分配大小 默认为1/4————4GB
//-Xms1m -Xmx2m -XX:+PrintGCDetails //打印GC垃圾回收信息
//-Xms1m -Xmx2m -XX:+HeapDumpOnOutOfMemoryError  //OOM Dump

//使用JProfiler分析堆内存
public class Jprofiler {
    byte[] array = new byte[1*1024*1024];//1m
    public static void main(String[] args) {
        ArrayList<Jprofiler> list = new ArrayList<>();
        int  count = 0;
        try {
            while (true) {
                list.add(new Jprofiler());
                count++;
            }
        }catch (Error e){
            System.out.println(count);
            e.printStackTrace();
        }
    }
}
