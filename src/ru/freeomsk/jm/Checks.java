package ru.freeomsk.jm;

//Класс, выполняющий проверку введенной пользователем строки
public class Checks {

    public static boolean existLatin(String arrStr) {
        String[] arrStringA = {"I","II","III","IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (String symbolInArr : arrStringA) {
            if (arrStr.equals(symbolInArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existArabic(String arrStr) {
        String[] arrStringA = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for (String symbolInArr : arrStringA) {
            if (arrStr.equals(symbolInArr)) {
                return true;
            }
        }
        return false;
    }
}
