package 异常及IO;

import java.io.File;
//删除文件
public class deleteJPG {
    public static void main(String[] args) {
        File file = new File("/Users/ppsn/Documents/Java-learning/src/异常及IO/image/5.jpg");
        if (file.isFile() && file.exists()) {
            boolean delete = file.delete();
            System.out.println(delete);
        }
    }
}
