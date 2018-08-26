package br.com.felipemcardoso.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/my-servlet-controller")
public class MyServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("Hello Servlet");
        out.println("</body>");
        out.println("</html>");
    }
}