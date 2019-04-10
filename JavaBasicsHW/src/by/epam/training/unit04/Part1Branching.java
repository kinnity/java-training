package by.epam.training.unit04;

public class Part1Branching {

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
        System.out.println("1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран " +
                "цифру 7, в противном случае – цифру 8.");

        int number1 = 4;
        int number2 = 1;

        if (number1 < number2){
            System.out.println("7");
        } else {
            System.out.println("8");
        }

        System.out.println();
    }
    private static void task02(){
        System.out.println("2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран " +
                "слово «yes», в противном случае – слово «no»");

        int number1 = 4;
        int number2 = 6;

        if (number1 < number2){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println();
    }
    private static void task03(){
        System.out.println("3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово " +
                "«yes», если число а меньше 3; если больше, то вывести слово «no»");

        int a = 4;

        if (a < 3){
            System.out.println("yes");
        } else if (a > 3){
            System.out.println("no");
        }

        System.out.println();
    }
    private static void task04(){
        System.out.println("4. Составить программу: равны ли два числа а и b?");

        int a = 6;
        int b = 6;

        if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число а = " + a + " не равно числу b = " + b);
        }

        System.out.println();
    }
    private static void task05(){
        System.out.println("5. Составить программу: определения наименьшего из двух чисел а и b.");

        int a = 4;
        int b = 6;

        if (a < b){
            System.out.println("Число а = " + a + " меньше числа b = " + b);
        } else if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " меньше числа а = " + a);
        }

        System.out.println();
    }
    private static void task06(){
        System.out.println("6. Составить программу: определения наибольшего из двух чисел а и b");

        int a = 4;
        int b = 0;

        if (a > b){
            System.out.println("Число а = " + a + " больше числа b = " + b);
        } else if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " больше числа а = " + a);
        }

        System.out.println();
    }
    private static void task07(){
        System.out.println("7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных" +
                "значениях a, b, c и х");

        int a = 4;
        int b = 2;
        int c = 10;
        int x = 1;

        int result = a*x*x + b*x + c;

        if (result < 0){
            result = result * (-1);
        }

        System.out.println("Модуль выражения равен " + result);
        System.out.println();
    }
    private static void task08(){
        System.out.println("8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.");

        double a = 0.2;
        double b = 4.3;

        double squareValue = 0;

        if (a < b){
            squareValue = a * a;
        } else {
            squareValue = b * b;
        }
        System.out.println("Наименьший из квадратов чисел а = " + a + " и b = "+ b + " равен " + squareValue);
        System.out.println();
    }
    private static void task09(){
        System.out.println("9. Составить программу, которая определит по трем введенным сторонам, является ли " +
                "данный треугольник равносторонним.");

        int a = 4;
        int b = 4;
        int c = 3;

        if (a == b && b == c){
            System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " является равносторонним");
        } else {
            System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " не является равносторонним");
        }

        System.out.println();
    }
    private static void task10(){
        System.out.println("10. Составить программу, которая определит площадь какого круга меньше.");

        int r1 = 4;
        int r2 = 4;

        if (r1 < r2) {
            System.out.println("Площадь круга с радиусом " + r1 + " меньше площади круга с радиусом " + r2);
        } else if (r1 == r2){
            System.out.println("Площади кругов с радиусом " + r1 + " равны");
        } else {
            System.out.println("Площадь круга с радиусом " + r2 + " меньше площади круга с радиусом " + r1);
        }

        System.out.println();
    }
}
