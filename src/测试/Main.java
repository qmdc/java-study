package 测试;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean conti=true;
        Scanner input = new Scanner(System.in);
        while (conti) {
            try {
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                if (number2==0) throw new ArithmeticException("除数不能为零");
                System.out.println(number1+"/"+number2+"is"+(number1/number2));
                conti=false;
            }catch(ArithmeticException ex){
                System.out.println(ex.getMessage());
                System.out.println("请重新输入");
            }

        }
    }
}
