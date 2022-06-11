package 面向对象.多态;

public class TestOverride{
    public static void main(String args[]){
        Animal a = new Animal(); // Animal 对象
        Animal b = new Dog(); // Dog 对象
        Dog c = new Dog();
        Cat d = new Cat();

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(c.age);
        System.out.println(d.age);

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        c.move();//执行 Dog 类的方法
        d.move();//执行 Cat 类的方法

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(c.age);
        System.out.println(d.age);

        Object aValue = a.age;
        Object bValue = b.age;
        Object cValue = c.age;
        Object dValue = d.age;
        System.out.println("The type of "+a.age+" is "+(aValue instanceof Double ? "double" : (aValue instanceof Integer ? "int" : "")));
        System.out.println("The type of "+b.age+" is "+(bValue instanceof Double ? "double" : (bValue instanceof Integer ? "int" : "")));
        System.out.println("The type of "+c.age+" is "+(cValue instanceof Double ? "double" : (cValue instanceof Integer ? "int" : "")));// 覆盖age属性
        System.out.println("The age of cat  is "+d.age+" is "+(dValue instanceof Double ? "double" : (dValue instanceof Integer ? "int" : "")));

        System.out.println(a.age);
        System.out.println(b.age);
        System.out.println(c.age);
        System.out.println(d.age);
    }
}
