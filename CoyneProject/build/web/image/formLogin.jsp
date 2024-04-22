<%-- 
    Document   : formLogin
    Created on : Nov 23, 2021, 7:49:14 AM
    Author     : ASUS
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login</title>
</head>
    <body>
        <%! String userdbName;
            String userdbPsw;
        %>
        <%
            Connection con= null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            String driverName = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/dbekspedisi";
            String user = "root";
            String dbpsw = "";
            String sql = "select * from tbluser where Username=? and Password=?";
            String name = request.getParameter("Username");
            String password = request.getParameter("Password");
                if((!(name.equals(null) || name.equals("")) && !(password.equals(null) ||
                password.equals(""))))
        {
                try{
                Class.forName(driverName);
                con = DriverManager.getConnection(url, user, dbpsw);
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, password);
                rs = ps.executeQuery();
                if(rs.next())
        {
                userdbName = rs.getString("Username");
                userdbPsw = rs.getString("Password");
                if(name.equals(userdbName) && password.equals(userdbPsw))
        {
                session.setAttribute("Username",userdbName);
                response.sendRedirect("index2.jsp");
        }
        }
                else
                response.sendRedirect("Error.jsp");
                rs.close();
                ps.close();
        }
            catch(SQLException sqe)
        {
            out.println(sqe);
        }
        }
                else
                response.sendRedirect("Error.jsp");
                rs.close();
                ps.close();
        {
        %>
        <%
                getServletContext().getRequestDispatcher("/Error.jsp").include(request,
                response);
        }
        %>
    </body>
</html>
