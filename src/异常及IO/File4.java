package 异常及IO;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File4 {
    public static void main(String[] args) throws IOException{
        File file=new File("src/异常及IO/image/score.txt");
        try(Scanner input=new Scanner(file);
        ){
            while(input.hasNext()){
                String clas=input.next();
                float a=input.nextInt();
                float b=input.nextInt();
                float c=input.nextInt();
                float d=input.nextInt();
                System.out.println((a+b+c+d)/4);
            }
        }
        
    }
}
