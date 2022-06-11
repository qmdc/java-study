package 集合框架.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {
    public static void main(String[] args) {
        ArrayList<String> sites=new ArrayList<>();

        //添加元素
        sites.add("张浩男");
        sites.add("konan");
        System.out.println(sites);

        //访问元素
        System.out.println(sites.get(1));

        //修改元素
        sites.set(0,"こなん");
        System.out.println(sites);

        //删除元素
        sites.remove(1);
        System.out.println(sites);

        //计算大小
        System.out.println(sites.size());

        //迭代数组列表1
        sites.add("こなん2");
        sites.add("こなん3");
        sites.add("こなん4");
        sites.add("こなん5");
        sites.add("こなん6");
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }

        //迭代数组列表2,for-each
        for(String array:sites){
            System.out.println(array);
        }

        Iterator<String> iterator = sites.iterator();
        System.out.println("迭代器");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
