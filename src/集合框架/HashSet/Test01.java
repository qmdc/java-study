package 集合框架.HashSet;

import java.util.HashSet;

/*
HashSet 基于 HashMap 来实现的，是一个不允许有重复元素的无序集合。
HashSet 允许有 null 值。
HashSet 是无序的，即不会记录插入的顺序。
HashSet 不是线程安全的， 如果多个线程尝试同时修改 HashSet，则最终结果是不确定的。 您必须在多线程访问时显式同步对 HashSet 的并发访问。
HashSet 实现了 Set 接口。
 */
//HashSet 中的元素实际上是对象，一些常见的基本类型可以使用它的包装类。
public class Test01 {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("konan");
        sites.add("konan1");
        sites.add("konan2");
        sites.add("konan3");
        sites.add("konan4");
        sites.add("konan");//重复的元素不会被添加
        System.out.println(sites);
        System.out.println(sites.contains("konan3"));//判断元素是否在集合中
        sites.remove("konan4");  // 删除元素，删除成功返回 true，否则为 false
        System.out.println(sites);
        System.out.println(sites.size());//计算大小
        for (String i : sites) {//迭代HashSet
            System.out.println(i);
        }
        sites.clear();//删除集合的所有元素
        System.out.println(sites);
    }
}
