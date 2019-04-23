package by.epam.training.unit07.arrays;

public class Task3 {
    public static void task3() {
        System.out.println("3. Дана последовательность целых чисел а1 а2,..., аn . Выяснить, какое число встречается раньше - " +
                "положительное или отрицательное.");

        int[] array = new int[5];
        int flag = 0; // 0 - положительное, 1 - отрицательное

        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                flag++;
                break;
            }
        }

        if (flag > 0) {
            System.out.println("Отрицательное число встречается раньше. ");
        } else {
            System.out.println("Положительное число встречается раньше. ");
        }
        System.out.println();

    }
}
