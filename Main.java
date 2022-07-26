import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);     // сканер для трансляции данных из консоли.
        System.out.println("Введите задачу");

        String a = sc.next();                    // сканируем первое значение
        char operation = sc.next().charAt(0);    // сканируем символ
        String b = sc.next();                     // сканируем второе значение


        if (a.contains("I") || a.contains("II") || a.contains("III") || a.contains("IV") || a.contains("V") || a.contains("VI") || a.contains("VII") || a.contains("VIII") || a.contains("IX") || a.contains("X")) {  // проверка на счисление для запуска римского калькулятора


            // начало римского калькулятора
            ArrayList<String> rome = new ArrayList<>(); // строки для экстракции индекса
            rome.add(".");
            rome.add("I");
            rome.add("II");
            rome.add("III");
            rome.add("IV");
            rome.add("V");
            rome.add("VI");
            rome.add("VII");
            rome.add("VIII");
            rome.add("IX");
            rome.add("X");
            if (b.contains("1") || b.contains("2") || b.contains("3") || b.contains("4") || b.contains("5") || b.contains("6") || b.contains("7") || b.contains("8") || b.contains("9") || b.contains("10")){
                throw new Exception("Используются одновременно разные системы счисления"); // исключение по системам счисления
            }

            int x = rome.indexOf(a);                      // перевожу введенные римские в арабский индекс строки
            int y = rome.indexOf(b);


            String[] romeNumbers = {".", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"}; // не массив, а МАССИВИЩЩЕ


            int sumRom = x + y;                              // арифметические операции
            int differenceRom = x - y;
            if (differenceRom < 0) {
                throw new Exception("В римской системе счисления нет отрицательных чисел");  // исключение на отрицательные значения в римских расчетах
            }
            int multiplicationRom = x * y;
            int divisionRom = x / y;


            if ((x == 0) || ( y == 0) || (x < 1) || (y < 1) || (x > 10) || (y > 10)) {
                throw new Exception ("Введите корректные данные");
            } else if (operation == '+') {
                String ansver = romeNumbers[sumRom];
                System.out.println(ansver);
            } else if (operation == '-') {
                String ansver = romeNumbers[differenceRom];
                System.out.println(ansver);
            } else if (operation == '*') {
                String ansver = romeNumbers[multiplicationRom];
                System.out.println(ansver);
            } else if (operation == '/') {
                String ansver = romeNumbers[divisionRom];
                System.out.println(ansver);
            }
        }
        // конец римского калькулятора
        // начало арабского калькулятора
        else if (a.contains("1") || a.contains("2") || a.contains("3") || a.contains("4") || a.contains("5") || a.contains("6") || a.contains("7") || a.contains("8") || a.contains("9") || a.contains("10")) {


                int x = Integer.parseInt(a);             // перевод стринг в инт
                int y = Integer.parseInt(b);             // перевод стринг в инт



            int sumArab = x + y;                              // арифметические операции
            int differenceArab = x - y;
            int multiplicationArab = x * y;
            int divisionArab = x / y;

            if ((x == 0) || ( y == 0) || (x < 1) || (y < 1) || (x > 10) || (y > 10)) {
                throw new Exception ("Введите корректные данные");
            } else if (operation == '+') {
                System.out.println(sumArab);
            } else if (operation == '-') {
                System.out.println(differenceArab);
            } else if (operation == '*') {
                System.out.println(multiplicationArab);
            } else if (operation == '/') {
                System.out.println(divisionArab);
            }

            }
        }
    }


