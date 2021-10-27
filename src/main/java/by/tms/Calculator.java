package by.tms;

public class Calculator {
    //сделать калькулятор на сервлетах с историей операций, удалением пользователя,
// обновлением имени и пароля, регистрацией и авторизацией
//добавить jdbc к проекту на сервлетах
    public String calculate(double num1, double num2, String operation) throws IllegalArgumentException {
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
        stringResult = String.valueOf(result);
        return stringResult;
    }
}

  