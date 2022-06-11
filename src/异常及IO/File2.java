package 异常及IO;
//package fo.异常及IO.IO;
public class File2 {
    public static void main(String[] args) throws java.io.IOException{
        java.io.File file=new java.io.File("score.txt");
        if(file.exists()){
            System.out.println("存在");
            //System.exit(0);
        }
    try(java.io.PrintWriter output=new java.io.PrintWriter(file)){
            //java.io.PrintWriter output=new java.io.PrintWriter(file);
            output.print("张浩男 ——> >");
            output.println(90);
            output.println("Eric K Jones ");
            output.println(85);
            //output.close();
        }
    }
}
