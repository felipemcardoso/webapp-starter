package dev.felipemcardoso.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/my-servlet-controller")
public class MyServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Servlet");

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        List<String> view = new ArrayList<>();
        view.add("WEB-INF/views/template1.jsp");
        view.add("WEB-INF/views/template2.jsp");

        req.setAttribute("views", view);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
        requestDispatcher.include(req, resp);
    }
}