package 异常及IO;
public class File1{
    public static void main(String[] args){
        //java.io.File file=new java.io.File("/Users/ppsn/Documents/Vsc_java/second/Happy.java");
        java.io.File file=new java.io.File("src/异常及IO/image/scores.txt");
        //java.io.File fi=new java.io.File("ui.gif");
        //System.out.println(file.mkdir());
        System.out.println(file.exists());//文件是否存在
        System.out.println(file.length());//文件大小
        System.out.println(file.canRead());//是否存在可读性
        System.out.println(file.isDirectory());//是否代表着一个目录
        System.out.println(file.isFile());//是否代表着一个文件
        System.out.println(file.isAbsolute());//是否采用绝对路径创建
        System.out.println(file.isHidden());//是否隐藏的
        System.out.println(file.getAbsolutePath());//完整的绝对路径名
        System.out.println(file.lastModified());//最后修改日期_70年毫秒
        System.out.println(new java.util.Date(file.lastModified()));//最后修改日期_Data形式

        //System.out.println(fi.renameTo(file));//重命名
        //System.out.println(fi.delete());//删除文件

        java.io.File fi=new java.io.File("src/接口/un.gif");//创建目录
        if(!fi.exists()){
            System.out.println(fi.mkdir());}
    }
}