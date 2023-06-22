package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class LionExceptionTextTest {
    @Mock
    Feline feline = new Feline();
    @Test
    public void exceptionTextLion() {
        Exception actual = Assert.assertThrows(Exception.class, () -> new Lion("Тигрик", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", actual.getMessage());
    }
}