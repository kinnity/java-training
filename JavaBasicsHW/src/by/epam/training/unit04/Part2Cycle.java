package by.epam.training.unit04;

public class Part2Cycle {
    public static void allTasks() {
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();



    }

    private static void task01() {
        System.out.println("1. Необходимо вывести на экран числа от 1 до 5");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    private static void task02() {
        System.out.println("2. Необходимо вывести на экран числа от 5 до 1. ");

        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    private static void task03() {
        System.out.println("3. Необходимо вывести на экран таблицу умножения на 3");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 3 = " + i * 3);
        }

        System.out.println();
    }
    private static void task04() {
        System.out.println("4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне " +
                "от 2 до 100 включительно.");
        int i = 2;

        while (i <= 100) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        System.out.println();
    }
    private static void task05() {
        System.out.println("5. С помощью оператора while напишите программу определения суммы всех нечетных " +
                "чисел в диапазоне от 1 до 99 включительно.");
        int i = 1;
        int sum = 0;

        while (i <= 99) {
            sum += i;
            i += 2;
        }
        System.out.println("Сумма нечетных чисел равна " + sum);

        System.out.println();
    }
    private static void task06() {
        System.out.println("6. Напишите программу, где пользователь вводит любое целое положительное число. А " +
                "программа суммирует все числа от 1 до введенного пользователем числа.");
        int i = 1;
        int number = 15;
        int sum = 0;

        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
        System.out.println();
    }
    private static void task07() {
        System.out.println("7. Вычислить значения функции на отрезке [а,b] c шагом h");
        int a = -3;
        int b = 9;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println();
    }
    private static void task08() {
        System.out.println("8. Вычислить значения функции на отрезке [а,b] c шагом h");

        int a = -3;
        int b = 16;
        int h = 2;
        int c = 1;
        int y;

        for (int i = a; i <= b; i += h) {
            if (i == 15) {
                y = (i + c) * 2;
            } else {
                y = (i - c) + 6;
            }
            System.out.println("При х = " + i + " у = " + y);
        }

        System.out.println();
    }
    private static void task09() {
        System.out.println("9. Найти сумму квадратов первых ста чисел.");

        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }

        System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
        System.out.println();
    }
    private static void task10() {
        System.out.println("10. Составить программу нахождения произведения квадратов первых двухсот чисел.");

        double composition = 1;
        int count = 0;
        double number = -5.0;

        while (count <= 200) {
            composition *= number * number;
            number += 0.01;
            count++;
        }

        System.out.println("Произведение квадратов чисел равно " + composition);
        System.out.println();
    }
    private static void task11() {
        System.out.println("11. Составить программу нахождения разности кубов первых двухсот чисел");

        double difference = 0;
        int count = 0;
        double number = -30.0;

        while (count <= 200) {
            difference -= Math.pow(number, 3);
            number += 0.5;
            count++;
        }

        System.out.println("Разность кубов чисел равна " + difference);
        System.out.println();
    }
    private static void task12() {
        System.out.println("12. Последовательность аn строится так: а1 = 1, an =6 + аn-1 , для каждого n > 1 Составьте " +
                "программу нахождения произведения первых 10 членов этой последовательности");

        long composition = 1L;
        int an = 1;

        for (int i = 2; i <= 10; i++) {
            an = 6 + an;
            composition *= an;
        }

        System.out.println("Произведение первых 10 членов последовательности равно " + composition);
        System.out.println();
    }
    private static void task13() {
        System.out.println("13. Составить таблицу значений функции y = 5 - x^2 / 2 на отрезке [-5; 5] с шагом 0.5.");

        int a = -5;
        int b = 5;
        double h = 0.5;
        double y;

        for (double i = a; i <= b; i += h) {

            y = 5 - (i * i) / 2.0;
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println();
    }
    private static void task14() {
        System.out.println("14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.");

        int n = 7;
        double sum = 0;

        for (double i = 1; i <= n; i++) {
            sum += 1 / i;

        }

        System.out.println("При n = " + n + " сумма равна " + sum);
        System.out.println();
    }
    private static void task15() {
        System.out.println("15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.");

        int sum = 0;

        for (double i = 0; i <= 10; i++) {
            sum += Math.pow(2, i);
        }

        System.out.println("Сумма равна " + sum);
        System.out.println();
    }
    private static void task16() {
        System.out.println("16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).");

        int sum = 3;
        long composition = sum;

        for (double i = 3; i <= 10; i++) {
            sum += i;
            composition *= sum;
        }

        System.out.println("Произведение равно " + composition);
        System.out.println();
    }
    private static void task17() {
        System.out.println("17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)");

        int n = 4;
        double a = 1.3;
        double composition = 1;

        for (int i = 0; i < n; i++) {
            composition *= a + i;
        }

        System.out.println("Произведение равно " + composition);
        System.out.println();
    }
    private static void task18() {
        System.out.println("18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");

        double sum = 0.0;
        double e = 0.1;
        double an = 0.0;
        int n = 50;

        for (int i = 2; i <= n; i++) {
            an = Math.pow(-1, i - 1) / i;
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);
        System.out.println();
    }
    private static void task19() {
        System.out.println("19. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");

        double sum = 0.0;
        double e = 0.1;
        double an = 0.0;
        int n = 10;

        for (int i = 0; i <= n; i++) {
            an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);
        System.out.println();
    }
    private static void task20() {
        System.out.println("20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");

        double sum = 0.0;
        double e = 0.1;
        double an = 0.0;
        int n = 10;

        for (int i = 0; i <= n; i++) {
            an = 1.0 / ((3 * i - 2) * (3 * i + 1));
            if (Math.abs(an) >= e ){
                sum += an;
            }
        }

        System.out.println("Сумма равна " + sum);
        System.out.println();
    }
    private static void task21() {
        System.out.println("21. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h." +
                "Результат представить в виде таблицы, первый столбец которой – значения аргумента," +
                "второй - соответствующие значения функции F(x) = x − sin(x)");

        double a = 0.0;
        double b = 7;
        double h = 0.2;
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) {

            y = i - Math.sin(i);
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
        System.out.println();
    }
    private static void task22() {
        System.out.println("22. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h." +
                "Результат представить в виде таблицы, первый столбец которой – значения аргумента," +
                "второй - соответствующие значения функции F(x) = sin^2(x)");

        double a = 0.0;
        double b = 7;
        double h = 0.2;
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) {

            y = Math.sin(i) * Math.sin(i);
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
        System.out.println();
    }
    private static void task23() {
        System.out.println("23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h." +
                "Результат представить в виде таблицы, первый столбец которой – значения аргумента," +
                "второй - соответствующие значения функции F(x) = ctg(x/3) + sin(x)/2");

        double a = 0.2;
        double b = 7;
        double h = 0.2;
        double y = 0.0;

        System.out.println(" -----------------------");
        System.out.println("|     x     |     y     |");

        for (double i = a; i <= b; i += h) {

            y = 1 / Math.tan(i / 3) + Math.sin(i) / 2;
            System.out.println(" -----------------------");
            System.out.printf("|%-11f|%-11f|\n", i , y);
        }

        System.out.println(" -----------------------");
        System.out.println();
    }
    private static void task24() {
        System.out.println("24. Вводится натуральное число. Найти сумму четных цифр, входящих в его состав. " +
                "Преобразовать его в другое число, цифры которого будут следовать в обратном порядке по " +
                "сравнению с введенным числом.");

        int number = 1234567;
        String string = "";
        String newString = "";
        int sum = 0;
        int symbol = 0;

        string = Integer.toString(number);
        for (int i = 1; i < string.length(); i+= 2){
            symbol = string.charAt(i) - '0';
            sum += symbol;
        }

        for (int i = string.length() - 1; i >= 0; i--){
            newString += string.charAt(i);
        }

        int newNumber = Integer.parseInt(newString);

        System.out.println("Cумма четных цифр, входящих в состав числа " + number + ", равна " + sum);
        System.out.println("Новое число: " + newNumber);

        System.out.println();
    }
    private static void task25() {
        System.out.println("25. Требуется определить факториал числа, которое ввел пользователь.");

        int number = 5;
        int result = 1;

        if (number == 0){
            result = 1;
        } else {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }

        System.out.println("Факториал числа " + number + " равен " + result);
        System.out.println();
    }
    private static void task26() {
        System.out.println("26. Вывести на экран соответствий между символами и их численными обозначениями в " +
                "памяти компьютера (Таблицу ASCII).");

        for (int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

        System.out.println();
    }
}
