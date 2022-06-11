package 抽象类;

abstract class Animal{
    private int age = 10;
    public Animal(){
        System.out.println("初始化Animal");
    }
    public void move(){
        System.out.println("跑步数："+this.age);
    }
}

abstract class Dog extends Animal{
    public Dog(int age){
        //super();//有没有都行
        //super(age);//不能有
        System.out.println("初始化Dog");
    }

}
//子类在继承父类时，如果父类的显式构造器中有参数，子类要声明给出这个参数。这是一个关于继承的问题。
 class BigDogs extends Dog{
    public BigDogs(){
        super(20);//必须有！！！
        System.out.println("初始化BigDog");
    }

    public static void main(String[] args){
        BigDogs a = new BigDogs();
        a.move();
    }
}