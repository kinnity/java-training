package by.epam.training.unit07.arrays;

public class Task9 {
    public static void task9() {
        System.out.println("9. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.");

        double[] array = new double[10];
        int minIndex = 0;
        int maxIndex = 0;
        double min;
        double max;

        WorkWithArray.enterArrayFromConsole(array);

        min = array[0];
        max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            } else if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        double temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        WorkWithArray.printArray(array);

        System.out.println();
    }
}
