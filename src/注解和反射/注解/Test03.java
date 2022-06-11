package 注解和反射.注解;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//反射获取注解
public class Test03 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("注解和反射.注解.Students");

        Annotation[] annotation = c1.getAnnotations();//通过反射获取注解
        for (Annotation annotation1 : annotation) {
            System.out.println(annotation1);
        }
        System.out.println("---------------");

        //获得注解的value值
        Myannotation1 annotation1 = (Myannotation1)c1.getAnnotation(Myannotation1.class);
        System.out.println(annotation1);
        String value = annotation1.value();
        System.out.println(value);
        System.out.println("---------------");
        //获得属性注解
        Field c2 = c1.getDeclaredField("name");
        Filed Filed1 = c2.getAnnotation(Filed.class);
        System.out.println(Filed1.columnName());
        System.out.println(Filed1.type());
        System.out.println(Filed1.lenght());
    }
}

@Myannotation1("学生")
class Students{

    @Filed(columnName = "学号",type="长整型",lenght = 11)
    private int id;
    @Filed(columnName = "年龄",type="整型",lenght = 2)
    private int age;
    @Filed(columnName = "姓名",type="字符型",lenght = 3)
    private String name;

    public Students() {
    }

    public Students(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

//类名的注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface Myannotation1{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filed{
    String columnName();
    String type();
    int lenght();
}

