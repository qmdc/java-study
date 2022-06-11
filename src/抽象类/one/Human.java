package 抽象类.one;

import 抽象类.one.Action;

public class Human extends Action {
    @Override
    public void eat() {
        System.out.println("人吃饭");

    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");

    }

    @Override
    public void work() {
        System.out.println("人工作");

    }
}
