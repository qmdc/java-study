package 时间和日期;

import  java.util.*;
import java.text.*;

public class DateDemo3 {
    public static void main(String[] args) {

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));
    }
}
