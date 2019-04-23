package by.epam.training.unit07.arrays;

public class Task10 {
    public static void task10() {
        System.out.println("10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i");

        int[] array = new int[10];

        WorkWithArray.enterArrayFromConsole(array);

        System.out.println("Числа, для которых а[i] > i: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.println("ar[" + i + "] = " + array[i]);
            }
        }

        System.out.println();
    }
}
