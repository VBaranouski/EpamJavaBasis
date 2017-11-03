package by.epam.com.java.lessons.first;

import java.util.Scanner;

import static java.lang.Math.hypot;
import static java.lang.Math.log1p;

public class LessonOnePartOne {

    public static void showHelloWorld() {
        System.out.println("Hello World!");
    }

    public static void showPersonalInfo() {
        String firstLastName = "Uladzislau Baranouski ";
        String location = "N186";
        String phoneNumber = " 44-7750863";

        System.out.println(firstLastName + location + phoneNumber);
    }

    public static void showBookText() {

        String text = "Пройдет много лет, и полковник Аурелиано Буэндиа, " +
                "стоя у стены в ожидании расстрела, вспомнит тот далекий вечер, " +
                "когда отец взял его с собой посмотреть на лед. Макондо было тогда " +
                "небольшим селением с двумя десятками хижин, выстроенных из глины " +
                "и бамбука на берегу реки, которая мчала свои прозрачные воды ... ";

        System.out.println(text + "\n");
    }

    public static void squareOfRightTriangle(int a, int b) {

        double square = (a * b) / 2;
        System.out.println("Площадь: " + square);
    }

    public static void calculateHypotenuse(int a, int b) {

        double hypotenuse = hypot(a, b);
        System.out.println("Гипотенуза: " + hypotenuse + "\n");
    }

    public static void calculateSumOfFourth(int a, int b, int c, int d) {

        int sum = a + b + c + d;
        System.out.println("Сумма четырех чисел: " + sum + "\n");

    }

    public static void calculateExpression() {

        int a;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer a: ");

        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
        } else {
            System.out.println("Please type an integer value. Re-run program and try again!");
            return;
        }

        int b;

        System.out.println("Enter integer b: ");
        if (scanner.hasNextInt()) {
            b = scanner.nextInt();
        } else {
            System.out.println("Please type an integer value. Re-run program and try again!");
            return;
        }

        int c;

        System.out.println("Enter integer c: ");
        if (scanner.hasNextInt()) {
            c = scanner.nextInt();
        } else {
            System.out.println("Please type an integer value. Re-run program and try again!");
            return;
        }

        double result = (a * a) - (b - c) * (b - c) + log1p(b * b + 1);
        System.out.println("Результат: " + result);
    }

    public static void newYear(int a, int b, int c) {

        if (a > b) {
            int sum = b + c;
            System.out.println("\n" + "Сумма b+c: " + sum);
        } else if (a == b) {
            System.out.println("\n" + a + " is equals " + b + ": Конец");
        } else {
            int sum = a + b + c;
            System.out.println("\n" + "Сумма: " + sum + " - " + "New Year!!");
        }
    }

}

