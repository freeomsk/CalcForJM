package ru.freeomsk.jm;

//Класс, выполняющий арифметические вычисления
public class Calculate {

     public static int calculate(int number1, int number2, char operation) throws CalcException {
        int result;
        switch (operation) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                throw new CalcException(CalcException.ExceptionMessages.UNKNOWN_OPERATION);
        }
        return result;
    }
}
