package 集合框架.序列化;

/*
    练习：
        1. 将存有多个Student对象的集合序列化操作，保存到list.txt 文件中。
        2. 反序列化list.txt ，并遍历集合，打印对象信息。

    步骤：
        1. 创建集合，用来保存Student
        2. 向集合中添加Student对象。
        3. 创建ObjectOutputStream序列化流，用来写。
        4. 调用writeObject方法，向文件中写集合对象。
        5. 释放资源。
        6. 创建ObjectInputStream反序列化流对象，用来读取
        7. 调用readObject方法，从文件中读取对象。
        8. 将读取到的集合进行遍历，并输出结果。

    注意：如果想要将多个对象保存在文件中，最好的一个方式可以将多个对象放入到一个集合中，然后直接将集合写到文件中。

 */
/*public class Demo05Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1. 创建集合，用来保存Student
        List<Student> list = new ArrayList<>();
        //2. 向集合中添加Student对象。
        list.add(new Student("李云龙", 20));
        list.add(new Student("二营长", 22));
        list.add(new Student("秀琴", 25));
        //3. 创建ObjectOutputStream序列化流，用来写。
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day12\\list.txt"));
        //4. 调用writeObject方法，向文件中写集合对象。
        oos.writeObject(list);
        //5. 释放资源。
        oos.close();
        //6. 创建ObjectInputStream反序列化流对象，用来读取
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day12\\list.txt"));
        //7. 调用readObject方法，从文件中读取对象。
        List<Student> list2 = (List<Student>) ois.readObject();
        //8. 将读取到的集合进行遍历，并输出结果。
        for (Student stu : list2) {
            System.out.println(stu);
        }
    }
}
*/