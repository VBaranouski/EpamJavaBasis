package by.epam.com.java;

import by.epam.com.java.lessons.first.LessonOnePartOne;
import by.epam.com.java.lessons.first.LessonOnePartTwo;
import by.epam.com.java.lessons.fourth.LessonFourPartOne;
import by.epam.com.java.lessons.second.LessonTwoPartOne;
import by.epam.com.java.lessons.second.LessonTwoPartTwo;
import by.epam.com.java.lessons.third.LessonThreePartOne;

public class Runner {

    static LessonOnePartOne fLPartOne;
    static LessonOnePartTwo fLPartTwo;
    static LessonTwoPartOne lTPartOne;
    static LessonTwoPartTwo lTPartTwo;
    static LessonThreePartOne lThreePartOne;

    public static void main(String[] args) {
/*
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            sum = sum + value;
        }
        System.out.println("Sum of arguments: " + sum);

        // <---- Lesson one part one ---->

        fLPartOne.showHelloWorld();   // 1 Hello World!
        fLPartOne.showPersonalInfo();    // 2 Выведите на консоль ваши ФИО, адрес и телефон.
        fLPartOne.showBookText();   // 3 Выведите на экран текст.
        fLPartOne.calculateHypotenuse(3, 4);   // 4 Гипотенуза по двум катетам
        fLPartOne.squareOfRightTriangle(5, 4);   // 4 Площадь по двум катетам
        fLPartOne.calculateSumOfFourth(1, 2, 3, 4);   // 5 Вычисленить суммы четырёх слагаемых.
        fLPartOne.calculateExpression();    // 6 Вычислить значение выражения a2-(b-c)2+ln(b2+1).
        fLPartOne.newYear(4, 4, 5);  // 7 «Новый год!».

        // <---- Lesson one part two ---->

        fLPartTwo.intOperations();   // 2 Программа запрашивает количество чисел, затем вводит целые числа..
        fLPartTwo.generatorOfNDoubles(10);   // 3 Программа вводит количество N вещественных чисел...
        fLPartTwo.generatorOfNIntegers(7);   // 4 Программа запрашивает количество чисел, вводит целые числа...
        fLPartTwo.calculateExpressions(12, 8, -3.5, 0.2);   // 6 Вычислить значение выражения по формуле../
        fLPartTwo.operationsWithNumbers(10, -2, 3);  // 7 Даны три действительных числа. Возвести в квадрат...
        fLPartTwo.gettingFunctionValues(2.1, 9, 1.2);  // 8 Составить программу для вычисления значений функции...
        fLPartTwo.calculateCircle(10.2);   // 9 Вычислить длину окружности и площадь...
        fLPartTwo.calculateFunction(2);    // 10 Вычислить щначение функции...

        // <---- Lesson two part one ---->

        lTPartOne.sumAndCompUsingMethods();  //Решите задачу, находящую сумму и произведение двух чисел с использованием методов..

        // <---- Lesson two part two ---->

        lTPartTwo.dayCountChecker();  // 2. Перепишите код из листинка l2-2 используя методы. 4. Перепишите код с помощью операторов if.
        lTPartTwo.seasonChecker();  // 3. Введите номер месяца как строку, с помощью valueOf переведите ее в элемент перечисления
        lTPartTwo.arrayCreator(5); // 7. Создайте одномерный массив вещественных чисел. Min/Max/Sorting

        // <---- Lesson three part one ---->

        lThreePartOne.sumOfSpecificArrayElements(10,
                5); // 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К
        lThreePartOne.arrayFromZeroValues(
                15); // 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
        lThreePartOne.ascendingArray(
                3); //3 Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
        lThreePartOne.arrayFromEvenNumbers(
                10); //4 Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности. Если таких чисел нет, то вывести сообщение об этом факте.


         // <---- Lesson three part two ---->

         Fraction fraction = new Fraction();  //1. Определить класс «Дробь» в виде пары m/n. Объявить массив из k дробей, ввести/вывести значения для массива дробей.
         fraction.createFractionArray(10);  // Note: Дроби заполняются через Random

         Group group = new Group(); // 2. Определить: а) средний балл учебной группы (использовать класс Group); ...
         group.createStudentsGroup(); // .. б) средний балл каждого студента; в) число отличников; ...
         group.calculateBadAndGoodStudents();  // ... количество студентов, имеющих "2"

*/
        // <---- Lesson four part one ---->
       // LessonFourPartOne.twoDimensionalFibonachiArray(5,5);
        LessonFourPartOne.sortTwoDimensionalArrayByColumn();

    }

}

