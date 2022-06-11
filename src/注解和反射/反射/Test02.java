package 注解和反射.反射;

//测试class类的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person=new Student();
        System.out.println("这个人是"+person.name);

        //方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式二：通过forName获得
        Class c2 = Class.forName("注解和反射.反射.Student");
        System.out.println(c2.hashCode());

        //方式三：通过类名获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //基本内置类型的包装类都有一个Type属性
        Class c4 = Character.TYPE;
        System.out.println(c4);

        //获得父类
        Class c5 = c1.getSuperclass();
        System.out.println(c5);
    }
}

class Person{
    String name;
    public Person(){}
}

class Student extends Person{
    public Student() {
        this.name="学生";
    }
}
