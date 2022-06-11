package 面向对象;

public class Testsuper {
    public static void main(String[] args) {
        Father father=new Father(40,187);
        System.out.println(father.age+"和"+father.id);

        Son son=new Son(19,195);
        System.out.println(son.age+"和"+son.id);

        Class<Son> vv = Son.class;
        System.out.println(vv.getSuperclass());
    }
}

class Father{
    int age;
    int id;

    public Father(int age, int id) {
        this.age = age;
        this.id = id;
    }
}

class Son extends Father{
    int age;
    int id;

    public Son(int age, int id) {
        super(age, id);
        System.out.println(age+"和."+id);
    }

}
