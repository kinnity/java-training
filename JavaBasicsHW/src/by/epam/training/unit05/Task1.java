package by.epam.training.unit05;

public class Task1 {
    public static void task1(){

        System.out.println("1. Приложение генерирует 100 случайных чисел. Найти наименьшее и наибольшее число из" +
                "сгенерированных чисел, используя только один цикл.");

        System.out.println("Примечание: генерируемые числа могут быть как положительные, так и отрицательные.\n");

        //Целое число в интервале [-100; +100]
        int a = (int) (Math.random() * (200 + 1)) - 100;
        System.out.print(a + " ");

        int min = a;
        int max = a;

        for (int i = 0; i < 99; i++) {

            //Целое число в интервале [-100; +100]
            a = (int) (Math.random() * (200 + 1)) - 100;
            System.out.print(a + " ");

            if (a < min) {
                min = a;
            } else if (a > max) {
                    max = a;
                }

            // вывод чисел по 10 в строке
            if ((i == 8) || (i % 10 == 8 && i > 10)){
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);
    }

}
