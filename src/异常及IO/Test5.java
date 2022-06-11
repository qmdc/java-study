package 异常及IO;
public class Test5 {
    public static void main(String[] args){
        try{
            method1();
        }catch(Exception ex){
            System.out.println("@");
            ex.printStackTrace();
        }
    }
    public static void method1()throws Exception{
        try{
            method2();
        }catch(Exception ex){
            //throw new Exception("111");
            throw new Exception("111",ex);
            //throw new Exception(ex,"111");//cowuwuic
            //throw new Exception(ex);
        }
    }
    public static void method2()throws Exception{
        throw new Exception("222");
    }
}
