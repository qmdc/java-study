package 异常及IO.自定义异常类;

class FuShuException extends Exception //getMessage();
{
    private int value;
    FuShuException()
    {
        super();
    }
    FuShuException(String msg,int value)
    {
        super(msg);//调用父类有参构造,获得异常信息
        this.value = value;
    }
    public int getValue()
    {
        return value;
    }
}

class Demo
{
    int div(int a,int b)throws FuShuException
    {
        if(b<0) {
            // 手动通过throw关键字抛出一个自定义异常对象。
            throw new FuShuException("出现了除数是负数的情况------ / by fushu",b);
        }
        return a/b;
    }
}

class  ExceptionDemo3
{
    public static void main(String[] args)
    {
        Demo d = new Demo();
        try
        {
            int x = d.div(4,-9);
            System.out.println("x="+x);
        }
        catch (FuShuException e)
        {
            System.out.println(e.toString());
            //System.out.println("除数出现负数了");
            System.out.println("错误的负数是："+e.getValue());
        }
        System.out.println("over");
    }
}