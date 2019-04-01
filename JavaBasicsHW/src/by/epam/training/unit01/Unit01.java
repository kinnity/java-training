package by.epam.training.unit01;

public class Unit01 {

    public static void allTasks(){
        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
    }

    private static void task01(){
        System.out.println("Задание 1:");
        System.out.println("Hello world!");
        System.out.println();
    }
    private static void task02(){
        System.out.println("Задание 2:");
        System.out.println("ФИО: Зинкевич Елена Геннадьевна");
        System.out.println("Адрес: г.Минск");
        System.out.println("Телефон: 2222222");
        System.out.println();
    }
    private static void task03(){
        System.out.println("Задание 3:");
        System.out.println("Пройдет много лет, и полковник Аурелиано Буэндиа, стоя у стены в ожидании расстрела,\n" +
                "вспомнит тот далекий вечер, когда отец взял его с собой посмотреть на лед. Макондо было\n" +
                "тогда небольшим селением с двумя десятками хижин, выстроенных из глины и бамбука на\n" +
                "берегу реки, которая мчала свои прозрачные воды … ");
        System.out.println();
    }
    private static void task04(){
        System.out.println("Задание 4:");

        int a = 3;
        int b = 4;

        double c = Math.sqrt(a*a + b*b);
        double s = a*b/2;

        System.out.println("Прямоугольный треугольник с катетами a = " + a + " и b = " + b);
        System.out.println("Гипотенуза c = " + c);
        System.out.println("Площадь треугольника S = " + s);
        System.out.println();
    }
    private static void task05(){
        System.out.println("Задание 5:");

        double a = 2.2;
        double b = 3.6;
        double c = 5;
        double d = - 4.1;

        double sum = a + b + c + d;

        System.out.println("4 слагаемых: a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("Сумма sum = " + sum);

        System.out.println();
    }
    private static void task06(){
        System.out.println("Задание 6:");

        double a = 2;
        double b = 3;
        double c = 5;

        double value = Math.pow(a, 2) - Math.pow(b - c, 2) + Math.log(Math.pow(b, 2) + 1);

        System.out.println("3 числа: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Значение выражения = " + value);
        System.out.println("");
    }
    private static void task07(){
        System.out.println("Задание 7:");

        int a = 2;
        int b = 3;

        int c;
        int sum;

        if (a > b) {
            c = 5;
            sum = b + c;
            System.out.println("Сумма b + c = " + sum);
        }
        else {
            if (a == b) {
                System.out.println("Конец");
            }
            else {
                c = 1;
                sum = a + b + c;
                System.out.println("Сумма a + b + c = " + sum);
                System.out.println("Новый год!");
            }
        }
        System.out.println();
    }

}
