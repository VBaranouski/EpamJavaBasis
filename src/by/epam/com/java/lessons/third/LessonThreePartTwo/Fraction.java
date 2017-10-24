package by.epam.com.java.lessons.third.LessonThreePartTwo;

import java.util.Random;

public class Fraction {

    private static int m;
    private static int n;

    public static int getM() {
        return m;
    }

    public static void setM(int m) {
        Fraction.m = m;
    }

    public static void setN(int n) {
        Fraction.n = n;
    }

    public static int getN() {
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
