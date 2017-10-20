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
}
