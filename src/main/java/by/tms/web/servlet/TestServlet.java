package by.tms.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/calc", loadOnStartup = -1, name = "TestServlet")
public class TestServlet extends HttpServlet {

    private int count;


    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        count++;

    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String name2 = req.getParameter("name2");
        String name3 = req.getParameter("name3");
        resp.getWriter().println("Result = " + name);

    }

}
