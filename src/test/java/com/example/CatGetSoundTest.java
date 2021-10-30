package com.example;

import jdk.jfr.Name;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {
    @Test
    @Name("Позитивня проверка метода getSound")

    public void checkGetSoundPositiveTest() {
        Feline feline = new Feline();
        Cat tom = new Cat(feline);
        String expected = "Мяу";
        assertEquals("Метод getSound работает неверно", expected, tom.getSound()); // сравнили ожидаемый результат с фактическим
    }
}
