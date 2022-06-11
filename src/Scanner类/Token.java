package Scanner类;

import java.util.Scanner;
import java.util.StringTokenizer;

class Token {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数据：");
        StringTokenizer stringTokenizer=new StringTokenizer(scanner.nextLine());
        System.out.println("分隔后：");
        while(stringTokenizer.hasMoreTokens()){
            System.out.println(stringTokenizer.nextToken());
        }
    }
}

//通过StringTokenizer类可以分解输入的整行得到的带空格的字符串。默认情况下，StringTokenizer以空格，制表符，换行符和回车符作为分割依据。
