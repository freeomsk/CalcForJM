package ru.freeomsk.jm;

//Класс, представляющий исключения, относящиеся к работе Калькулятора
class CalcException extends Exception {
    public CalcException(String message) {
        super("Ошибка Калькулятора: " + message);
    }

    //Класс, содержащий строковые константы с сообщениями об ошибках
    final static class ExceptionMessages {
        static final String OUT_OF_RANGE_LATIN = "Результат не удовлетворяет допустимому\nдиапазону римских цифр (от I до C)!";
        static final String UNKNOWN_OPERATION = "Неизвестная операция!";
        static final String UNKNOWN_EXPRESSION = "Введено недопустимое выражение!";
    }
}
