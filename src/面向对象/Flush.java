package 面向对象;

import java.io.PrintWriter;

public class Flush {
    public static void main(String[] ars) throws Exception {
        System.out.println("hello");
        PrintWriter writer = new PrintWriter(System.out);
        writer.println("writer start");
      writer.flush();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        writer.println("writer close");
        writer.close();
    }
}