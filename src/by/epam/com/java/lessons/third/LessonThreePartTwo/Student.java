package by.epam.com.java.lessons.third.LessonThreePartTwo;

public class Student {

    private int badStudents;
    private int excellentStudents;
    private int averageStudentMark;

    public int getAverageStudentMark() {
        return averageStudentMark;
    }

    public void setAverageStudentsMark(int averageStudentMark) {
        this.averageStudentMark = averageStudentMark;
    }

    public int getBadStudents() {
        return badStudents;
    }

    public void setBadStudents(int badStudents) {
        this.badStudents = badStudents;
    }

    public int getExcellentStudents() {
        return excellentStudents;
    }

    public void setExcellentStudents(int excellentStudents) {
        this.excellentStudents = excellentStudents;
    }

    public void studentsDefiner(Student student, int[] marks) {
        int sum = 0;
        int badStudentCounter = student.getBadStudents();
        int excellentStudentCounter = student.getExcellentStudents();

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
            student.setAverageStudentsMark(sum / marks.length);
        }
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] <= 2) {
                badStudentCounter++;
                student.setBadStudents(badStudentCounter);
                break;
            }
        }

        if (student.getAverageStudentMark() >= 8) {
            excellentStudentCounter++;
            student.setExcellentStudents(excellentStudentCounter);
        }

        System.out.println("Average mark: " + student.getAverageStudentMark());

    }

}
