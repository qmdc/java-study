package JDBC.lesson;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//利用封装好的工具类操作数据库
public class UtilTest {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{
            connection = Util.getConnection();
            statement = connection.createStatement();

            String sql="INSERT INTO users(id, NAME, PASSWORD, email ,birthday) VALUES (33,'zhansan','123456000','zs@sina.com','1980-12-04')";
            int i = statement.executeUpdate(sql);
            if (i>0) {
                System.out.println("插入成功！");
            }
        }finally {
            Util.release(connection,statement,resultSet);
        }
    }
}
