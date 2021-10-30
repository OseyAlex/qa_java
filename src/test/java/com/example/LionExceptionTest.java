package com.example;

import jdk.jfr.Name;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Name("Проверка генерируемого исключения")
    public void checkHasManeException() throws Exception {

        thrown.expect(java.lang.Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самей или самка");
        Feline feline = new Feline();
        Lion leoError = new Lion("Male", feline);
        leoError.doesHaveMane();
    }
}
