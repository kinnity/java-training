package by.epam.training.unit07.arrays;

public class Task7 {
    public static void task7() {
        System.out.println("7. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного " +
                "Z, этим числом. Подсчитать количество замен.");

        double[] array = new double[10];
        double number = 5.5;
        int count = 0;

        System.out.println("Z = " + number);
        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > number) {
                array[i] = number;
                count++;
            }
        }

        WorkWithArray.printArray(array);
        System.out.println("Количество замен: " + count);
        System.out.println();
    }
}
