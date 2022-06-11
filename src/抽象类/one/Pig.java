package 抽象类.one;

import 抽象类.one.Action;

public class Pig extends Action {
    @Override
    public void eat() {
        System.out.println("猪进食");

    }

    @Override
    public void sleep() {
        System.out.println("猪睡觉");

    }

    @Override
    public void work() {


    }
}
