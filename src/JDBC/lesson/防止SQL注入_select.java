package JDBC.lesson;

import java.sql.*;

public class 防止SQL注入_select {
    public static void main(String[] args) {
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultSet=null;

        try {
            connection = Util.getConnection();
            String sql = "select * from users where NAME=? and PASSWORD=?";
            preparedStatement = connection.prepareStatement(sql);//预编译sql语句

            //手动给sql语句赋值
            preparedStatement.setString(1, "wangwu");
            preparedStatement.setString(2, "123456");

            resultSet = preparedStatement.executeQuery();//正式执行

            if (resultSet.next()) {
                System.out.println(resultSet.getString("NAME"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            Util.release(connection,preparedStatement,resultSet);
        }
    }
}
