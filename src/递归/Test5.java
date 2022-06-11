package 递归;//回文判断
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println("i is "+fac(s));
    }
    public static boolean fac(String s){
        return fac(s,0,s.length()-1);
    }

    private static boolean fac(String s,int low,int high){
        if(high<=low)
            return true;
        else if(s.charAt(low)!=s.charAt(high))
            return false;
        else
            return fac(s,low+1,high-1);
    }
}
