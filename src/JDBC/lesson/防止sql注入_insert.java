package JDBC.lesson;

import java.sql.*;
import java.util.Date;

public class 防止sql注入_insert {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection = Util.getConnection();
            String sql = "insert into users(id,NAME,PASSWORD,email,birthday) values(?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(sql);//预编译sql语句

            //手动给sql语句赋值
            preparedStatement.setInt(1, 18);
            preparedStatement.setString(2, "小明");
            preparedStatement.setString(3, "9999");
            preparedStatement.setString(4, "noter1024@icloud.com");
            preparedStatement.setDate(5,new java.sql.Date(new Date().getTime()));

            int i = preparedStatement.executeUpdate();//正式执行

            if (i>0) {
                System.out.println("插入成功！");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            Util.release(connection,preparedStatement,resultSet);
        }
    }
}
