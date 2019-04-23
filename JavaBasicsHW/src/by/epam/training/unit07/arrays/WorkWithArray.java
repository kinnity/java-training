package by.epam.training.unit07.arrays;

import java.util.Random;
import java.util.Scanner;

public class WorkWithArray {
    public static void enterArrayFromConsole(int[] mas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextInt();
        }
    }
    public static void enterArrayFromConsole(double[] mas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            System.out.print("ar[" + i + "] => ");
            mas[i] = sc.nextDouble();
        }
    }
    public static void enterArrayWithRandom(int[] mas) {
        Random rand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(200);
        }
    }
    public static void printArray(int[] mas) {
        System.out.println("-----------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("ar[" + i + "] = " + mas[i]);
        }
        System.out.println("-----------------");
    }
    public static void printArray(double[] mas) {
        System.out.println("-----------------");
        for (int i = 0; i < mas.length; i++) {
            System.out.println("ar[" + i + "] = " + mas[i]);
        }
        System.out.println("-----------------");
    }

}
