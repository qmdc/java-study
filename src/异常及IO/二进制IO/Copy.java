package 异常及IO.二进制IO;

import java.io.*;

public class Copy {
    //@param args[0] for source file
    //@param args[1] for target file
    public static void main(String[] args)throws IOException {
        if (args.length != 2) {
            System.out.println("文件没传够！");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0]);
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (!targetFile.exists()) {
            System.out.println("tarfer file " + args[1]);
            System.exit(3);
        }

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile));) {
            int r, number = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                number++;
            }
            System.out.println(number + " bytes copied");
        }
    }
}
