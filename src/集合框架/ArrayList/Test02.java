package 集合框架.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Taobao");
        sites.add("Wiki");
        sites.add("Runoob");
        sites.add("Weibo");
        sites.add("Google");
        sites.add("baidu");
        Collections.sort(sites);  // 字母排序，降序
        for (String i : sites) {
            System.out.println(i);
        }
    }
}