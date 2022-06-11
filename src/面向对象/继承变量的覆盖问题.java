package 面向对象;

class Animal1{
    public int age;      //此处在Animal中定义类型为int，名为age的变量。
    public void move(){
        System.out.println("动物总是不安分");
    }
}

class Dog1 extends Animal1{
    public double age;    //此处在Dog中定义新类型double,名为age的变量。当然int尝试也可以。
    public void move(){
        age =10;
        System.out.println("狗跑的很快");
    }
}
class Cat1 extends Animal1{
    public void move(){
        super.age = 3;   //此处继承age，并赋值为3.且该类中未重新定义变量。
        System.out.println("猫跳的很高");
    }
}
public class 继承变量的覆盖问题{
    public static void main(String args[]){
        Animal1 a = new Animal1(); // Animal 对象
        Animal1 b = new Dog1(); // Dog 对象
        Animal1 c =new Cat1(); //Cat 对象
        Dog1  d= new Dog1();
        Cat1  e= new Cat1();

        a.move();//执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        c.move();//执行 Cat 类的方法
        d.move();//执行Dog 类的方法
        e.move();//执行 Cat 类的方法
        Object aValue = a.age;
        Object bValue = b.age;      // b.age有两个age值，一个是自定义的age值，一个是继承的age值
        Object cValue = c.age;
        Object dValue = d.age;      // d.age有两个age值，一个是自定义的age值，一个是继承的age值
        Object eValue =e.age;
        System.out.println("The type of "+a.age+" is "+(aValue instanceof Double ? "double" : (aValue instanceof Integer ? "int" : "")));     // Animal 类中的 age 未被赋值
        System.out.println("The type of "+b.age+" is "+(bValue instanceof Double ? "double" : (bValue instanceof Integer ? "int" : "")));     // b.age有两个age值，输出取引用名为Animal的int类型值
        System.out.println("The type of "+c.age+" is "+(cValue instanceof Double ? "double" : (cValue instanceof Integer ? "int" : "")));     // c.age只有一个age值，是super所继承的Animal中的age值，再被赋值为3
        System.out.println("The type of "+d.age+" is "+(dValue instanceof Double ? "double" : (dValue instanceof Integer ? "int" : "")));     // d.age有两个age值，输出取引用名为Dog的double类型值
        System.out.println("The type of "+e.age+" is "+(eValue instanceof Double ? "double" : (eValue instanceof Integer ? "int" : "")));     // c.age只有一个age值，是super所继承的Animal中的age值，再被赋值为3
    }
}
