package com.example;

import jdk.jfr.Name;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {
    @Test
    @Name("Позитивная проверка метода getFamily")

    public void checkGetFamilyReturnPositiveResult(){
        Feline feline = new Feline();
        final String expected = "Кошачьи";
        assertEquals("Метод getFamily работает неверно", expected, feline.getFamily());
    }
}
