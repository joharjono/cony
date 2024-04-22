package coynedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import coynebean.RegisterCustomer;

public class RegisterDaoCustomer 
{
    public String authorizeRegister(RegisterCustomer registerBean) 
    {

        String username=registerBean.getUsername(); 
        String password=registerBean.getPassword();
         String email=registerBean.getEmail();
        
        String url="jdbc:mysql://localhost/coyne"; 
        String uname="root"; 
        String pass=""; 
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=DriverManager.getConnection(url,uname,pass);
            
            PreparedStatement pstmt=null; 
            
            pstmt=con.prepareStatement("insert into accountcustomer(username,password,email) values(?,?,?)"); 

            pstmt.setString(1,username);
            pstmt.setString(2,password);
            pstmt.setString(3,email);
            pstmt.executeUpdate(); 
             
            pstmt.close(); 
            
            con.close(); 
           
            return "SUCCESS REGISTER"; //
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            return "FAIL REGISTER"; 
    }
}
