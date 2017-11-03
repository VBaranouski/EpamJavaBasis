package by.epam.com.java.lessons.fourth;

import java.util.Random;

public class LessonFourPartOne {

    private static int lastItem;
    private static int itemBeforeLast;

    public static int getLastItem() {
        return lastItem;
    }

    public static void setLastItem(int lastItem) {
        LessonFourPartOne.lastItem = lastItem;
    }

    public static int getItemBeforeLast() {
        return itemBeforeLast;
    }

    public static void setItemBeforeLast(int itemBeforeLast) {
        LessonFourPartOne.itemBeforeLast = itemBeforeLast;
    }


    public static void twoDimensionalFibonachiArray(int rows, int column) {
        int arr[][] = new int[rows][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0) {
                    if (j < 2) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = arr[i][j - 1] + arr[i][j - 2];
                        setLastItem(arr[i][j]);
                        setItemBeforeLast(arr[i][j - 1]);
                    }
                }
                if (i > 0 & j == 0) {
                    arr[i][j] = getLastItem() + getItemBeforeLast();
                    setItemBeforeLast(arr[i][j]);
                }
                if (i > 0 & j > 0) {
                    arr[i][j] = getLastItem() + getItemBeforeLast();
                    setLastItem(arr[i][j]);
                    setItemBeforeLast(arr[i][j - 1]);
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] createTwoDimensionalArray(int rows, int column) {
        int arr[][] = new int[rows][column];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(25);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void sortTwoDimensionalArrayByColumn() {
        int arr[][] = createTwoDimensionalArray(10, 10);
        System.out.println("\n" + "Sorted array:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                for (int m = 0; m < arr[i].length; m++) {
                    if (arr[j][m] > arr[j + 1][m]) {
                        int temp = arr[j][m];
                        arr[j][m] = arr[j + 1][m];
                        arr[j + 1][m] = temp;
                    }
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
