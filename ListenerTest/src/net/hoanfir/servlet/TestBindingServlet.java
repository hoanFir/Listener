package net.hoanfir.servlet;

import net.hoanfir.bean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

//  对象感知监听器
//  对bean里设置的对象进行监听

@WebServlet(name = "TestBindingServlet", urlPatterns = "/testBind")
public class TestBindingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setId(1);
        user.setName("Jaanai");

        HttpSession session = request.getSession();
        session.setAttribute("user", user);
        session.removeAttribute("user");
    }
}
