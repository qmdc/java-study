package JDBC.lesson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//操作事物
public class thingTest {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement st=null;
        ResultSet rs=null;

        try {
            conn=Util.getConnection();

            conn.setAutoCommit(false);//关闭自动提交，默认会连接事物

            String sql1="update Students set age=100 where ID=001";
            st=conn.prepareStatement(sql1);
            st.executeUpdate();
            String sql2="update Students set class='德语班' where ID=002";
            st=conn.prepareStatement(sql2);
            st.executeUpdate();

//            int t=1/0;
            System.out.println("修改成功！");
            conn.commit();
        } catch (Exception e) {
            try {
                conn.rollback();
                System.out.println("已回滚");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally{
            Util.release(conn,st,rs);
        }
    }
}
