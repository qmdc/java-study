package 多线程.State;

import java.text.SimpleDateFormat;
import java.util.Date;

//打印系统当前时间
public class TestSleep3 {
    public static void main(String[] args) {
        Date date = new Date(System.currentTimeMillis());
        int i=0;
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(date));
                date=new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if (i==10) {
                break;
            }
        }
    }
}
