package by.epam.com.java;

import by.epam.com.java.lessons.first.LessonOnePartOne;
import by.epam.com.java.lessons.first.LessonOnePartTwo;
import by.epam.com.java.lessons.fourth.LessonFourPartOne;
import by.epam.com.java.lessons.fourth.LessonFourPartTwo.Abiturient;
import by.epam.com.java.lessons.fourth.LessonFourPartTwo.Customer;
import by.epam.com.java.lessons.fourth.LessonFourPartTwo.Student;
import by.epam.com.java.lessons.second.LessonTwoPartOne;
import by.epam.com.java.lessons.second.LessonTwoPartTwo;
import by.epam.com.java.lessons.third.LessonThreePartOne;
import by.epam.com.java.lessons.third.LessonThreePartTwo.Fraction;
import by.epam.com.java.lessons.third.LessonThreePartTwo.Group;

import java.util.List;

public class Runner {

    static LessonOnePartOne lFirstPartOne;
    static LessonOnePartTwo lFirstPartTwo;
    static LessonTwoPartOne lTwoPartOne;
    static LessonTwoPartTwo lTwoPartTwo;
    static LessonThreePartOne lThreePartOne;

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            sum = sum + value;
        }
        System.out.println("Sum of arguments: " + sum);

        // <---- Lesson one part one ---->
        lFirstPartOne.showHelloWorld();   // 1 Hello World!
        lFirstPartOne.showPersonalInfo();    // 2 Выведите на консоль ваши ФИО, адрес и телефон.
        lFirstPartOne.showBookText();   // 3 Выведите на экран текст.
        lFirstPartOne.calculateHypotenuse(3, 4);   // 4 Гипотенуза по двум катетам
        lFirstPartOne.squareOfRightTriangle(5, 4);   // 4 Площадь по двум катетам
        lFirstPartOne.calculateSumOfFourth(1, 2, 3, 4);   // 5 Вычисленить суммы четырёх слагаемых.
        lFirstPartOne.calculateExpression();    // 6 Вычислить значение выражения a2-(b-c)2+ln(b2+1).
        lFirstPartOne.newYear(4, 4, 5);  // 7 «Новый год!».

        // <---- Lesson one part two ---->

        lFirstPartTwo.intOperations();   // 2 Программа запрашивает количество чисел, затем вводит целые числа..
        lFirstPartTwo.generatorOfNDoubles(10);   // 3 Программа вводит количество N вещественных чисел...
        lFirstPartTwo.generatorOfNIntegers(7);   // 4 Программа запрашивает количество чисел, вводит целые числа...
        lFirstPartTwo.calculateExpressions(12, 8, -3.5, 0.2);   // 6 Вычислить значение выражения по формуле../
        lFirstPartTwo.operationsWithNumbers(10, -2, 3);  // 7 Даны три действительных числа. Возвести в квадрат...
        lFirstPartTwo.gettingFunctionValues(2.1, 9, 1.2);  // 8 Составить программу для вычисления значений функции...
        lFirstPartTwo.calculateCircle(10.2);   // 9 Вычислить длину окружности и площадь...
        lFirstPartTwo.calculateFunction(2);    // 10 Вычислить щначение функции...

        // <---- Lesson two part one ---->

        lTwoPartOne
                .sumAndCompUsingMethods();  //Решите задачу, находящую сумму и произведение двух чисел с использованием методов..

        // <---- Lesson two part two ---->

        lTwoPartTwo
                .dayCountChecker();  // 2. Перепишите код из листинка l2-2 используя методы. 4. Перепишите код с помощью операторов if.
        lTwoPartTwo
                .seasonChecker();  // 3. Введите номер месяца как строку, с помощью valueOf переведите ее в элемент перечисления
        lTwoPartTwo.arrayCreator(5); // 7. Создайте одномерный массив вещественных чисел. Min/Max/Sorting

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

        // <---- Lesson four part one ---->

        LessonFourPartOne.twoDimensionalFibonachiArray(5,
                5); // 1. Инициализировать массив, в котором следующюй элемент равер сумме двух предыдущих

        LessonFourPartOne
               .sortTwoDimensionalArrayByColumn(); // 2. Создайте массив массивов с одинаковым количеством элментов в каждой строке. Отсортируйте элементы этого массива ‘по столбикам’.

        // <---- Lesson four part two ---->

        Student student = new Student();  // 1. Создать описанные ниже классы. Определить конструктор и методы set(), get(), show().
        student.show();                   // ... Определить дополнительно какой – либо  метод для каждого класса...
        student.showOnlyMathFacultyStudents();   // ... Задать критерий выбора данных и вывести эти данные на консоль.
        Customer customer = new Customer();
        customer.show();
        customer.showCustomersFromMinsk();

        Abiturient abiturient = new Abiturient(); // 4. Имеется список абитуриентов (класс Abiturient) и список оценок, ...
        List arr = abiturient.createAbiturients(); //... полученных ими на вступительных экзаменах. ...
        abiturient.calculateAverageMark(arr);   // ... Напечатать список поступивших, ...
        abiturient.selectPassedAbiturients(arr);  // ... если число мест меньше числа абитуриентов.
        abiturient.showPassedAbiturients(arr);

    }

}


