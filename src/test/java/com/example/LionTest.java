package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
 @Spy
  Feline feline;
  private Lion lionMale;
  private Lion lionFemale;

    @Before
   public void setLionMale() throws Exception {lionMale = new Lion("Самец", feline);}
    @Before
    public void setLionFemale() throws Exception {lionFemale = new Lion("Самка", feline);}
    @Test
    public void leonMaleEatTest() throws Exception {
        assertEquals("Это еда не для льва", List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
    }
    @Test
    public void leonFemaleEatTest() throws Exception {
        assertEquals("Это еда не для львицы", List.of("Животные", "Птицы", "Рыба"), lionFemale.getFood());
    }
    @Test
    public void lionMaleKittensTest() {
              assertEquals(1, lionMale.getKittens());
    }
    @Test
    public void lionFemaleKittensTest() {
        assertEquals(1, lionFemale.getKittens());
    }
 }
