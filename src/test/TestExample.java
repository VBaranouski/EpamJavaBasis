package test;

import org.junit.Assert;
import org.junit.Test;

public class TestExample {

    @Test
    public void simpleTest(){
        int a = 5;
        int b = 10;
        int sum = a+b;
        Assert.assertEquals("Неверное значение суммы двух чисел", sum, 15);
    }
}
