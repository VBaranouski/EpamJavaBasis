package by.epam.com.java.lessons.third.LessonThreePartTwo;

import java.util.Random;

public class Fraction {

    private int m;
    private int n;

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void createFractionArray(int arraySizeK) {

        String[] fractionArray = new String[arraySizeK];
        Random random = new Random();

        for (int i = 0; i < fractionArray.length; i++) {
            setM(random.nextInt(20));
            setN(random.nextInt(30));
            String arrayItem = getM() + "/" + getN();
            fractionArray[i] = arrayItem;

            System.out.print(fractionArray[i] + ", ");
        }
    }
}
