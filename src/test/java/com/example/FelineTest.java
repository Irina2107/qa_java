package com.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Animal animal;
    Feline feline = new Feline();

    @Test
    public void testGetFamily() {
        animal.getFamily();
        Mockito.verify(animal, Mockito.times(1)).getFamily();
        String expectedCatFamily = "Кошачьи";
        Assert.assertEquals(expectedCatFamily, feline.getFamily());
    }
    @Test
    public void testGetKittens() {
        //Act
        int actualKittensCount = feline.getKittens(1);
         //Assert
        assertEquals("Кошка всего одна", 1, actualKittensCount);
    }
    @Test
    public void testTestGetKittens() {
        //Act
        int actualKittensCounts = feline.getKittens(10);
         //Assert
        assertEquals("10 кошечек", 10, actualKittensCounts);
    }
    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}

