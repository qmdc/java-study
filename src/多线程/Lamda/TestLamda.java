package 多线程.Lamda;

public class TestLamda {
    public static void main(String[] args) {
        pandar love=(i,j)->{
            System.out.println("你捕捉到了"+i+"只熊猫。");
            System.out.println("你捕捉到了"+j+"只熊猫。");
        };
        love.uull(5,8);
    }
}

interface pandar{
    void uull(int i,int j);
}


