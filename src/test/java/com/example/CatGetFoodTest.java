package com.example;

import jdk.jfr.Name;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CatGetFoodTest {

    @Test
    @Name("Позитивная проверка метода getFood")

    public void checkGetFoodPositiveTest() throws Exception {
        Feline feline = new Feline();
        Cat murka = new Cat(feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals("Метод getFood работает неверно", expected, murka.getFood());
    }
}
