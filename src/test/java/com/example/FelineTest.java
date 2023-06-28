package com.example;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void testGetCatFamily() {
        feline.getFamily();
        String expectedCatFamily = "Кошачьи";
        Assert.assertEquals(expectedCatFamily, feline.getFamily());
    }
    @Test
    public void testGetKittensOne() {
        int actualKittensCount = feline.getKittens(1);
        assertEquals("Кошка всего одна", 1, actualKittensCount);
    }
    @Test
    public void testGetKittensCount() {
        int actualKittensCounts = feline.getKittens(10);
        assertEquals("10 кошечек", 10, actualKittensCounts);
    }
    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}

