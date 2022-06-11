package 集合框架.LinkedList;

import java.util.LinkedList;

public class Test02 {
    public static void main(String[] args) {
        LinkedList<String> sites = new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");

        sites.add(1,"konan");//在指定位置添加元素

        System.out.println(sites.get(1));//返回指定位置的元素

        sites.set(1,"コナン");//设置指定位置的元素值

        System.out.println(sites.contains("konan"));//判断是否含有某一元素

        sites.remove("konan");//删除指定元素

        sites.remove(1);//删除指定位置元素

        for(String element:sites){
            System.out.println(element);
        }

        Object[] strings=sites.toArray();//返回一个由链表元素组成的数组

        for(Object element:strings){
            System.out.println(element);
        }

        sites.clear();//清空链表

        for(String element:sites){
            System.out.println(element);
        }
    }
}
