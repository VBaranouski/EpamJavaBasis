package by.epam.com.java.lessons.first;

import java.util.Random;
import java.util.Scanner;

public class FirstLessonPartTwo {

    public static void intOperations() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter count of integer values: ");

        int intCount = scanner.nextInt();
        int evenCount = 0;
        int multipleOfThreeSum = 0;
        int absoluteValue = 0;

        while (intCount > 0) {
            System.out.print("Enter integer value: ");

            if (scanner.hasNextInt()) {
                int consoleValue = scanner.nextInt();
                int remainder = consoleValue % 2;

                if (remainder == 0) {
                    evenCount++;
                }
                remainder = consoleValue % 3;

                if (remainder == 0) {
                    multipleOfThreeSum = consoleValue + multipleOfThreeSum;
                }

                if (Math.abs(consoleValue) < 3) {
                    absoluteValue++;
                }
            } else {
                System.out.println("Not integer!");
                return;
            }

            intCount--;
        }

        System.out.println("Количество четных числел: " + evenCount + "\n" + "Сумма кратных трем: "
                + multipleOfThreeSum + "\n" + "Количество чисел с модулем меньше 3: " + absoluteValue);

    }

    public static void generatorOfNDoubles(int countOfDoubles) {
        int matchedNumbersCount = 0;

        System.out.print("Found numbers: ");
        while (countOfDoubles > 0) {
            Random random = new Random();
            Double number = random.nextDouble() * 100;
            int finalNumber = number.intValue();
            int remainder = finalNumber % 2;

            if (remainder == 0) {
                if (finalNumber > 15) {
                    System.out.print(finalNumber + " ");
                    matchedNumbersCount++;
                }
            }
            countOfDoubles--;
        }

        if (matchedNumbersCount == 0) {
            System.out.println("No such numbers were found");
        }

    }

    public static void generatorOfNIntegers(int countOfIntegers) {

        int moreThenFifteens = 0;
        int lessThenTwo = 0;
        int divByFive = 0;

        while (countOfIntegers > 0) {

            Random random = new Random();
            int number = random.nextInt(40) - 15;

            if (number > 15) {
                moreThenFifteens++;
            }

            if (number < 2) {
                lessThenTwo++;
            }

            int remainder = number % 5;
            if (remainder == 4) {
                divByFive++;
                System.out.println();
            }
            countOfIntegers--;
        }
        System.out.println("\n" + "Количесвто чисел больше 15-ти: " + moreThenFifteens + "\n" +
                "Количество числе меньше 2-х:  " + lessThenTwo + "\n"
                + "Количество чисел с остатком 4: " + divByFive);
    }

    public static void calculateExpressions(double a, double b, double c, double d) {

        if (a != 0 && c != 0 && d != 0) {
            double resultA = (b + Math.sqrt(Math.pow(b, 2)) + 4 * a * b) / 2 * a - Math.pow(a, 3) * c + b;
            double resultB = (a * b) / (c * d) - (a * b - c) / (c * d);

            System.out.println(
                    "Результат первого выражения: " + resultA + "\n"
                            + "Результат второго выражения: " + resultB);
        } else {
            System.out.println("a, c, и d не могут быть равны нулю");
        }

    }

    public static void operationsWithNumbers(double a, double b, double c) {
        definer(a);
        definer(b);
        definer(c);

    }

    private static void definer(double number) {
        if (number > 0) {
            number = Math.pow(number, 2);
            System.out.println("Positive value, square the number: " + number);
        } else {
            number = Math.pow(number, 4);
            System.out.println("Negative value, fourth of the number: " + number);
        }

    }

    public static void gettingFunctionValues(double a, double b, double h) {
        double Fx;
        double x = a;

        System.out.println("  X " + "  | " + " F(x) " + "\n" + "--------------");

        while (x <= b) {
            System.out.print(" " + x + "  | ");
            Fx = 2 * Math.tan(x / 2) + 1;
            double roundValueFx = Math.round(Fx);

            System.out.println(" " + roundValueFx);
            x = x + h;
        }
    }

    public static void calculateCircle(double radius) {
        double circleLength = 2 * Math.PI * radius;
        double circleSquare = Math.PI * Math.pow(radius, 2);
        System.out.println("Длина окружности: " + circleLength + "\n" + "Площадь круга: " + circleSquare);
    }

    public static void calculateFunction(double x) {
        double Fx;

        if (x <= -3) {
            Fx = 9;
            System.out.println("F(x) = " + Fx);
        } else {
            Fx = 1 / (Math.pow(x, 2) + 1);
            System.out.println("F(x) = " + Fx);
        }
    }
}
