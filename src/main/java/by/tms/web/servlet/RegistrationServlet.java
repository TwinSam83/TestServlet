package by.tms.web.servlet;

import by.tms.entity.User;
import by.tms.storage.InMemoryStorage;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

    private final InMemoryStorage inMemoryStorage = new InMemoryStorage();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        inMemoryStorage.save(new User(name, username, password));
    }
}
