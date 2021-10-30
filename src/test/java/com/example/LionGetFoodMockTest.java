package com.example;

import jdk.jfr.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionGetFoodMockTest {

    @Mock
    Feline feline;

    @Test
    @Name("Замокированный вызов")

    public void checkGetFoodReturnNegativeResult() throws Exception {
        Lion leo = new Lion("Самец", feline);

        Mockito.when(leo.getFood()).thenReturn(List.of("Неизвестный вид животного"));
        System.out.println(leo.getFood());
    }
}
