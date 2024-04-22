/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coynecontroller;

import coynebean.LoginAdmin;
import coynedao.LoginDaoAdmin;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginControllerAdmin extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btn_login") != null) {
            String username = request.getParameter("txt_username");
            String password = request.getParameter("txt_password");

            LoginAdmin loginBean = new LoginAdmin();

            loginBean.setUsername(username);
            loginBean.setPassword(password);

            LoginDaoAdmin loginDao = new LoginDaoAdmin();

            String authorize = loginDao.authorizeLogin(loginBean);

            if (authorize.equals("SUCCESS LOGIN")) {
                HttpSession session = request.getSession();
                session.setAttribute("login", loginBean.getUsername());
                RequestDispatcher rd = request.getRequestDispatcher("halamanutamaadmin.jsp");
                rd.forward(request, response);
            } else {

                request.setAttribute("WrongLoginMsg", authorize);
                RequestDispatcher rd = request.getRequestDispatcher("adminlogin.jsp");
                rd.forward(request, response);
            }
        }
    }

}
