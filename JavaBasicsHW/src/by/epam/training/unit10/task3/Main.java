package by.epam.training.unit10.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        students[0] = new Student("Иванов", "Валентин", 10, new int[]{10, 9, 9, 10, 10});
        students[1] = new Student("Петров", "Александр", 10, generateStudentMarks());
        students[2] = new Student("Александров", "Михаил", 12, generateStudentMarks());
        students[3] = new Student("Иванова", "Марина", 12, new int[]{10, 9, 8, 10, 10});

        for (int i = 0; i < 4; i++) {
            System.out.println(students[i]);
        }

        System.out.println("Отличники:");

        for (int i = 0; i < 4; i++) {
            if (students[i].isAStudent()) {
                System.out.println("surname='" + students[i].getSurname() + '\'' +
                        ", groupNumber=" + students[i].getGroupNumber());
            }
        }

    }

    public static int generateMark() {
        int min = 1;
        int max = 10;
        int diff = max - min;
        Random random = new Random();
        return random.nextInt(diff + 1);
    }

    public static int[] generateStudentMarks() {
        int[] marks = new int[5];
        for (int i = 0; i < 5; i++) {
            marks[i] = generateMark();
        }
        return marks;
    }
}
