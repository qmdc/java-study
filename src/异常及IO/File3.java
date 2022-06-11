package 异常及IO;
import java.util.Scanner;
import java.io.*;
public class File3 {
    public static void main(String[] args) throws Exception{
        File file=new File("src/异常及IO/image/scores.txt");
        
        try(
            Scanner input=new Scanner(file);
        ){
            while(input.hasNext()){
                String Name=input.next();
                String mi=input.next();
                String lastname=input.next();
                int score=input.nextInt();
                System.out.println(Name+" "+mi+" "+lastname+" "+score);
            }
        }
        //input.close();
    }
}

/*import java.util.Scanner; 
public class File3 {
  public static void main(String[] args) throws Exception {
    // Create a File instance
    java.io.File file = new java.io.File("image/scores.txt");

    try (
      // Create a Scanner for the file
      Scanner input = new Scanner(file);
    ) {
      // Read data from a file
      while (input.hasNext()) {
        String firstName = input.next();
        String mi = input.next();
        String lastName = input.next();
        int score = input.nextInt();
        System.out.println(
          firstName + " " + mi + " " + lastName + " " + score);
      }
    }
  }
}*/