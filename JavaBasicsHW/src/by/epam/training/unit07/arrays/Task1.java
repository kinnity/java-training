package by.epam.training.unit07.arrays;

public class Task1 {
    public static void task1() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");

        int k = 2;
        int[] a = new int[10];
        int sum = 0;

        WorkWithArray.enterArrayWithRandom(a);
        WorkWithArray.printArray(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % k == 0) {
                sum += a[i];
            }
        }

        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
        System.out.println();
    }
}
