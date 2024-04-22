package coynecontroller;

import coynebean.LoginCustomer;
import coynedao.LoginDaoCustomer;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginControllerCustomer extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btn_login") != null) {
            String username = request.getParameter("txt_username");
            String password = request.getParameter("txt_password");

            LoginCustomer loginBean = new LoginCustomer();

            loginBean.setUsername(username);
            loginBean.setPassword(password);

            LoginDaoCustomer loginDao = new LoginDaoCustomer();

            String authorize = loginDao.authorizeLogin(loginBean);

            if (authorize.equals("SUCCESS LOGIN")) {
                HttpSession session = request.getSession();
                session.setAttribute("login", loginBean.getUsername());
                RequestDispatcher rd = request.getRequestDispatcher("halamanutamacustomer.jsp");
                rd.forward(request, response);
            } else {

                request.setAttribute("WrongLoginMsg", authorize);
                RequestDispatcher rd = request.getRequestDispatcher("customerlogin.jsp");
                rd.forward(request, response);
            }
        }
    }

}
