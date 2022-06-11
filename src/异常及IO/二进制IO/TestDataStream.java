package 异常及IO.二进制IO;

import java.io.*;

public class TestDataStream {
    public static void main(String[] args)throws IOException {
        try {
            try (DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.dat"));) {
                output.writeUTF("张浩男");
                output.writeDouble(99.6);
                output.writeUTF("马化腾");
                output.writeInt(97);
            }
            try (DataInputStream input = new DataInputStream(new FileInputStream("temp.dat"));) {
                System.out.println(input.readUTF() + " " + input.readDouble());
                System.out.println(input.readUTF() + " " + input.readInt());
                System.out.println(input.readUTF() + " " + input.readInt());//异常处理处，已到达文档末尾
            }
        }catch(EOFException ex){
            System.out.println("All data were read");
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
