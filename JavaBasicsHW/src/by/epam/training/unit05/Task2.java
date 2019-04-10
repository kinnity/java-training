package by.epam.training.unit05;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.util.Scanner;

public class Task2 {
    public static void task2() throws FileNotFoundException {

        System.out.println("2. Вывести на консоль сумму каждой строки");

        Scanner fileScanner = new Scanner(new File("./src/by/epam/training/unit05/data.txt"));
        String string;
        int sum = 0;

        while (fileScanner.hasNextLine()) {

            string = fileScanner.nextLine();

            Scanner lineScanner = new Scanner(string);
            if (lineScanner.hasNext()) {
                while (lineScanner.hasNext()) {

                    int number = lineScanner.nextInt();
                    sum += number;

                }
                System.out.println(" -----------");
                System.out.printf("|%7d\t|\n", sum);
                sum = 0;
            }
        }
        System.out.println(" -----------");
    }

}
