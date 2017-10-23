package by.epam.com.java.lessons.third;

import java.util.Random;

public class LessonThreePartOne {

    public static void sumOfSpecificArrayElements(int arraySize, int kratnoe) {
        int[] array = new int[arraySize];
        int sum = 0;
        Random random = new Random();

        System.out.println("Array with " + arraySize + " elements are created:");

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + ", ");

            int reminder = array[i] % kratnoe;

            if (reminder == 0) {
                sum = array[i] + sum;

            }
        }

        System.out.println("\n" + "Сумма чисел кратных " + kratnoe + " равна: " + sum);
    }

    public static void arrayFromZeroValues(int initialArraySize) {
        int[] initialArray = new int[initialArraySize];
        Random random = new Random();
        int zeroValueCount = 0;

        System.out.println("\n" + "Array with " + initialArraySize + " elements are created:");
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = random.nextInt(3);
            System.out.print(initialArray[i] + ", ");
            if (initialArray[i] == 0) {
                zeroValueCount++;
            }
        }

        int[] zeroBasedArray = new int[zeroValueCount];
        System.out.println("\n" + "New array with indexes of zero values in initial array: ");
        int j = 0;

        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i] == 0) {
                zeroBasedArray[j] = i;
                System.out.print(zeroBasedArray[j] + ", ");
            }

        }
    }

    public static void ascendingArray(int arraySize) {
        int[] array = new int[arraySize];
        int counter = 0;

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20) - 10;
            System.out.print(array[i] + ", ");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                counter++;
            }
        }

        if (counter == arraySize - 1) {
            System.out.println(" - Ascending");
        }
        if (counter == 0) {
            System.out.println(" - Descending");
        }

    }

    public static void arrayFromEvenNumbers(int initialArraySize) {
        int[] initialArray = new int[initialArraySize];
        int evenNumbersCount = 0;

        Random random = new Random();
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = random.nextInt(30);
            System.out.print(initialArray[i] + ", ");
        }
        for (int i = 0; i < initialArray.length - 1; i++) {
            int reminder = initialArray[i] % 2;
            if (reminder == 0) {
                evenNumbersCount++;
            }
        }

        if (evenNumbersCount != 0) {
            int[] evenNumbersArray = new int[evenNumbersCount];
            System.out.println("\n" + "New array with even numbers: ");
            int j = 0;

            for (int i = 0; i < initialArray.length; i++) {
                int reminder = initialArray[i] % 2;
                if (reminder == 0) {
                    evenNumbersArray[j] = initialArray[i];
                    System.out.print(evenNumbersArray[j] + ", ");
                }
            }

        } else {
            System.out.println("Initial array doesn't have even numbers");
        }

    }

}


