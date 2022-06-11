package 异常及IO.二进制IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class TestObjectStreamForArray {
    public static void main(String[] args)throws ClassNotFoundException, IOException{
        int[] numbers={1,2,3,4,5};
        String[] strings={"John","张浩男","Kim"};

        try(ObjectOutputStream output=new ObjectOutputStream(new
                FileOutputStream("src/异常及IO/二进制IO/array.dat",true));){
            output.writeObject(numbers);
            output.writeObject(strings);
        }

        try(ObjectInputStream input=new ObjectInputStream(new
                FileInputStream("src/异常及IO/二进制IO/array.dat"));){
            int[] newNumbers=(int[])(input.readObject());
            String[] newStrings=(String[])(input.readObject());
            for(int i=0;i<newNumbers.length;i++){
                System.out.print(newNumbers[i]+" ");
            }
            System.out.println();
            for(int i=0;i<newStrings.length;i++){
                System.out.print(newStrings[i]+" ");
            }
        }

    }
}
