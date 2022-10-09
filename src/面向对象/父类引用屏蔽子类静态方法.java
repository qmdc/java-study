package 面向对象;

public class 父类引用屏蔽子类静态方法 {
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.getInfo();
            System.out.println("==========");
            Animal a = new Dog();
            Animal b = new Dog("smith", 5);
            Dog f = new Dog("smith", 5);

            Dog c = new Dog();
            // 子类的非静态方法与变量覆盖父类
            a.getInfo();    //访问Dog类
            // 子类通过super调用父类的非静态成员方法和变量
            a.getSuperInfo();   //访问Dog类，而方法中的super（。。。）又调用了父类
            // 子类的静态方法被父类隐藏
            a.hello();
            System.out.println("===========");

            b.getInfo();    //没有执行Dog的构造方法
            f.getInfo();

            b.hello();
            // 调用子类的静态方法
            c.hello();
        }
    }

    class Animal {
        String name;
        int age;
        public Animal() {
            name = "alex";
            age = 1;
        }

        public Animal(String nm, int ag) {
            name = nm;
            age = ag;
        }

        public void getInfo() {
            System.out.println("哈哈");
            System.out.print(name + "'s age is *" + age + '\n');
        }

        public void getSuperInfo() {
            System.out.println("被调用");
        }
        public static void hello() {
            System.out.println("Greeting from Animal");
        }
    }

    class Dog extends Animal {
        String name;
        int age;
        public Dog() {
            name = "prter";
            age = 3;
        }

        public Dog(String nm, int ag) {
            super(nm, ag);
        }

        public void getInfo() {
            System.out.println("666");
            System.out.print(name + "'s age is " + age + '\n');
        }

        // 通过super显式调用父类的非静态成员方法
        public void getSuperInfo() {
            super.getInfo();
        }

        public static void hello() {
            System.out.println("Greeting from Dog");
        }
    }
