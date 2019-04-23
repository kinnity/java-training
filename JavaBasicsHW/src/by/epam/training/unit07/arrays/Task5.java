package by.epam.training.unit07.arrays;

public class Task5 {
    public static void task5() {
        System.out.println("5. Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой " +
                "последовательности. Если таких чисел нет, то вывести сообщение об этом факте.");

        int[] array = new int[10];
        int[] newArray = new int[10];
        int flag = 0;

        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArray[j] = array[i];
                j++;
                flag++;
            }
        }

        if (flag > 0) {
            WorkWithArray.printArray(newArray);
        } else {
            System.out.println("Последовательность не содержит четных чисел");
        }
        System.out.println();
    }
}
