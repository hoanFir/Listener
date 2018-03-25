package net.hoanfir.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestAttributeListenerServlet", urlPatterns = "/test")
public class TestAttributeListenerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getServletContext();  在request域中得到servletcontext
        ServletContext servletContext = request.getServletContext();

        servletContext.setAttribute("name", "jaanai");
        servletContext.setAttribute("name", "Li");
        servletContext.removeAttribute("name");
    }
}
