package 异常及IO;
public class Test2 {
    public static void main(String[] args){
        for(int i=0;i<2;i++){
            System.out.println(i+" ");
            try{
                System.out.println(1/i);
            }
            catch(Exception ex){
                System.out.println("000");
            }
            System.out.println("Continue....");
        }
        
    }
}