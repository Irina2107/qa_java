package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setCat() {
        cat = new Cat(feline);
    }

    @Test
    public void eatFoodCatTest() throws Exception{
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(expectedFood);
        Assert.assertEquals(expectedFood, cat.getFood());
    }
    @Test
    public void getSoundCatTest() {
        Cat cat = new Cat(feline);
        String actualSoundCat = cat.getSound();
        assertEquals("Кошка мяукает", "Мяу", actualSoundCat);
    }
}