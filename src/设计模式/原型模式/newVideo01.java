package 设计模式.原型模式;

import java.util.Date;

//深浅克隆重写的clone方法不一样
public class newVideo01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        Video v1 = new Video("65001",date);
        Video v2 = (Video) v1.clone();

        System.out.println(v1);
        System.out.println(v1.hashCode());
        System.out.println(v2);
        System.out.println(v2.hashCode());

        System.out.println("=========================");
//        date.setTime(7395273);
        v1.setId("37768");
        v1.setCreateDate(new Date(34271765));


        System.out.println(v1);
        System.out.println(v1.hashCode());
        System.out.println(v2);
        System.out.println(v2.hashCode());
    }
}
