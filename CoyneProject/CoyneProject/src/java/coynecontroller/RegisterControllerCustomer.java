package coynecontroller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coynebean.RegisterCustomer;
import coynedao.RegisterDaoCustomer;

public class RegisterControllerCustomer extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("btn_register") != null) {

            String username = request.getParameter("txt_username");
            String password = request.getParameter("txt_password");
            String email = request.getParameter("txt_email");

            RegisterCustomer registerBean = new RegisterCustomer();

            registerBean.setUsername(username);
            registerBean.setPassword(password);
            registerBean.setEmail(email);

            RegisterDaoCustomer registerdao = new RegisterDaoCustomer();

            String registerValidate = registerdao.authorizeRegister(registerBean);

            if (registerValidate.equals("SUCCESS REGISTER")) {
                request.setAttribute("RegiseterSuccessMsg", registerValidate);
                RequestDispatcher rd = request.getRequestDispatcher("customerlogin.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("RegisterErrorMsg", registerValidate);
                RequestDispatcher rd = request.getRequestDispatcher("customerregister.jsp");
                rd.include(request, response);
            }
        }
    }

}
