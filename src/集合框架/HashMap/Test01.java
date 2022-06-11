package 集合框架.HashMap;

import java.util.HashMap;

/*
HashMap 是一个散列表，它存储的内容是键值对(key-value)映射。
HashMap 实现了 Map 接口，根据键的 HashCode 值存储数据，具有很快的访问速度，最多允许一条记录的键为 null，不支持线程同步。
HashMap 是无序的，即不会记录插入的顺序。
HashMap 继承于AbstractMap，实现了 Map、Cloneable、java.io.Serializable 接口。
 */
public class Test01 {
    public static void main(String[] args) {
        HashMap<Integer,String> Sites=new HashMap<Integer,String>();
        // 添加键值对
        Sites.put(1, "Google");
        Sites.put(2, "Runoob");
        Sites.put(3, "Taobao");
        Sites.put(4, "Zhihu");
        System.out.println(Sites);
        System.out.println(Sites.get(3));//使用 get(key) 方法来获取 key 对应的 value
        Sites.remove(4);//删除元素
        System.out.println(Sites);

        // 输出 key 和 value
        for (Integer i : Sites.keySet()) {
            System.out.println("key: " + i + " value: " + Sites.get(i));
        }
        // 返回所有 value 值
        for(String value: Sites.values()) {
            // 输出每一个value
            System.out.print(value + ", ");
        }

        Sites.clear();//清空
        System.out.println(Sites);

        HashMap<String, String> Sites2 = new HashMap<String, String>();
        // 添加键值对
        Sites2.put("one", "Google");
        Sites2.put("two", "Runoob");
        Sites2.put("three", "Taobao");
        Sites2.put("four", "Zhihu");
        System.out.println(Sites2);
        System.out.println(Sites2.get("two"));//使用 get(key) 方法来获取 key 对应的 value
        Sites2.remove("four");//删除元素
        System.out.println(Sites2);
        System.out.println(Sites2.size());//计算大小
    }
}
