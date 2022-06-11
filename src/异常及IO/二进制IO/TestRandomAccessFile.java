package 异常及IO.二进制IO;
import java.io.*;

public class TestRandomAccessFile {
    public static void main(String[] args)throws IOException,InterruptedException{
        Thread.sleep((int)(1+Math.random()*9000));
        try(RandomAccessFile inout=new RandomAccessFile("inout.dat","rw");){
            inout.setLength(0);
            for(int i=0;i<200;i++)
                inout.writeInt(i);
            System.out.println("初始化长度"+inout.length());
            inout.seek(0);
            System.out.println("一："+inout.readInt());
            inout.seek(1*4);
            System.out.println("二："+inout.readInt());
            inout.seek(9*4);
            System.out.println("三："+inout.readInt());
            inout.writeInt(555);
            inout.seek(inout.length());
            inout.writeInt(999);
            System.out.println("此时长度："+inout.length());
            inout.seek(10*4);
            System.out.println("四："+inout.readInt());
        }
    }
}
