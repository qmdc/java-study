package 异常及IO;
import java.util.Scanner;
public class URL1{
    public static void main(String[] args) throws Exception{
        System.out.print("输入：");
        String URLString=new Scanner(System.in).next();
        try{
            java.net.URL url=new java.net.URL(URLString);
            int count=0;
            Scanner input=new Scanner(url.openStream());
            while(input.hasNext()){
                String line=input.nextLine();
                count+=line.length();
            }
            System.out.println("长度是："+count);
        }
        catch(java.net.MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch(java.io.IOException ex){
            System.out.println("I/O Errors:no such file");
        }
    }
}
//Word Wide Web 万维网  www