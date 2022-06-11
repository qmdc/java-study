package 注解和反射.注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Test02 {

    @Annotationf1(age=18)
    public void Test1(){}

    @Annotationf2("こなん") //只有一个值的时候会默认为value
    public void  Test2(){}
}

@Target(value={ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Annotationf1{
    //注解的参数：参数类型，参数名();
    String name() default "";
    int age() ;
    int qq() default 1720528586;
    int id() default -1;//如果默认值为-1，代表不存在

    String[] schools() default {"西工程大","清华大学"};
}

@Target(value={ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface Annotationf2{
    String value();
}