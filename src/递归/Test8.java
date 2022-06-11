package 递归;//获取文件大小

import java.util.Scanner;
import java.io.File;
public class Test8 {
    public static void main(String[] args) {
        System.out.println("请输入文件目录：");
        Scanner input=new Scanner(System.in );
        String path=input.nextLine();
        System.out.println(getSize(new File(path)));
    }
    public static long getSize(File file){
        long size=0;
        if (file.isDirectory()) {
            File[] files=file.listFiles();
            for(int i=0;file!=null&&i<files.length;i++){
                size+=getSize(files[i]);
            }
        }
        else{
            size+=file.length();
        }
        return size;
    }
}
