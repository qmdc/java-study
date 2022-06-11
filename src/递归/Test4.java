package 递归;//回文判断
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println("i is "+fac(s));
    }
    public static boolean fac(String s){
        if(s.length()==0)
            return true;
        else if(s.charAt(0)!=s.charAt(s.length()-1))
            return false;
        else
            return fac(s.substring(1,s.length()-1));
    }
}
