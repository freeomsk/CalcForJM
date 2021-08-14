package ru.freeomsk.jm;

//Класс, отвечающий за преобразование римских цифр в арабские и наоборот
public class Convert {

    public static int latinToArabic(String value) {
         switch (value) {
              case "I":
                   return 1;
              case "II":
                   return 2;
              case "III":
                   return 3;
              case "IV":
                   return 4;
              case "V":
                   return 5;
              case "VI":
                   return 6;
              case "VII":
                   return 7;
              case "VIII":
                   return 8;
              case "IX":
                   return 9;
              case "X":
                   return 10;
              default:
                   return 0;
         }
   }

   public static String arabicToLatin(int value) throws CalcException {
        if (value == 1) return "I";
        else if (value == 2) return "II";
        else if (value == 3) return "III";
        else if (value == 4) return "IV";
        else if (value == 5) return "V";
        else if (value == 6) return "VI";
        else if (value == 7) return "VII";
        else if (value == 8) return "VIII";
        else if (value == 9) return "IX";
        else if (value == 10) return "X";
        else if (value == 11) return "XI";
        else if (value == 12) return "XII";
        else if (value == 13) return "XIII";
        else if (value == 14) return "XIV";
        else if (value == 15) return "XV";
        else if (value == 16) return "XVI";
        else if (value == 17) return "XVII";
        else if (value == 18) return "XVIII";
        else if (value == 19) return "XIX";
        else if (value == 20) return "XX";
        else if (value == 21) return "XXI";
        else if (value == 24) return "XXIV";
        else if (value == 25) return "XXV";
        else if (value == 27) return "XXVII";
        else if (value == 28) return "XXVIII";
        else if (value == 30) return "XXX";
        else if (value == 32) return "XXXII";
        else if (value == 35) return "XXXV";
        else if (value == 36) return "XXXVI";
        else if (value == 40) return "XL";
        else if (value == 42) return "XLII";
        else if (value == 45) return "XLV";
        else if (value == 48) return "XLVIII";
        else if (value == 49) return "XLIX";
        else if (value == 50) return "L";
        else if (value == 54) return "LIV";
        else if (value == 56) return "LVI";
        else if (value == 60) return "LX";
        else if (value == 63) return "LXIII";
        else if (value == 64) return "LXIV";
        else if (value == 70) return "LXX";
        else if (value == 72) return "LXXII";
        else if (value == 80) return "LXXX";
        else if (value == 81) return "LXXXI";
        else if (value == 90) return "XC";
        else if (value == 100) return "C";
        else throw new CalcException(CalcException.ExceptionMessages.OUT_OF_RANGE_LATIN);
     }
}