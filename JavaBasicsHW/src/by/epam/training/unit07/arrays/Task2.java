package by.epam.training.unit07.arrays;

public class Task2 {
    public static void task2() {
        System.out.println("2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.");

        int[] array = new int[10];
        int[] newArray = new int[10];

        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] == 0) {
                newArray[j] = i;
                j++;
            }
        }

        System.out.println("Новый массив:");

        WorkWithArray.printArray(newArray);
        System.out.println();
    }
}
