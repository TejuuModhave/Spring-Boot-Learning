package main.webapp;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")                                                                          //mapping
public class NewServlet implements Servlet {
    @java.lang.Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @java.lang.Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @java.lang.Override
    public void service(ServletRequest servletRequest, ServletResponse res) throws ServletException , IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html");
        out.println("body");
        out.println("<h2> Tejuu modhave</h2>  ");
        out.println("<hr></body></html>");

    }

    @java.lang.Override
    public java.lang.String getServletInfo() {
        return null;
    }

    @java.lang.Override
    public void destroy() {

    }
}
