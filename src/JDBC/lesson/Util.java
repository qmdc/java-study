package JDBC.lesson;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

//工具类
public class Util {
   private static String driver=null;
   private static String url=null;
   private static String name=null;
   private static String password=null;

   static {
       try {//读取配置文件
           InputStream in = Util.class.getClassLoader().getResourceAsStream("db.properties");
           Properties properties = new Properties();
           properties.load(in);

//           driver = properties.getProperty("driver");
           url = properties.getProperty("url");
           name = properties.getProperty("username");
           password = properties.getProperty("password");

//           Class.forName(driver);//加载驱动
       }catch(Exception e){
           e.printStackTrace();
       }
   }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, name, password);//连接库
    }

    public static void  release(Connection conn,Statement st,ResultSet rs){//关闭资源
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (st!=null) {
            try {
                st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
