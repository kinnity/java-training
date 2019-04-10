package by.epam.training.unit04;

public class Part1Branching {

    public static void allTasks() {

        task01();
        task02();
        task03();
        task04();
        task05();

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
}
