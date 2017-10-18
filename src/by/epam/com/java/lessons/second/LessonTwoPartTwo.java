package by.epam.com.java.lessons.second;

import java.util.Scanner;

public class LessonTwoPartTwo {

    public static void daysChecker() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите месяц: ");
        String month = sc.nextLine();
        System.out.print("Введите год: ");
        int year = sc.nextInt();

        int daysCount = takeMonthAndYearViaSwitch(month, year);

        System.out.println("Число дней (switch) = " + daysCount);

        daysCount = monthAndYearViaIf(month, year);

        System.out.println("Число дней (if) = " + daysCount);

    }

    private static int takeMonthAndYearViaSwitch(String month, int year) {
        int numDays = 0;

        switch (month) {
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
            numDays = 31;
            break;

        case "April":
        case "June":
        case "September":
        case "November":
            numDays = 30;
            break;

        case "February":
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                numDays = 29;
            } else {
                numDays = 28;
            }
            break;

        default:
            System.out.println("Несуществующий месяц");
            break;
        }

        return numDays;
    }

    private static int monthAndYearViaIf(String month, int year) {
        int numDays = 0;

        if (month.matches("January|March|May|July|August|October|December")) {
            numDays = 31;
        }
        if (month.equals("April") ||
                month.equals("June") ||
                month.equals("September") ||
                month.equals("November")) {
            numDays = 30;
        }
        if (month.equals("February")) {
            if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                numDays = 29;
            } else {
                numDays = 28;
            }
        }

        return numDays;
    }

                              //<---- Arrays ---->

    public static void arrayCreator(int arraySize) {
        int[] array = new int[arraySize];
        enterArrFromConsole(array, arraySize);
        findMaxElement(array);
        findMinElementAndIndex(array);
        sortingOfArray(array);

    }

    private static void enterArrFromConsole(int[] arr, int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + size + " elements of an new array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    private static void findMaxElement(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + max);

    }

    private static void findMinElementAndIndex(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        System.out.println("Минимальное занчение " + min + " с индексом " + index);

    }

    private static void sortingOfArray(int[] arr) {
        System.out.println("Сортированный массив: ");
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
            System.out.println(arr[i]);
        }

    }
}


