package 异常及IO;

/**
 * 异常:
 * finally不一定被执行，，例如 catch 块中有退出系统的语句 System.exit(-1); finally就不会被执行
 * 在catch里面有一个return，那么finally会不会被执行呢？答案是肯定的
 */
import java.io.*;
public class Test6 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //检查异常1.打开文件
        FileReader fr=null;
        try {
            fr=new FileReader("d:\\aa.text");
            // 在出现异常的地方，下面的代码的就不执行
            System.out.println("aaa");
        } catch (Exception e) {
            System.out.println("进入catch");
            // 文档读取异常
//             System.exit(-1);
            System.out.println("message="+e.getLocalizedMessage());  //没有报哪一行出错
            e.printStackTrace();   // 打印出错异常还出现可以报出错先异常的行
        }
        // 这个语句块不管发生没有发生异常，都会执行
        // 一般来说，把需要关闭的资源，文件，连接，内存等
        finally
        {
            System.out.println("进入finally");
            if(fr!=null);
            {
                try {
                    fr.close();
                } catch (Exception e) {
                    // TODO: handle exception
                    e.printStackTrace();
                }
            }
        }
        System.out.println("OK");
    }
}
