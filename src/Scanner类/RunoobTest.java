package Scanner类;
import java.util.Scanner;

public class RunoobTest {
    public static void main(String[] args) {
        System.out.println("输入数字：");
        Scanner input=new Scanner(System.in);
        Double i=0.0;
        int count=0;
        while(input.hasNextDouble()){
            Double x=input.nextDouble();
            count++;
            i+=x;
        }
        System.out.println("平均分是："+i/count);
        System.out.println("人数是"+count);
    }
}
