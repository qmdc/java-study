package JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

//第一个JDBC程序
public class 第一个JDBC程序 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、加载驱动
//        Class.forName("com.mysql.jdbc.Driver");

        //2、连接数据库
        String url="jdbc:mysql://localhost:3306/jdbcstudy?useUnicode=true&characterEncoding=utf8&useSSL=true";
        String user="root";
        String psw="964287531";

        Connection connection = DriverManager.getConnection(url, user, psw);

        //3、创建执行
        Statement statement = connection.createStatement();

        //4、获得结果
        String sql="select * from users";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("id="+resultSet.getInt("id"));
            System.out.println("name="+resultSet.getObject("NAME"));
            System.out.println("psw="+resultSet.getObject("PASSWORD"));
            System.out.println("email="+resultSet.getString("email"));
            System.out.println("birthday="+resultSet.getObject("birthday"));
            System.out.println("==============================");
        }

        //5、关闭执行
        resultSet.close();
        statement.close();
        connection.close();
    }
}
