package by.tms.service;

public class CalcService {
//double
    public double calculate(double num1, double num2, String operation) throws IllegalArgumentException {
        double result = 0;
        String stringResult;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "mul":
                result = num1 * num2;
                break;
            case "div":
                if (num2 == 0) {
                    throw new IllegalArgumentException("You cannot divide by zero!");
                }
                result = num1 / num2;
                break;
            default:
                throw new IllegalArgumentException("Wrong operation symbol!");
        }
        return result;
    }
}

  