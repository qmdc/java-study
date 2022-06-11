package 异常及IO.二进制IO;

import java.io.*;

public class TestFileStream {
    public static void main(String[] args)throws IOException {
        try(FileOutputStream output=new FileOutputStream("temp.dat");){
            for(int i=0;i<10;i++){
                output.write(i);
            }
        }
        try(FileInputStream input=new FileInputStream("temp.dat");){
            int i;
            while((i=input.read())!=-1)
                System.out.print(i+" ");
            }
        }
    }
