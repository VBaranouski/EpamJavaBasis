package by.epam.com.java.lessons.second;

import java.util.Scanner;

public class LessonTwoPartOne {

    public static void sumAndCompUsingMethods() {

        int sum = 0;
        int comp = 1;
        int countOfNumbers = 2;

        for (int i = 0; i < countOfNumbers; i++) {
            int a = valueTacker();
            sum = sum + a;
            comp = comp * a;
        }

        System.out.println("Sum: " + sum + "\n" + "Composition: " + comp);
    }

    private static int valueTacker() {
        Scanner scannerValue = new Scanner(System.in);

        System.out.print("Enter integer value: ");

        if (!scannerValue.hasNextInt()) {
            System.out.println("Please enter integer value!");
        }

        int a = scannerValue.nextInt();

        return a;
    }

}




