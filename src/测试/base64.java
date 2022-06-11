package 测试;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class base64 {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = null;
        try {
            Base64.Encoder encoder = Base64.getEncoder();

            inputStream = new FileInputStream("/Users/ppsn/Documents/Java-learning/src/测试/1.png");

            int available = inputStream.available();
            byte[] bytes = new byte[available];
            inputStream.read(bytes);

            String base64Str = encoder.encodeToString(bytes);
            System.out.println("=====>"+base64Str);

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            inputStream.close();
        }

    }
}
