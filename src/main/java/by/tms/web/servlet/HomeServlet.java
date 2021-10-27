package by.tms.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/")
public class HomeServlet extends HttpServlet {

//    private int count;

    //init
    //service
    //destroy


//    @Override
//    public void init() throws ServletException {
//        System.out.println("Init");
//    }

//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       super.service(req, resp);
//       count++;
////       doPost(req, resp);
//    }

//    @Override
//    public void destroy() {
//        System.out.println("Destroy");
//    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/index.jsp").forward(req, resp);
    }

}
