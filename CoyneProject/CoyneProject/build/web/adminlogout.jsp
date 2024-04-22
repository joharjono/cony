<%-- 
    Document   : adminlogout
    Created on : Dec 2, 2021, 12:10:29 AM
    Author     : ASUS
--%>
<%
    session.invalidate(); 
    response.sendRedirect("adminlogin.jsp"); 
%>
