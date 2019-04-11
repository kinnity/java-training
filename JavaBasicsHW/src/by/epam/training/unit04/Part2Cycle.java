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

    }

    private static void task01(){
        System.out.println("1. Необходимо вывести на экран числа от 1 до 5");

        for (int i = 1; i <= 5; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    private static void task02(){
        System.out.println("2. Необходимо вывести на экран числа от 5 до 1. ");

        for (int i = 5; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
    }
    private static void task03(){
        System.out.println("3. Необходимо вывести на экран таблицу умножения на 3");

        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * 3 = " + i * 3);
        }

        System.out.println();
    }
    private static void task04(){
        System.out.println("4. С помощью оператора while напишите программу вывода всех четных чисел в диапазоне " +
                "от 2 до 100 включительно.");
        int i = 2;

        while (i <= 100){
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();
        System.out.println();
    }
    private static void task05(){
        System.out.println("5. С помощью оператора while напишите программу определения суммы всех нечетных " +
                "чисел в диапазоне от 1 до 99 включительно.");
        int i = 1;
        int sum = 0;

        while (i <= 99){
            sum += i;
            i += 2;
        }
        System.out.println("Сумма нечетных чисел равна " + sum);

        System.out.println();
    }
    private static void task06(){
        System.out.println("6. Напишите программу, где пользователь вводит любое целое положительное число. А " +
                "программа суммирует все числа от 1 до введенного пользователем числа.");
        int i = 1;
        int number = 15;
        int sum = 0;

        while (i <= number){
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел от 1 до " + number + " равна " + sum);
        System.out.println();
    }
    private static void task07(){
        System.out.println("7. Вычислить значения функции на отрезке [а,b] c шагом h");
        int a = -3;
        int b = 9;
        int h = 2;
        int y;

        for (int i = a; i <= b; i += h){
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
        System.out.println();
    }
    private static void task08(){
        System.out.println("8. Вычислить значения функции на отрезке [а,b] c шагом h");

        int a = -3;
        int b = 16;
        int h = 2;
        int c = 1;
        int y;

        for (int i = a; i <= b; i += h){
            if (i == 15) {
                y = (i + c) * 2;
            } else {
                y = (i - c) + 6;
            }
            System.out.println("При х = " + i + " у = " + y);
        }

        System.out.println();
    }
    private static void task09(){
        System.out.println("9. Найти сумму квадратов первых ста чисел.");

        int sum = 0;

        for (int i = 1; i <= 100; i ++){
            sum += i * i;
        }

        System.out.println("Сумма квадратов чисел от 1 до 100 равна " + sum);
        System.out.println();
    }
    private static void task10(){
        System.out.println("10. Составить программу нахождения произведения квадратов первых двухсот чисел.");

        double composition = 1;
        int count = 0;
        double number = - 5.0;

        while (count <= 200) {
            composition *= number * number;
            number += 0.01;
            count++;
        }

        System.out.println("Произведение квадратов чисел от 1 до 200 равна " + composition);
        System.out.println();
    }
}
