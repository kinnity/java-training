package by.epam.training.unit02;

public class Unit02 {
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
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();
        task36();
        task37();
        task38();
        task39();
        task40();

    }
    private static void task01(){
        System.out.println("1. Даны два действительных числа х и у. Вычислить их сумму, разность, произведение и частное.");

        double a = 5.3;
        double b = 1.2;

        double sum = a + b;
        System.out.println("Сумма чисел " + a + " и " + b + " равна " + sum);

        double difference = a - b;
        System.out.println("Разность чисел " + a + " и " + b + " равна " + difference);

        double composition = a * b;
        System.out.println("Произведение чисел " + a + " и " + b + " равно " + composition);

        double quotient = a / b;
        System.out.println("Частное чисел " + a + " и " + b + " равно " + quotient);

        System.out.println();
    }
    private static void task02(){
        System.out.println("2. Найдите значение функции: с = 3 + а.");

        double a = 1.3;

        double c = 3 + a;
        System.out.println("При а = " + a + " значение функции с = " + c);

        System.out.println();
    }
    private static void task03(){
        System.out.println("3. Найдите значение функции: z = z = 2 * x + (y - 2) * 5.");

        double x = 3.3;
        double y = 2.0;

        double z = 2 * x + (y - 2) * 5;
        System.out.println("При x = " + x + " и y = " + y + " значение функции z = " + z);

        System.out.println();
    }
    private static void task04(){
        System.out.println("4. Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.");

        double a = 3.5;
        double b = 2.0;
        double c = 1.2;

        double z = ((a - 3) * b / 2.0) + c;
        System.out.println("При a = " + a + ", b = " + b + " и c = " + c +" значение функции z = " + z);

        System.out.println();
    }
    private static void task05(){
        System.out.println("5. Составить алгоритм нахождения среднего арифметического двух чисел.");

        double a = 4.8;
        double b = 2.0;

        double average = (a + b) / 2.0;
        System.out.println("При a = " + a + ", b = " + b + "  среднее арифметическое = " + average);

        System.out.println();
    }
    private static void task06(){
        System.out.println("6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока " +
                "в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?.");

        int n = 8;
        double nSum = 80;
        int m = 2;
        double mDifferencePerOne = 12.0;

        double mSum = m * (nSum / n + mDifferencePerOne);
        System.out.println("При n = " + n + ", m = " + m + " в m больших бидонах " + mSum + " литров молока");

        System.out.println();
    }
    private static void task07(){
        System.out.println("7. Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника");

        double length = 10;
        double width = length / 2;

        double area = length * width;
        System.out.println("При длине = " + length + " ширина = " + width + " и площадь прямоугольника равна " + area);

        System.out.println();
    }
    private static void task08(){
        System.out.println("8. Вычислить значение выражения по формуле (все переменные принимают действительные значения)");

        double a = 1.0;
        double b = 0.25;
        double c = 4.0;

        double result = (b + Math.sqrt(b*b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Значение выражения равно " + result);
        System.out.println();
    }
    private static void task09(){
        System.out.println("9. Вычислить значение выражения по формуле (все переменные принимают действительные значения)");

        double a = 1.5;
        double b = 1.0;
        double c = 0.5;
        double d = 3.0;

        double result = (a / c) * (b / d) - ((a * b - c) / (c * d));

        System.out.println("Значение выражения равно " + result);
        System.out.println();
    }
    private static void task10(){
        System.out.println("10. Вычислить значение выражения по формуле (все переменные принимают действительные значения)");

        double x = 60; // значения в градусах
        double y = 60;

        //перевод в радианы
        double xRad = x * Math.PI / 180.0;
        double yRad = y * Math.PI / 180.0;

        double result = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);

        System.out.println("Значение выражения равно " + result);
        System.out.println();
    }
    private static void task11(){
        System.out.println("11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b двух катетов. ");

        double a = 3.0;
        double b = 4.0;

        double c = Math.sqrt(a*a + b*b); // гипотенуза
        double s = a*b/2;
        double p = a + b + c;

        System.out.println("Прямоугольный треугольник с катетами a = " + a + " и b = " + b);
        System.out.println("Площадь треугольника S = " + s);
        System.out.println("Периметр треугольника P = " + p);
        System.out.println();
    }
    private static void task12(){
        System.out.println("12. Вычислить расстояние между двумя точками с данными координатами (х1, у1) и (x2, у2).");

        double x1 = 1.3;
        double x2 = 5.3;
        double y1 = -1.1;
        double y2 = 2.1;

        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Расстояние между точками (" + x1 + ", " + y1 + ") и (" + x2 + ", " + y2 + ") равно " + length);
        System.out.println();
    }
    private static void task13(){
        System.out.println("13. Заданы координаты трех вершин треугольника (х1, у2),(х2, у2),(х3, у3). Найти его периметр и площадь.");

        double x1 = 1.0;
        double x2 = 1.0;
        double x3 = 5.0;
        double y1 = 1.0;
        double y2 = 4.0;
        double y3 = 1.0;

        // длины сторон треугольника
        double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double p = a + b + c;
        double pHalf = p / 2.0;
        double s = Math.sqrt(pHalf * (pHalf - a) * (pHalf - b) * (pHalf - c)); // формула Герона

        System.out.println("Периметр треугольника P = " + p);
        System.out.println("Площадь треугольника S = " + s);
        System.out.println();
    }
    private static void task14(){
        System.out.println("14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R.");

        double r = 3.5;

        double length = 2 * Math.PI * r;
        double s = Math.PI * r * r;

        System.out.println("Для круга с R = " + r + " длина окружности равна " + length + ", площадь круга равна " + s);
        System.out.println();
    }
    private static void task15(){
        System.out.println("15. Написать программу, которая выводит на экран первые четыре степени числа π.");

        for (int i = 1; i <= 5; i++){
            System.out.println("Pi^" + i + " = " + Math.pow(Math.PI, i));
        }

        System.out.println();
    }
    private static void task16(){
        System.out.println("16. Найти произведение цифр заданного четырехзначного числа.");

        int number = 1230;
        int composition = 1;

        while (number > 0){
            composition = composition * (number % 10);
            number = number / 10;
        }

        System.out.println("Произведение цифр числа равно " + composition);
        System.out.println();
    }
    private static void task17(){
        System.out.println("17. Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.");

        double number1 = 2.4;
        double number2 = -5.8;

        double avgArithmetic = (Math.pow(number1, 3) + Math.pow(number2, 3)) / 2;
        double avgGeometric = Math.sqrt(Math.abs(number1) * Math.abs(number2));

        System.out.println("Среднее арифметическое кубов чисел равно " + avgArithmetic);
        System.out.println("Среднее геометрическое модулей чисел равно " + avgGeometric);
        System.out.println();
    }
    private static void task18(){
        System.out.println("18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. ");

        double a = 2.7;

        double s = a * a;
        double sAll = s * 6;
        double v = Math.pow(a, 3);

        System.out.println("Площадь грани равна " + s);
        System.out.println("Площадь полной поверхности равна " + sAll);
        System.out.println("Объем куба равен " + v);
        System.out.println();
    }
    private static void task19(){
        System.out.println("19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.");

        double a = 2.4;

        double s = (a * a * Math.sqrt(3)) / 4;
        double h = a * Math.sqrt(3) / 2;
        double rIn = a * Math.sqrt(3) / 6;
        double rOut = a * Math.sqrt(3) / 3;

        System.out.println("Площадь треугольника равна " + s);
        System.out.println("Высота равна " + h);
        System.out.println("Радиус вписанной окружности равен " + rIn);
        System.out.println("Радиус описанной окружности равен " + rOut);
        System.out.println();
    }
    private static void task20(){
        System.out.println("20. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.");

        double length = 6.29;

        double r = length / (2 * Math.PI);
        double s = Math.PI * r * r;

        System.out.println("Для круга с R = " + r + " длина окружности равна " + length + ", площадь круга равна " + s);
        System.out.println();
    }
    private static void task21(){
        System.out.println("21. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
                "Поменять местами дробную и целую части числа и вывести полученное значение числа. ");

        double init = 123.456;

        int firstPart = (int) init;
        int secondPart = (int)((init - firstPart) * 1000);
        double result = secondPart + firstPart * 0.001;

        System.out.println("Исходное число " + init);
        System.out.println("Полученное число " + result);
        System.out.println();
    }
    private static void task22(){
        System.out.println("22. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. ");

        int init = 3735;

        int hours = (init / 3600);

        int temp = init - (hours * 3600);
        int minutes = temp / 60;

        int seconds = temp - (minutes * 60);

        System.out.println("Исходная длительность в секундах: " + init);
        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    private static void task23(){
        System.out.println("23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R > r).");

        double rIn = 1.3;
        double rOut = 2.5;

        double s = Math.PI * (rOut * rOut - rIn * rIn);

        System.out.println("Площадь кольца с r = " + rIn + " и R = " + rOut + " равна " + s);
        System.out.println();
    }
    private static void task24(){
        System.out.println("24. Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.");

        double a = 2.5;
        double b = 1.7;
        double corner = 45;

        //перевод в радианы
        double cornerRad = corner * Math.PI / 180.0;

        double s = ((a * a - b * b) / 4) * Math.tan(cornerRad);

        System.out.println("Площадь трапеции с a = " + a + ", b = " + b + " и α = " + corner + " равна " + s);
        System.out.println();
    }
    private static void task25(){
        System.out.println("25. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается, что а≠0 и что дискриминант уравнения неотрицателен).");

        double a = 1;
        double b = 3;
        double c = -4;

        double d = b * b - 4 * a * c;
        double x1 = (- b + Math.sqrt(d)) / (2 * a);
        double x2 = (- b - Math.sqrt(d)) / (2 * a);

        System.out.println(a + "х2 + " + b + "х + " + c + " = 0");
        System.out.println("x1 = " + x1 + ", x2 = " + x2);
        System.out.println();
    }
    private static void task26(){
        System.out.println("26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. ");

        double a = 2.0;
        double b = 1.0;
        double corner = 30;

        //перевод в радианы
        double cornerRad = corner * Math.PI / 180.0;

        double s = 0.5 * a * b * Math.sin(cornerRad);

        System.out.println("Площадь треугольника с a = " + a + ", b = " + b + " и α = " + corner + " равна " + s);
        System.out.println();
    }
    private static void task27(){
        System.out.println("27. Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за три операции и  а10 за четыре операции.  ");

        double a = 2.0;

        double a2 = a * a;
        double a4 = a2 * a2;
        double a8 = a4 * a4;
        double a10 = a8 * a2;

        System.out.println("При a = " + a + "\nа8 = " + a8 + " и а10 = " + a10);
        System.out.println();
    }
    private static void task28(){
        System.out.println("28. Составить программу перевода радианной меры угла в градусы, минуты и секунды.");

        double initRad = 0.12;
        double initDegr = initRad * 180 / Math.PI;

        int degrees = (int) initDegr;

        double temp = (initDegr - degrees) * 60;
        int minutes = (int) temp;

        double seconds = (temp - minutes) * 60;

        System.out.println("Исходная мера угла в радианах: " + initRad);
        System.out.println(degrees + " гр. " + minutes + " мин. " + seconds + " c.");
        System.out.println();
    }
    private static void task29(){
        System.out.println("29. Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с.");

        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        // теорема косинусов
        double cornerARad = Math.acos((b * b + c * c - a * a) / (2 * b * c));
        double cornerADegr = cornerARad * 180 / Math.PI;

        double cornerBRad = Math.acos((a * a + c * c - b * b) / (2 * a * c));
        double cornerBDegr = cornerBRad * 180 / Math.PI;

        double cornerCRad = Math.acos((a * a + b * b - c * c) / (2 * a * b));
        double cornerCDegr = cornerCRad * 180 / Math.PI;

        System.out.println("Исходный треугольник со сторонами " + a + " " + b + " " + c);
        System.out.println("Угол 1 = " + cornerARad + " рад. " + cornerADegr + " гр.");
        System.out.println("Угол 2 = " + cornerBRad + " рад. " + cornerBDegr + " гр.");
        System.out.println("Угол 3 = " + cornerCRad + " рад. " + cornerCDegr + " гр.");
        System.out.println();
    }
    private static void task30(){
        System.out.println("30. Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения.");

        double r1 = 0.2;
        double r2 = 0.4;
        double r3 = 0.4;

        double r = 1 / (1 / r1 + 1 / r2 + 1 / r3);

        System.out.println("R1 = " + r1 + " R2 = " + r2 + " R3 = " + r3);
        System.out.println("Сопротивление = " + r);

        System.out.println();
    }
    private static void task31(){
        System.out.println("31. Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, " +
                "скорость течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч. ");

        double v = 20.0;
        double v1 = 2.0;
        double t1 = 2.5;
        double t2 = 1.2;

        double s = t1 * v + t2 * (v - v1);

        System.out.println("v = " + v + " v1 = " + v1 + " t1 = " + t1 + " t2 = " + t2);
        System.out.println("Путь = " + s);

        System.out.println();
    }
    private static void task32(){
        System.out.println("32. Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать часы через р ч q мин r с?");

        int hoursCurrent = 23;
        int minutesCurrent = 23;
        int secondsCurrent = 14;

        int hoursInterval = 23;
        int minutesInterval = 59;
        int secondsInterval = 59;

        int currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
        int intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;

        int finalInSeconds = currentInSeconds + intervalInSeconds;

        int hoursFinal = (finalInSeconds / 3600);

        int temp = finalInSeconds - (hoursFinal * 3600);
        int minutesFinal = temp / 60;

        int secondsFinal = temp - (minutesFinal * 60);

        int hours24Format = 0;
        if (hoursFinal > 23){
            temp = (hoursFinal / 24);
            hours24Format = hoursFinal - temp * 24;
        }
        else {
            hours24Format = hoursFinal;
        }

        System.out.println("Сейчас: " + hoursCurrent + " ч. " + minutesCurrent + " мин. " + secondsCurrent + " c.");
        System.out.println("Через: " + hoursInterval + " ч. " + minutesInterval + " мин. " + secondsInterval + " c.");
        System.out.println("Будет: " + hours24Format + " ч. " + minutesFinal + " мин. " + secondsFinal + " c.");
        System.out.println();
    }
    private static void task33(){
        System.out.println("33. Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.");

        char currentCharacter = 'A';

        int asciiCurrent = (int) currentCharacter;

        int asciiPrev = asciiCurrent - 1;
        char prevCharacter = (char) asciiPrev;

        int asciiNext = asciiCurrent + 1;
        char nextCharacter = (char) asciiNext;

        System.out.println("Исходный символ: " + currentCharacter + ", его номер: " + asciiCurrent);
        System.out.println("Предыдущий символ: " + prevCharacter + ", его номер: " + asciiPrev);
        System.out.println("Следующий символ: " + nextCharacter + ", его номер: " + asciiNext);
        System.out.println();
    }
    private static void task34(){
        System.out.println("34. Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации. ");

        long initBytes = 9999999999L;

        double kBytes = initBytes / Math.pow(2, 10);
        double mBytes = initBytes / Math.pow(2, 20);
        double gBytes = initBytes / Math.pow(2, 30);
        double tBytes = initBytes / Math.pow(2, 40);
        double pBytes = initBytes / Math.pow(2, 50);

        System.out.println(initBytes + " байт");

        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");
        System.out.println(pBytes + " Пб");

//        int pBytes = (int) (initBytes / Math.pow(2, 50));
//
//        int balance = (int) (initBytes - pBytes * Math.pow(2, 50));
//        int tBytes = (int) (balance / Math.pow(2, 40));
//
//        balance = (int) (balance - tBytes * Math.pow(2, 40));
//        int gBytes = (int) (balance / Math.pow(2, 30));
//
//        balance = (int) (balance - gBytes * Math.pow(2, 30));
//        int mBytes = (int) (balance / Math.pow(2, 20));
//
//        balance = (int) (balance - mBytes * Math.pow(2, 20));
//        int kBytes = (int) (balance / Math.pow(2, 10));
//
//        int bytes = (int) (balance - kBytes * Math.pow(2, 10));
//
//        System.out.println("Исходный объем: " + initBytes + " байт");
//        System.out.println(pBytes + " Пб " + tBytes + " Тб " + gBytes + " Гб " + mBytes+ " Мб " + kBytes+ " Кб " + bytes + " байт");
        System.out.println();
    }
    private static void task35(){
        System.out.println("35. Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N. ");

        int m = 245;
        int n = 6;

        double result = (double) m / n;

        int younger = (int) (result % 10);
        int older = (int) ((result * 10) % 10);

        System.out.println(m + " / " + n + " = " + result);
        System.out.println("Старшая цифра дробной части: " + older);
        System.out.println("Младшая цифра целой части: " + younger);
        System.out.println();
    }
    private static void task36(){
        System.out.println("36. Найти частное произведений четных и нечетных цифр четырехзначного числа.");

        int number = 1234;
        System.out.println("Число: " + number);

        double quotient = 0.0;

        int composition1 = 1;
        int composition2 = 1;

        int newNumber = number;

        int count = 0;

        while (newNumber != 0){
            composition1 = composition1 * (newNumber % 10);
            newNumber = (int) newNumber / 100;
            count ++;
            System.out.println(count + " " + newNumber + " " + composition1);
        }

        newNumber = number / 10;
        while (newNumber != 0){
            composition2 = composition2 * (newNumber % 10);
            newNumber = (int) newNumber / 100;
            count++;
            System.out.println(count + " " + newNumber + " " + composition2);
        }

        if (count % 2 != 0) { //нечетное
            System.out.println("Призведение нечетных цифр = " + composition1);
            System.out.println("Призведение четных цифр = " + composition2);
            quotient = (double) composition2 / composition1;
            System.out.println(composition2 + " / " + composition1 + " = " + quotient);
        }
        else { // четное
            System.out.println("Призведение нечетных цифр = " + composition2);
            System.out.println("Призведение четных цифр = " + composition1);
            quotient = (double) composition1 / composition2;
            System.out.println(composition1 + " / " + composition2 + " = " + quotient);
        }
        System.out.println();
    }
    private static void task37(){
        System.out.println("37. Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и false — в противном случае");

        // часть 1
        int n1 = 22;

        if (n1 / 100 == 0 && n1 % 2 == 0) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Целое число " + n1 + " является четным двузначным числом.");

        // часть 2
        int n2 = 1034;

        int sum1 = 0;
        int newNumber = n2;
        int count = 0;
        while (count < 2) {
            sum1 = sum1 + (newNumber % 10);
            newNumber = newNumber / 10;
            count++;
        }

        int sum2 = 0;
        count = 0;
        while (count < 2) {
            sum2 = sum2 + (newNumber % 10);
            newNumber = newNumber / 10;
            count++;
        }

        if (sum1 == sum2) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Сумма двух первых цифр четырехзначного числа " + n2 + " равна сумме двух его последних цифр.");

        // часть 3
        int n3 = 122;

        int sum3 = 0;
        int newNumber3 = n3;
        count = 0;
        while (count < 3) {
            sum3 = sum3 + (newNumber3 % 10);
            newNumber3 = newNumber3 / 10;
            count++;
        }

        if (sum3 % 2 == 0) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Сумма цифр трехзначного числа " + n3 + " является четным числом.");

        // часть 4
        int x = 1;
        int y = 1;
        int m = 2;
        int n = 3;

        if (x >= m && x <= n) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит части плоскости, лежащей между прямыми х = " + m + ", х = " + n + " (m < n).");

        // часть 5
        int n5 = 111;
        int sum5 = 0;
        int newNumber5 = n5;
        count = 0;
        while (count < 3) {
            sum5 = sum5 + (newNumber5 % 10);
            newNumber5 = newNumber5 / 10;
            count++;
        }

        if (n5 * n5 == Math.pow(sum5, 3)) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Квадрат трехзначного числа " + n5 + " равен кубу суммы цифр этого числа");

        // часть 6
        double a = 3.0;
        double b = 2.0;
        double c = 2.0;

        if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " является равнобедренным");

        // часть 7
        int n7 = 583;

        int newNumber7 = n7;
        int digit1 = newNumber7 % 10;
        newNumber7 = newNumber7 / 10;
        int digit2 = newNumber7 % 10;
        newNumber7 = newNumber7 / 10;
        int digit3 = newNumber7 % 10;

        if (digit1 + digit2 == digit3 || digit1 + digit3 == digit2 || digit3 + digit2 == digit1) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Сумма каких-либо двух цифр трехзначного натурального числа " + n7 + " равна третьей цифре.");


        // часть 8
        int n8 = 32;
        int a8 = 2;

        if ((n8 == 1) || (n8 == a8) || (n8 == a8 * a8) || (n8 == Math.pow(a8, 3)) || ((n8 == Math.pow(a8, 4)))) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Число " + n8 + " является степенью числа " + a8 + " (показатель степени может находиться в диапазоне от 0 до 4).");

        // часть 9
        double a9 = 1.0;
        double b9 = 3.0;
        double c9 = -4.0;
        double x9 = 1.0;
        double y9 = 0.0;
        if (y9 == a9 * x9 * x9 + b9 * x9 + c9) {
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("График функции у = " + a9 + "х2 + " + b9 + "х+ " + c9 + " проходит через заданную точку с координатами (" + x9 + ", " + y9 + ")");
        System.out.println();
    }
    private static void task38(){
        System.out.println("38. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае");

        int x = 3;
        int y = -3;

        // задание 1
        if (y + Math.abs(x) <= 4 && y >= 0){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // задание 2
        if ((y >= 0 && y <= 4 && x >= -2 && x <= 2) || (y >= -3 && y <= 0 && x >= -4 && x <= 4)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");

        // задание 3
        if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
            System.out.print("True: ");
        }
        else{
            System.out.print("False: ");
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
        System.out.println();
    }
    private static void task39(){
        System.out.println("39. Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения, сложения и вычитания, " +
                "вычислите за минимальное число операций: 2x4 - 3х3 + 4х2 - 5х + 6.");

        double x = 1.3;

        double result = x * x * x * (2 * x - 3) + x * (4 * x - 5) + 6;

        System.out.println("При х = " + x + " значение выражения равно " + result);
        System.out.println();
    }
    private static void task40(){
        System.out.println("40. Дано значение х. Получить значения  -2х + 3х2 - 4х3  и 1 + 2х + 3х2 + 4х3 . Позаботьтесь об экономии операций.");
        double x = 2.7;

        double temp1 = 2 * x + 4 * x * x * x;
        double temp2 = 3 * x * x;

        double result1 = - temp1 + temp2;
        double result2 = temp1 + temp2 + 1;

        System.out.println("При х = " + x + " значения выражений равны " + result1 + " и " + result2);
        System.out.println();
    }
}
