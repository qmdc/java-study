package 递归;//x的n次方
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int n=input.nextInt();
        System.out.println("x的n次方 is "+fac(x,n));
    }
    public static long fac(int x,int n){
        if(n==0)
            return 1;
        else{
            return x*fac(x,n-1);
        }
    }
}
