package 异常及IO;
public class Test3 {
    public static void main(String[] args){ 
            try{
                for(int i=0;i<2;i++){
                    System.out.println(i+" ");
                    System.out.println(1/i);}
            }
            catch(Exception ex){
                System.out.println("000");
            }
            System.out.println("Continue....");
        }
}
