package 注解和反射.反射;

public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获得类的class类
        Class c1 = Class.forName("注解和反射.反射.User");
        System.out.println(c1);

        Class c2 = Class.forName("注解和反射.反射.User");
        Class c3 = Class.forName("注解和反射.反射.User");
        Class c4 = Class.forName("注解和反射.反射.User");

        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }
}

//实体类：pojo,entity
class User{
    private String name;
    int id;
    int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
