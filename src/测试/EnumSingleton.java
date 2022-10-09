package 测试;

public enum EnumSingleton {

    INSTANCE;
    private String name;
    private int age;

    private void build(SingletonBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static EnumSingleton getSingleton() { // static getter
        return INSTANCE;
    }

    public void print() {
        System.out.println("Name: " + name + ", age: " + age);
    }

    public static class SingletonBuilder {
        private final String name;
        private int age;

        private SingletonBuilder() {
            name = null;
        }

        public SingletonBuilder(String name) {
            this.name = name;
        }

        public SingletonBuilder age(int age) {
            this.age = age;
            return this;
        }

        public void build() {
            EnumSingleton.INSTANCE.build(this);
        }

    }

    public static void main(String[] args) {
        new SingletonBuilder("Adithya").age(25).build();
        EnumSingleton.getSingleton().print();
    }

}
