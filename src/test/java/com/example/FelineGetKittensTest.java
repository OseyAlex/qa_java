package com.example;

import jdk.jfr.Name;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {
    @Test
    @Name("Позитивная проверка метода getKittens с аргументом")

    public void checkKittensWithArgumentPositiveTest() {
        Feline feline = new Feline();
        final int expected = 10;
        assertEquals("Метод getKittens c аргументами работает неверно", expected, feline.getKittens(10));
    }

    @Test
    @Name("Позитивная проверка метода getKittens без аргументов")

    public void checkKittensWithoutArgumentPositiveTest() {
        Feline cat = new Feline();
        final int expected = 1;
        assertEquals("Метод getKittens без аргументов работает неверно", expected, cat.getKittens());
    }
}