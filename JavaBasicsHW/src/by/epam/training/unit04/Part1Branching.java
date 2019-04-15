package by.epam.training.unit04;

public class Part1Branching {

    public static void allTasks() {

        task01();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
        task08();
        task09();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();

    }

    private static void task01(){
        System.out.println("1. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран " +
                "цифру 7, в противном случае – цифру 8.");

        int number1 = 4;
        int number2 = 1;

        if (number1 < number2){
            System.out.println("7");
        } else {
            System.out.println("8");
        }

        System.out.println();
    }
    private static void task02(){
        System.out.println("2. Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести на экран " +
                "слово «yes», в противном случае – слово «no»");

        int number1 = 4;
        int number2 = 6;

        if (number1 < number2){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        System.out.println();
    }
    private static void task03(){
        System.out.println("3. Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово " +
                "«yes», если число а меньше 3; если больше, то вывести слово «no»");

        int a = 4;

        if (a < 3){
            System.out.println("yes");
        } else if (a > 3){
            System.out.println("no");
        }

        System.out.println();
    }
    private static void task04(){
        System.out.println("4. Составить программу: равны ли два числа а и b?");

        int a = 6;
        int b = 6;

        if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число а = " + a + " не равно числу b = " + b);
        }

        System.out.println();
    }
    private static void task05(){
        System.out.println("5. Составить программу: определения наименьшего из двух чисел а и b.");

        int a = 4;
        int b = 6;

        if (a < b){
            System.out.println("Число а = " + a + " меньше числа b = " + b);
        } else if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " меньше числа а = " + a);
        }

        System.out.println();
    }
    private static void task06(){
        System.out.println("6. Составить программу: определения наибольшего из двух чисел а и b");

        int a = 4;
        int b = 0;

        if (a > b){
            System.out.println("Число а = " + a + " больше числа b = " + b);
        } else if (a == b){
            System.out.println("Число а = " + a + " равно числу b = " + b);
        } else {
            System.out.println("Число b = " + b + " больше числа а = " + a);
        }

        System.out.println();
    }
    private static void task07(){
        System.out.println("7. Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных" +
                "значениях a, b, c и х");

        int a = 4;
        int b = 2;
        int c = 10;
        int x = 1;

        int result = a*x*x + b*x + c;

        if (result < 0){
            result = result * (-1);
        }

        System.out.println("Модуль выражения равен " + result);
        System.out.println();
    }
    private static void task08(){
        System.out.println("8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.");

        double a = 0.2;
        double b = 4.3;

        double squareValue = 0;

        if (a < b){
            squareValue = a * a;
        } else {
            squareValue = b * b;
        }
        System.out.println("Наименьший из квадратов чисел а = " + a + " и b = "+ b + " равен " + squareValue);
        System.out.println();
    }
    private static void task09(){
        System.out.println("9. Составить программу, которая определит по трем введенным сторонам, является ли " +
                "данный треугольник равносторонним.");

        int a = 4;
        int b = 4;
        int c = 3;

        if (a == b && b == c){
            System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " является равносторонним");
        } else {
            System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " не является равносторонним");
        }

        System.out.println();
    }
    private static void task10(){
        System.out.println("10. Составить программу, которая определит площадь какого круга меньше.");

        int r1 = 4;
        int r2 = 4;

        if (r1 < r2) {
            System.out.println("Площадь круга с радиусом " + r1 + " меньше площади круга с радиусом " + r2);
        } else if (r1 == r2){
            System.out.println("Площади кругов с радиусом " + r1 + " равны");
        } else {
            System.out.println("Площадь круга с радиусом " + r2 + " меньше площади круга с радиусом " + r1);
        }

        System.out.println();
    }
    private static void task11(){
        System.out.println("11. Составить программу, которая определит площадь какого треугольника больше.");

        int a1 = 4;
        int b1 = 4;
        int c1 = 4;
        int a2 = 2;
        int b2 = 2;
        int c2 = 2;

        int p1 = (a1 + b1 + c1) / 2;
        int p2 = (a2 + b2 + c2) / 2;

        double s1 = Math.sqrt(p1 * (p1 - a1) * (p1 - b1) * (p1 - c1));
        double s2 = Math.sqrt(p2 * (p2 - a2) * (p2 - b2) * (p2 - c2));

        if (s1 < s2) {
            System.out.println("Площадь треугольника 1 меньше площади треугольника 2");
        } else if (s1 == s2){
            System.out.println("Площади треугольников 1 и 2 равны");
        } else {
            System.out.println("Площадь треуголька 2 меньше площади треугольника 1");
        }

        System.out.println();
    }
    private static void task12(){
        System.out.println("12. Даны три действительных числа. Возвести в квадрат те из них, значения которых " +
                "неотрицательны, и в четвертую степень — отрицательные.");

        double number1 = 2.0;
        double number2 = - 1.2;
        double number3 = 0.0;

        System.out.println("Числа: " + number1 + ", " + number2 + ", " + number3);

        if (number1 >= 0) {
            number1 = number1 * number1;
        } else {
            number1 = Math.pow(number1, 4);
        }

        if (number2 >= 0) {
            number2 = number2 * number2;
        } else {
            number2 = Math.pow(number2, 4);
        }

        if (number3 >= 0) {
            number3 = number3 * number3;
        } else {
            number3 = Math.pow(number3, 4);
        }
        System.out.println("Новые значения: " + number1 + ", " + number2 + ", " + number3);

        System.out.println();
    }
    private static void task13(){
        System.out.println("13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из " +
                "точек находится ближе к началу координат.");

        double x1 = 2.0;
        double y1 = - 1.2;
        double x2 = 0.0;
        double y2 = 1.0;

        double length1 = Math.sqrt(x1 * x1 + y1 * y1);
        double length2 = Math.sqrt(x2 * x2 + y2 * y2);

        if (length1 < length2) {
            System.out.println("Точка (" + x1 + ", " + y1 + ") ближе к началу координат, чем точка (" + x2 + ", " + y2 + ")");
        } else if (length1 == length2){
            System.out.println("Точка (" + x1 + ", " + y1 + ") на таком же растоянии от начала координат как точка (" + x2 + ", " + y2 + ")");
        } else {
            System.out.println("Точка (" + x1 + ", " + y1 + ") дальше от начала координат, чем точка (" + x2 + ", " + y2 + ")");
        }

        System.out.println();
    }
    private static void task14(){
        System.out.println("14. Даны два угла треугольника (в градусах). Определить, существует ли такой " +
                "треугольник, и если да, то будет ли он прямоугольным.");

        int corner1 = 60;
        int corner2 = 30;

        int corner3 = 180 - corner1 - corner2;

        if (corner1 > 0 && corner2 > 0 && corner3 > 0) {
            System.out.println("Треугольник существует");
            if (corner1 == 90 || corner2 == 90 || corner3 == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }

        System.out.println();
    }
    private static void task15(){
        System.out.println("15. Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел " +
                "заменить половиной их суммы, а большее — их удвоенным произведением.");

        double x = 2.0;
        double y = 3.3;
        double newX = 0.0;
        double newY = 0.0;

        if (x < y) {
            newX = (x + y) / 2;
            newY = 2 * x * y;
        } else {
            newY = (x + y) / 2;
            newX = 2 * x * y;
        }
        System.out.println("Для чисел " + x + " и " + y + " новые значения: " + newX + " и " + newY);
        System.out.println();
    }
    private static void task16(){
        System.out.println("16. На плоскости ХОY задана своими координатами точка А. Указать, где она расположена " +
                "(на какой оси или в каком координатном угле).");

        double x = 3.0;
        double y = -5.0;

        if (x > 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка (" + x + ", " + y + ") находится в 3 четверти");
        } else if (x > 0 && y < 0){
            System.out.println("Точка (" + x + ", " + y + ") находится в 4 четверти");
        } else if (x == 0 && y != 0){
            System.out.println("Точка (" + x + ", " + y + ") находится на оси y");
        } else if (x != 0 && y == 0){
            System.out.println("Точка (" + x + ", " + y + ") находится на оси x");
        } else if (x == 0 && y == 0){
            System.out.println("Точка (" + x + ", " + y + ") находится в начале координат");
        }

        System.out.println();
    }
    private static void task17(){
        System.out.println("17. Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем " +
                "же числом, равным большему из исходных, а если равны, то заменить числа нулями.");

        int m = 3;
        int n = 6;
        System.out.println("Исходные числа: " + m + ", " + n);

        if (m != n) {
            if (m > n) {
                n = m;
            } else {
                m = n;
            }
        } else {
            m = 0;
            n = 0;
        }

        System.out.println("Полученные числа: " + m + ", " + n);
        System.out.println();
    }
    private static void task18(){
        System.out.println("18. Подсчитать количество отрицательных среди чисел а, b, с");

        int a = 3;
        int b = 6;
        int c = -3;
        int count = 0;

        if (a < 0) {
            count++;
        }
        if (b < 0) {
            count++;
        }
        if (c < 0) {
            count++;
        }

        System.out.println("Среди чисел " + a + ", " + b + ", " + c + " количество отрицательных: " + count);
        System.out.println();
    }
    private static void task19(){
        System.out.println("19. Подсчитать количество положительных среди чисел а, b, с.");

        int a = 3;
        int b = 6;
        int c = -3;
        int count = 0;

        if (a > 0) {
            count++;
        }
        if (b > 0) {
            count++;
        }
        if (c > 0) {
            count++;
        }

        System.out.println("Среди чисел " + a + ", " + b + ", " + c + " количество положительных: " + count);
        System.out.println();
    }
    private static void task20(){
        System.out.println("20. Определить, делителем каких чисел а, b, с является число k.");

        int a = 3;
        int b = 6;
        int c = -4;
        int k = 2;

        if (a % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + a);
        }
        if (b % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + b);
        }
        if (c % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + c);
        }

        System.out.println();
    }
    private static void task21(){
        System.out.println("21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? " +
                "Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся " +
                "девочки!» или «Мне нравятся мальчики!».");

        char answer = 'О';
        System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
        System.out.println(answer);

        switch (answer) {
            case 'Д':
                System.out.println("Мне нравятся девочки!");
                break;
            case 'М':
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                System.out.println("Неверное значение!");
        }
        System.out.println();
    }

}
