package com.example;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class LionTest {
    Feline feline = new Feline();
    Lion lionMale = new Lion("Самец", feline);
    Lion lionFemale = new Lion("Самка", feline);
    // LionQ another = new LionQ("Нечто", feline);
    public LionTest() throws Exception {
    }

    @Test
    public void leonMaleEatTest() throws Exception {
        assertEquals("Это еда не для льва", List.of("Животные", "Птицы", "Рыба"), lionMale.getFood());
    }
    @Test
    public void getKittensMaleTest() {
        assertEquals(1, lionMale.getKittens());
    }
    @Test
    public void lionHaveManeMaleTest() {
        assertEquals("У самца есть грива, а у самки - нет", true, lionMale.doesHaveMane());
    }
    @Test
    public void leonFemaleEatTest() throws Exception {
        assertEquals("Это еда не для льва", List.of("Животные", "Птицы", "Рыба"), lionFemale.getFood());
    }
    @Test
    public void getKittensFemaleTest() {
        assertEquals(1, lionFemale.getKittens());
    }
    @Test
    public void lionHaveManeFemaleTest() {
        assertEquals("У самца есть грива, а у самки - нет", false, lionFemale.doesHaveMane());
    }
}