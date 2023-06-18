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
        when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
    @Test
    public void getSoundCatTest() {

        //Arrange
        Cat cat = new Cat(feline);
        //Act
        String actualSoundCat = cat.getSound();
        //  System.out.println(actualSoundCat);
        //Assert
        assertEquals("Кошка мяукает", "Мяу", actualSoundCat);
    }

}