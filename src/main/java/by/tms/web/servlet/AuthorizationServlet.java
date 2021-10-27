package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.storage.InMemoryStorage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/authorization")
public class AuthorizationServlet extends HttpServlet {

    private final InMemoryStorage storage = new InMemoryStorage();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = storage.findByUsername(username);
        if (user != null){
            if (user.getPassword().equals(password)){
                req.getSession().setAttribute("user", user);
            } else {
                resp.getWriter().println("Wrong password!");
            }
        } else {
            resp.getWriter().println("User not found!");
        }
    }
}
