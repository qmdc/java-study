package 异常及IO;
public class Test1 {
    public static void main(String[] args){
        try{
            int value=30;
            if(value<40)
                //IllegalArgumentException ex=new IllegalArgumentException("@@@");
                //throw ex;
                throw new Exception("value is too small");
        }
        catch(Exception ex){
            System.out.println(ex);
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            System.out.println(ex.getStackTrace());
            ex.printStackTrace();
            System.out.println("000");
        }
        System.out.println("Continue....");
    }
}