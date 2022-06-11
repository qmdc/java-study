package 多线程.syn;

import java.util.concurrent.CopyOnWriteArrayList;

//测试JUC安全类型集合
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(list.size());
    }
}
