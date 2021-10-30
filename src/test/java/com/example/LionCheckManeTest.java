package com.example;

import jdk.jfr.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionCheckManeTest {
    private final String sex;
    private final boolean expectedHasMane;

    public LionCheckManeTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[] getSumData() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true}

        };
    }

    @Test
    @Name("Позитивная проверка метода doesHaveMane")
    public void checkHasManePositive() throws Exception {
        Feline feline = new Feline();
        Lion leo = new Lion(sex, feline);
        Boolean actual = leo.doesHaveMane();
        assertEquals("Метод doesHaveMane работает неверно", expectedHasMane, actual);
    }
}
