package 测试;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpUrl {
    public static void main(String[] args) throws IOException {
        //创建url对象
        URL url = new URL("https://myip.ipip.net");
        //用Scanner对象来接收
        Scanner scanner = new Scanner(url.openStream());
        StringBuilder builder = new StringBuilder();
        while (scanner.hasNext()) {
            String next = scanner.nextLine();
            builder.append(next);
        }
        //这是我们爬取到的信息
        String s = builder.toString();

        /*
         以下到是对获取到的字符串的处理
         当然肯定有更好的办法，我这里只是做一个演示
         */

        int i = s.indexOf("：");
        int j=s.lastIndexOf(".");
        int e = 0;
        //动态获取当前的ip地址的最后一位下标
        for (int k = j+2; k <= j+3; k++) {
            if (!isNum(String.valueOf(s.charAt(k)))) {
                e=k;
                break;
            }
        }
        System.out.println(s.substring(i+1,e));    //IP地址

        int i1 = s.lastIndexOf("：");
        int i2=s.lastIndexOf("  ");
        String substring = s.substring(i1+1,i2);
        String[] s1 = substring.split(" ");    //地址信息，这里放在了一个数组中
        for (String s2 : s1) {
            System.out.println(s2);
        }

        int i3=s.lastIndexOf("  ");
        System.out.println(s.substring(i3+2));    //当前的网络营业商

    }

    //用正则表达式来判断当前的字符是不是数字
    public static boolean isNum(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        return isNum.matches();
    }
}