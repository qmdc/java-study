package JDBC.lesson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//SQL注入问题
public class SQL注入 {
    public static void main(String[] args) throws SQLException {
        login("wangwu 'or '1=1","123456 'or '1=1");
    }

    public static void login(String user,String psw) throws SQLException {

        Connection connection = Util.getConnection();
        Statement statement = connection.createStatement();

        String sql="select * from users where NAME='"+user+"' and PASSWORD='"+psw+"'";

        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            System.out.println(resultSet.getString("NAME"));
        }
        Util.release(connection,statement,resultSet);
    }
}
