package 注解和反射.反射;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//获取泛型信息
public class Test09 {
    public void Test1(Map<String,User> map, List<String> list){
        System.out.println("Test1");
    }

    public Map<String,User> Test2(){
        System.out.println("Test2");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test09.class.getDeclaredMethod("Test1", Map.class, List.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();//获取泛型信息
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);
            if(genericParameterType instanceof ParameterizedType){
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                System.out.println("**************************************************1");
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }
            }
        }

        System.out.println("**************************************************2");
        Method method1 = Test09.class.getDeclaredMethod("Test2");
        Type genericReturnType = method1.getGenericReturnType();
        if(genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }
    }
}
