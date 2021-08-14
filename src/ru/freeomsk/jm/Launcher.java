package ru.freeomsk.jm;

import java.util.Scanner;

//Класс, отвечающий за корректный запуск Калькулятора
public class Launcher {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        printWelcome();
        try {
            while (true) {
                printUserInstruction();
                printPrompt();
                String inputStr = scanner.nextLine();
                if (inputStr.equals("q") || inputStr.equals("Q") || inputStr.equals("й") || inputStr.equals("Й")) {
                    printGoodBye();
                    System.exit(0);
                }
                String[] inputLine = inputStr.split(" ");
                if (inputLine.length != 3) {
                    throw new CalcException(CalcException.ExceptionMessages.UNKNOWN_EXPRESSION);
                }
                String str1 = inputLine[0];
                String operate = inputLine[1];
                String str2 = inputLine[2];

                if (Checks.existArabic(str1) && Checks.existArabic(str2) && operate.length() == 1) {
                    System.out.println("Результат = " + Calculate.calculate(Integer.parseInt(str1), Integer.parseInt(str2), operate.charAt(0)));
                } else if (Checks.existLatin(str1) && Checks.existLatin(str2) && operate.length() == 1) {
                    System.out.println("Результат = " + Convert.arabicToLatin(Calculate.calculate(Convert.latinToArabic(str1), +
                            Convert.latinToArabic(str2), operate.charAt(0))));
                } else {
                    throw new CalcException(CalcException.ExceptionMessages.UNKNOWN_EXPRESSION);
                }
            }
        } catch (CalcException e) {
            System.out.println("\n" + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nАварийное завершение работы! Брошено исключение: " + e.getMessage());
        }
        scanner.close();
    }

    private static void printWelcome() {
        System.out.println(String.format("%60s", "").replace(' ', '–'));
        System.out.println("Добро пожаловать в консольный Калькулятор!");
        System.out.println("Он умеет работать с арабскими и римскими числами!");
        System.out.print(String.format("%60s", "").replace(' ', '–'));
    }

    private static void printUserInstruction() {
        System.out.print("\nВведите через пробел арифметическую операцию (+, -, * или /),\n" +
                "используя арабские числа от 1 до 10 или римские от I до X.\n" +
                "Например, 1 + 1, 10 / 5, V * X, VIII - II.\n" +
                "Для выхода из Калькулятора введите \"q\" и \"ENTER\".\n");
        System.out.println(String.format("%60s", "").replace(' ', '–'));
    }

    private static void printPrompt() {
        System.out.print("> ");
    }

    private static void printGoodBye() {
        System.out.println("\nБлагодарим за использование Калькулятора!");
        System.out.println(String.format("%60s", "").replace(' ', '–'));
    }
}
