package by.epam.com.java.lessons.fourth.LessonFourPartTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Abiturient {
    private int id;
    private String firstName;
    private String lastName;
    private int[] marks;

    private double averageMark;

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    private int openPositionsCount = 5;

    public Abiturient(int id, String firstName, String lastName, int[] marks) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.marks = marks;
    }

    public Abiturient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public List createAbiturients() {
        List<Abiturient> arrayAbiturients = new ArrayList<>();
        arrayAbiturients.add(new Abiturient(1, "Vasya", "Nosov", new int[] { 10, 8, 10, 9, 9 }));
        arrayAbiturients.add(new Abiturient(2, "Ivan", "Utkin", new int[] { 7, 4, 8, 9, 4 }));
        arrayAbiturients.add(new Abiturient(3, "Sergey", "Titov", new int[] { 8, 8, 10, 9, 8 }));
        arrayAbiturients.add(new Abiturient(4, "Anna", "Orlova", new int[] { 4, 9, 3, 4, 5 }));
        arrayAbiturients.add(new Abiturient(5, "Irina", "Morozova", new int[] { 10, 8, 7, 9, 8 }));
        arrayAbiturients.add(new Abiturient(6, "Olga", "Ternova", new int[] { 5, 8, 5, 9, 8 }));
        arrayAbiturients.add(new Abiturient(7, "Andrei", "Zimov", new int[] { 9, 8, 7, 9, 8 }));
        arrayAbiturients.add(new Abiturient(8, "Fedor", "Homkin", new int[] { 9, 8, 7, 7, 8 }));
        return arrayAbiturients;
    }

    public void calculateAverageMark(List<Abiturient> arrayAbiturients) {
        double average = 0;
        for (Abiturient arr : arrayAbiturients) {
            int marks[] = arr.getMarks();
            double sum = 0;
            System.out.print(arr.getId() + ". " + arr.getFirstName() + " " + arr.getLastName() + ": ");
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
                System.out.print(marks[i] + " ");
            }
            System.out.println();
            average = sum / marks.length;
            arr.setAverageMark(average);
        }
    }

    public void selectPassedAbiturients(List<Abiturient> arrayAbiturients) {
        Collections.sort(arrayAbiturients, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Double valueOne = ((Abiturient) o1).getAverageMark();
                Double valueTwo = ((Abiturient) o2).getAverageMark();
                int sComp = valueTwo.compareTo(valueOne);

                if (sComp != 0) {
                    return sComp;
                } else {
                    return -1;
                }
            }
        });
    }

    public void showPassedAbiturients(List<Abiturient> arrayAbiturients) {
        System.out.println("Here is the list of our new " + openPositionsCount + " students: ");
        List<Abiturient> passedAbiturients = arrayAbiturients.subList(0, openPositionsCount);
        for (Abiturient arr : passedAbiturients) {
            System.out.println(
                    arr.getId() + ". " + arr.getFirstName() + " " + arr.getLastName() + ": " + arr.getAverageMark());
        }

    }
}
