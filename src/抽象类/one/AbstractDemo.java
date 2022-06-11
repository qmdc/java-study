package 抽象类.one;

public class AbstractDemo {
    public static void main(String[] args) {

        fun(new Robot());

        fun(new Human());

        fun(new Pig());

    }

    public static void fun(Action act){
        act.commond(Action.EAT);
        act.commond(Action.SLEEP);
        act.commond(Action.WORK);
    }
}
