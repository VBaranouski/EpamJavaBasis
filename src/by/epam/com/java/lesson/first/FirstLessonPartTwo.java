package by.epam.com.java.lesson.first;

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

        while (countOfDoubles > 0) {
            Random random = new Random();
            Double number = new Double(random.nextDouble() * 100);
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
}

