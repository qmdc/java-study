package 时间和日期;

import java.util.Calendar;

public class Test {     //Calender的月份是从0开始的，但日期和年份是从1开始的
    public static void main(String[] args) {
        Calendar c1 = Calendar.getInstance();
        c1.set(2017, 5, 6);
        System.out.println(c1.get(Calendar.YEAR)
                +"-"+c1.get(Calendar.MONTH)
                +"-"+c1.get(Calendar.DATE));
        c1.set(2017, 5, 0);
        System.out.println(c1.get(Calendar.YEAR)
                +"-"+c1.get(Calendar.MONTH)
                +"-"+c1.get(Calendar.DATE));
        c1.set(2017, 2, 0);
        System.out.println(c1.get(Calendar.YEAR)
                +"-"+c1.get(Calendar.MONTH)
                +"-"+c1.get(Calendar.DATE));
        c1.set(2017, 2, -10);
        System.out.println(c1.get(Calendar.YEAR)
                +"-"+c1.get(Calendar.MONTH)
                +"-"+c1.get(Calendar.DATE));
    }
}
