package 异常及IO;
public class Test4 {
    public static void main(String[] args){
        /*try{
            int[] list=new int[10];
            System.out.println(list[10]);
        }*/
        try{
            method();
            System.out.println("call");
        }
        catch(ArithmeticException ex){
            System.out.println("AA");
        }
        catch(RuntimeException ex){
            System.out.println("RR");
        }
        catch(Exception ex){
            System.out.println("EE");
        }
        System.out.println("000");
    }

    /*static void method() throws Exception{
        System.out.println(1/0);
        //System.out.println(1.0/0);
    }*/

    static void method() throws Exception{
        try{
            String s="abc";
            System.out.println(s.charAt(3));
            System.out.println("##");
        }
        catch(RuntimeException ex){
            System.out.println("RR method()");
        }
        catch(Exception ex){
            System.out.println("EE method()");
        }
        System.out.println("@@");
    }
}
