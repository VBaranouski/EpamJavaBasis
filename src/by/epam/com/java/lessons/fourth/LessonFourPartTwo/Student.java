package by.epam.com.java.lessons.fourth.LessonFourPartTwo;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private int courseNumber;
    private String lastName;
    private String firstName;
    private String surName;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;

    public Student(int id, int courseNumber, String lastName, String firstName, String surName,
            String dateOfBirth, String address, String phoneNumber, String faculty) {
        this.id = id;
        this.courseNumber = courseNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.surName = surName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    private List createStudent() {
        List<Student> arrayStudents = new ArrayList<>();
        arrayStudents.add(new Student(1, 1, "Ivanov", "Ivan", "Ivanovich",
                "01.01.1990", "Minsk, N186", "+3751722002200", "Math"));
        arrayStudents.add(new Student(2, 4, "Konev", "Sergey", "Ivanovich",
                "01.01.1991", "Minsk, N177", "+3751722343400", "Math"));
        arrayStudents.add(new Student(3, 2, "Petrova", "Anna", "Sergeevna",
                "01.01.1991", "Minsk, N177", "+37513434400", "Math"));
        return arrayStudents;
    }

    public void show() {
        List<Student> arrayStudent = createStudent();
        System.out.println("List of our students: ");
        for (Student arr : arrayStudent) {
            System.out.println(
                    arr.getId() + " " + arr.getCourseNumber() + " " + arr.getFaculty() + " " + arr.getFirstName() + " "
                            + arr.getLastName() + " " + arr.getAddress() + " " + arr.getDateOfBirth());

        }
    }

    public void showOnlyMathFacultyStudents() {
        List<Student> arrayStudent = createStudent();
        System.out.println("\n" + "On Math faculty we have next students: ");
        for (Student students : arrayStudent) {
            if (students.getFaculty().equals("Math")) {
                System.out.println(students.getId() + " " + students.getFirstName() + " " + students.getLastName());
            }
        }
    }
}

