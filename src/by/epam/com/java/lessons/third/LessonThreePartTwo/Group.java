package by.epam.com.java.lessons.third.LessonThreePartTwo;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private static int averageGroupMark;

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    private int studentsCount = 6;

    public static int getAverageGroupMark() {
        return averageGroupMark;
    }

    public static void setAverageGroupMark(int averageGroupMark) {
        Group.averageGroupMark = averageGroupMark;
    }

    private Student firstStudent = new Student();
    private Student secondStudent = new Student();
    private Student thirdStudent = new Student();
    private Student fourthStudent = new Student();
    private Student fivesStudent = new Student();
    private Student sixthStudent = new Student();

    public void createStudentsGroup() {
        firstStudent.studentsDefiner(firstStudent, new int[] { 10, 8, 10, 9, 8 });
        secondStudent.studentsDefiner(secondStudent, new int[] { 9, 10, 9, 7, 9 });
        thirdStudent.studentsDefiner(thirdStudent, new int[] { 2, 4, 2, 5, 4 });
        fourthStudent.studentsDefiner(fourthStudent, new int[] { 8, 5, 6, 7, 6 });
        fivesStudent.studentsDefiner(fivesStudent, new int[] { 5, 2, 4, 3, 6 });
        sixthStudent.studentsDefiner(sixthStudent, new int[] { 9, 10, 10, 9, 10 });
    }

    public void calculateBadAndGoodStudents() {

        List<Student> students = new ArrayList<>();
        students.add(firstStudent);
        students.add(secondStudent);
        students.add(thirdStudent);
        students.add(fourthStudent);
        students.add(fivesStudent);
        students.add(sixthStudent);

        setStudentsCount(students.size());

        int badStudentsCount = 0;
        int excellentStudentsCount = 0;
        int groupMark = 0;

        for (Student item : students) {
            badStudentsCount = badStudentsCount + item.getBadStudents();
            excellentStudentsCount = excellentStudentsCount + item.getExcellentStudents();
            groupMark = groupMark + item.getAverageStudentMark();
        }

        Group.setAverageGroupMark(groupMark / getStudentsCount());

        System.out.println("\n" + "Average group's mark: " + getAverageGroupMark());
        System.out.println("Excellent students count: " + excellentStudentsCount);
        System.out.println("Bad students count: " + badStudentsCount);

    }

}
