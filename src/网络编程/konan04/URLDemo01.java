package 网络编程.konan04;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo01 {
    public static void main(String[] args) throws MalformedURLException {
        Scanner input=null;
        long count = 0;
        String line;
        URL url=new URL("http://202.200.206.54/(jmudiv20me5fhsiorzdre445)/");

        System.out.println(url.getProtocol());//协议
        System.out.println(url.getHost());//主机IP
        System.out.println(url.getPort());//端口
        System.out.println(url.getPath());//文件
        System.out.println(url.getFile());//全路径
        System.out.println(url.getQuery());//参数

        try {
            input=new Scanner(url.openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        while(input.hasNext()){
           line= input.nextLine();
           count+=line.length();
        }
        System.out.println(count);
    }
}
