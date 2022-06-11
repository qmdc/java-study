package 递归;//汉诺塔

import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        System.out.println("请输入盘子数： ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        hano(n,'A','B','C');
    }
    public static void hano(int n,char A,char B,char C){
        if(n==1){
            move(A,C);
        }
        else{
            hano(n-1,A,C,B);
            move(A,C);
            hano(n-1,B,A,C);
        }
    }
    public static void move(char q,char p){
        System.out.println("移动方向："+q+"->"+p);
    }
}
