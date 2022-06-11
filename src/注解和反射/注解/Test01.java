package 注解和反射.注解;

import java.lang.annotation.*;

//测试元注解：负责注解其他注解

@MyAnnotation
public class Test01 {

    @SuppressWarnings("all")//镇压警告
    public class test {

    }
}

//定义一个注解

//Target 表示我们的注解可以用在哪些地方
@Target(value={ElementType.METHOD,ElementType.TYPE})

//Retention 表示我们的注解在什么地方还有效，表示需要在什么级别保存该注释信息,用于描述注解的生命周期
//runtime>class>sources
@Retention(value= RetentionPolicy.RUNTIME)

//Documented 表示是否将我们的注解生成在JAVA中
@Documented

//Ingerited 子类可以继承父类的注解
@Inherited

@interface MyAnnotation{

}
