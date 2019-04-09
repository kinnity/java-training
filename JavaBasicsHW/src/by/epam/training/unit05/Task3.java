package by.epam.training.unit05;

import java.util.Scanner;

public class Task3 {
    public static void task3(){
        System.out.println("3. Посчитать общее количество дней во всех месяцах между двумя датами");

        int totalDays = 0;

        System.out.println("Введите начальную дату");
        int monthStart = scanIntMonth();
        int yearStart = scanIntYear();

        System.out.println("Введите конечную дату");
        int monthEnd = scanIntMonth();
        int yearEnd = scanIntYear();

        if ((yearEnd < yearStart) || (yearEnd == yearStart && monthEnd < monthStart)){
            System.out.println("Конечная дата должна быть больше начальной!");
        }
        else {

            if ((yearEnd - yearStart) >= 1) {
                for (int i = yearStart + 1; i < yearEnd; i++) {
                    if (isLeapYear(i)) {
                        totalDays += 366;
                    } else {
                        totalDays += 365;
                    }
                }
            }

            if (yearStart == yearEnd) {
                for (int i = monthStart; i <= monthEnd; i++) {
                    totalDays += returnDaysInMonth(i, yearStart);
                }
            }
            else {
                for (int i = monthStart; i <= 12; i++) {
                    totalDays += returnDaysInMonth(i, yearStart);
                }

                for (int i = 1; i <= monthEnd; i++) {
                    totalDays += returnDaysInMonth(i, yearEnd);
                }
            }

            System.out.println("Общее количество дней во всех месяцах: " + totalDays);
        }

    }

    private static int returnDaysInMonth (int monthNumber, int year){
        int daysInMonth = 0;

        switch (monthNumber) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                }
                else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
            default:
                daysInMonth = 0;
        }
        return daysInMonth;
    }
    private static boolean isLeapYear(int year){
        if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)){
            return true;
        }
        else {
            if ((year % 4 == 0) && (year % 100 == 0)) {
                return false;
            } else {
                return false;
            }
        }
    }

    private static int scanIntMonth(){
        Scanner in = new Scanner(System.in);
        int number = 0;

        while (!(number >= 1 && number <= 12)) {
            System.out.print("Введите месяц: ");
            while (!in.hasNextInt() ) {
                in.next();
                System.out.println("Некорректный ввод!");
                System.out.print("Введите месяц: ");
            }
            number = in.nextInt();
        }
        return number;
    }
    private static int scanIntYear(){
        Scanner in = new Scanner(System.in);
        int number = 0;

        while (!(number >= 1000 && number <= 3000)) {
            System.out.print("Введите год: ");
            while (!in.hasNextInt() ) {
                in.next();
                System.out.print("Введите год: ");
            }
            number = in.nextInt();
        }
        return number;
    }

}
