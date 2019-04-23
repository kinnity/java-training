package by.epam.training.unit07.arrays;

public class Task4 {
    public static void task4() {
        System.out.println("4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.");

        double[] array = new double[5];
        int flag = 0;

        WorkWithArray.enterArrayFromConsole(array);

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                flag++;
                break;
            }
        }

        if (flag > 0) {
            System.out.println("Последовательность не является возрастающей");
        } else {
            System.out.println("Последовательность является возрастающей");
        }
        System.out.println();
    }
}
