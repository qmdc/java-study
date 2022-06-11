package 集合框架.序列化;
/*
一个类的对象要想序列化成功，必须满足两个条件：
该类必须实现 java.io.Serializable 接口。
该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。
如果你想知道一个 Java 标准类是否是可序列化的，请查看该类的文档。检验一个类的实例是否能序列化十分简单，
只需要查看该类有没有实现 java.io.Serializable接口。
 */
public class Employee implements java.io.Serializable
{
    public String name;
    public String address;
    public transient int SSN;//当对该类序列化时，会自动忽略被 transient 修饰的属性。
    public int number;
    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}

/*
关于序列化，常又称为持久化，将其写入磁盘中。
进而对于编码规则来说：
任一一个实体类必须要去实现 Serializable 接口，方便以后将该类持久化，或者将其用于转为字节数组，用于网络传输。
如果被写对象的类型是String，或数组，或Enum，或Serializable，那么就可以对该对象进行序列化，否则将抛出NotSerializableException。
 */

/*
transient关键字只能修饰变量，而不能修饰方法和类。注意，本地变量是不能被transient关键字修饰的。
变量如果是用户自定义类变量，则该类需要实现Serializable接口。
被transient关键字修饰的变量不再能被序列化，一个静态变量不管是否被transient修饰，均不能被序列化。
 */

/*
SerializableID 号是根据类的特征和类的签名算出来的。为什么 ID 号那么长，是因为为了避免重复。所以 Serializable
是给类加上 id 用的。用于判断类和对象是否是同一个版本。
如果可序列化类未显式声明 serialVersionUID，则序列化运行时将基于该类的各个方面计算该类的默认 serialVersionUID 值。
原因是计算默认的 serialVersionUID 对类的详细信息具有较高的敏感性，根据编译器实现的不同可能千差万别，
这样在反序列化过程中可能会导致意外的 InvalidClassException。
 */