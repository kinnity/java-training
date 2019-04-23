package by.epam.training.unit07.arrays;

public class Task8 {
    public static void task8() {
        System.out.println("8. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, " +
                "положительных и нулевых элементов.");

        int count = 10;
        double[] array = new double[count];
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] == 0) {
                zeroCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("В массиве " + positiveCount + " положительных, " + negativeCount + " отрицательных и " + zeroCount + " нулевых элементов");
        System.out.println();
    }
}
