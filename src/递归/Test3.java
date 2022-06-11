package 递归;//斐波那契
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("兔子的数量是 "+fac(n));
    }
    public static long fac(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fac(n-1)+fac(n-2);
    }
}
