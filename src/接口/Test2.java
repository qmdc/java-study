package 接口;

public interface Test2 {
        int age=10;
        String name="输出名字"; // 接口里面定义的成员变量都是  public static final 修饰
        public void eat();
}
    //所有的变量必须给出初始值，且绝对不会被修改，因为隐藏的修饰符为 public static final。
