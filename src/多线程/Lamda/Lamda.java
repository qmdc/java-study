package 多线程.Lamda;

public class Lamda {

    //静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lamda() {
            System.out.println("I like lamda2");
        }
    }

    public static void main(String[] args) {
        Like like=new Like();
        like.lamda();

        Like2 like2=new Like2();
        like2.lamda();

        //局部内部类
        class Like3 implements Ilike{
            @Override
            public void lamda() {
                System.out.println("I like lamda3");
            }
        }

        Like3 like3=new Like3();
        like3.lamda();

        //匿名内部类
        Ilike like4=new Ilike(){
            @Override
            public void lamda() {
                System.out.println("I like lamda4");
            }
        };
        like4.lamda();

        //用lamda简化
        Ilike like5= () ->System.out.println("I like lamda5");
        like5.lamda();
    }
}

interface  Ilike{
    void lamda();
}

class Like implements Ilike{
    @Override
    public void lamda() {
        System.out.println("I like lamda1");
    }
}