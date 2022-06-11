package 接口;

interface Test{         //调用得话，静态方法只能通过接口名调用，不可以通过实现类的类名或者实现类的对象调用，default 方法只能通过接口实现类的对象来调用。
    //这个是默认方法
    default String get(String aa){
        System.out.println("我是jdk1.8默认实现方法...");
        return "";
    }
    //这个是静态方法
    static void staticmethod(){
        System.out.println("我是静态方法");
    }
}