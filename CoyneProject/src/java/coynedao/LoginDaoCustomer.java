package coynedao;

import coynebean.LoginCustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoCustomer {

    public String authorizeLogin(LoginCustomer loginBean) {
        String username = loginBean.getUsername();
        String password = loginBean.getPassword();

        String dbusername = "";
        String dbpassword = "";

        String url = "jdbc:mysql://localhost/coyne";
        String uname = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);

            PreparedStatement pstmt = null;

            pstmt = con.prepareStatement("select * from accountcustomer where username=? and password=?");
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                dbusername = rs.getString("username");
                dbpassword = rs.getString("password");

                if (username.equals(dbusername) && password.equals(dbpassword)) {
                    return "SUCCESS LOGIN";
                }
            }

            pstmt.close();

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "WRONG USERNAME AND PASSWORD";
    }
}
