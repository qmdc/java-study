package 设计模式.工厂模式.简单工厂模式;

public class FruitFactory {
    public static Fruits getFruit(String Fruit) {
        //方法一
        if (Fruit.equals("苹果")) {
            return new Apple();
        } else if (Fruit.equals("香蕉")) {
            return new Banana();
        } else {
            return null;
        }

        //方法一
//        switch (Fruit) {
//            case "苹果" :return new Apple();
//            case "香蕉": return new Banana();
//            default:return null;
//        }
    }

        //方法三
        public static Fruits getApple(){
            return new Apple();
        }
        public static Fruits getBanan(){
            return new Banana();
        }
}
