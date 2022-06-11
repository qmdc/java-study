package JDBC.DBCP;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Testdbcp {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try{
            connection = dbcpUtils.getConnection();
            statement = connection.createStatement();

            String sql="INSERT INTO users(id, NAME, PASSWORD, email ,birthday) VALUES (10,'zhansanli','123456000','zs@sina.com','1980-12-04')";
            int i = statement.executeUpdate(sql);
            if (i>0) {
                System.out.println("插入成功！");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            dbcpUtils.release(connection,statement, null);
        }
    }
}
