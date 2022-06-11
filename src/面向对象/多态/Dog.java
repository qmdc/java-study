package 面向对象.多态;

class Dog extends Animal{
    public double age;
    public void move(){
        age = 10.00;
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
