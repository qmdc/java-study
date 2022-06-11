package 集合框架.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

//迭代器
public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        //获取迭代器
        Iterator<String> it =sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());

        //输出所有元素
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        Iterator<Integer> it0=numbers.iterator();
        while (it0.hasNext()) {
            Integer i=it0.next();
            if(i<10){
                it0.remove();// 删除小于 10 的元素
            }
        }
        System.out.println(numbers);
    }
}
