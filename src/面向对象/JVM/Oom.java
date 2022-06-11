package 面向对象.JVM;

import java.util.Random;

public class Oom {
    public static void main(String[] args) {
        String str="konan";
        while (true) {
            str+="konan"+new Random().nextInt(888899999)+new Random().nextInt(888899999);
        }
    }
}
