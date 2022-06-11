package 抽象类.one;

import 抽象类.one.Action;

public class Robot extends Action {
    @Override
    public void eat() {
        System.out.println("机器人充电");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人工作");

    }
}
