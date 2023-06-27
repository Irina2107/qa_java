package com.example;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTextTest {
    @Mock
    Feline feline;
    @Test
    public void exceptionTextLion() {
        Exception actual = Assert.assertThrows(Exception.class, () -> new Lion("Тигрик", feline));
        assertEquals("Используйте допустимые значения пола животного - самей или самка", actual.getMessage());
    }
}