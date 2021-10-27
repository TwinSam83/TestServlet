package by.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calcServlet")

public class CalcServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        String operation = req.getParameter("operation");
        resp.getWriter().println(operate(num1, num2, operation));
    }

    private String operate(String num1, String num2, String operation) {
        Calculator calc = new Calculator();
        String result;
        try {
            result = calc.calculate(Double.parseDouble(num1), Double.parseDouble(num2), operation);
        } catch (NumberFormatException exception) {
            return "Entered wrong numbers!";
        } catch (IllegalArgumentException exception) {
            return exception.getMessage();
        }
        return num1 + " " + operation + " " + num2 + " = " + result;
    }
}

