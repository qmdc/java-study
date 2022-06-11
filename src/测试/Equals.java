package 测试;

public class Equals {
    public static void main(String[] args) {
        int i=3;
        int j=4;
        getIP getIP = new getIP();
        测试.getIP getIP1 = new getIP();
        System.out.println(getIP+""+getIP1);

        System.out.println(getIP.equals(getIP1));
    }
}
