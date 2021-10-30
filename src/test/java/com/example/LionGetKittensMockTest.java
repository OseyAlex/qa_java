package com.example;

import jdk.jfr.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionGetKittensMockTest {

    @Mock
    Feline feline;

    @Test
    @Name("Замокированный вызов")

    public void checkGetKittestReturnResult() throws Exception {
        Lion leo = new Lion("Самец", feline);
        Mockito.when(leo.getKittens()).thenReturn(50);
        System.out.println(leo.getKittens());
    }
}
