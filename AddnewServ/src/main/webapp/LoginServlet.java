package main.webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/loginform")
    public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();

        out.println("<!DOCTYPE htm");
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();
        out.println();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String usernamename = req.getParameter("username");
        String password = req.getParameter("password");
        out.println("html");
        out.println("<h2>");
        if(usernamename.equalsIgnoreCase("root")&& password.equalsIgnoreCase("root")){

            out.println("User Login Successful......");
        }
        else{
            out.println("User Login failed...");
        }
        out.println("</h2>");
    }


}

