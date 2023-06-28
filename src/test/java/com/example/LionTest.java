package com.example;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Before
    public void setLionMale() throws Exception {
        lionMale = new Lion("Самец", feline);
    }

    @Before
    public void setLionFemale() throws Exception {
        lionFemale = new Lion("Самка", feline);
    }

    private Lion lionMale;
    private Lion lionFemale;

    @Test
    public void leonMaleEatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Это еда не для льва", List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
    }

    @Test
    public void leonFemaleEatTest() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals("Это еда не для львицы", List.of("Животные", "Птицы", "Рыба"), lionFemale.getFood());
    }
    @Test
    public void getFootTest() throws Exception {
        lionMale.getFood();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
    }
    @Test
    public void lionMaleKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lionMale.getKittens());
    }
    @Test
    public void lionFemaleKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lionFemale.getKittens());
    }
    @Test
    public void getKittensTest() {
        lionFemale.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens();
    }

}