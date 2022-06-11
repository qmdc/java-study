package 递归;//2的n次方
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println("i is "+fac(2,n));
    }
    public static long fac(int i,int n){
        if(n==0)
            return 1;
        else{
            return 2*fac(2,n-1);
        }
    }
}
