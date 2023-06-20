package com.example;
import org.junit.Test;

public class LionExceptionTest {
  Feline feline = new Feline();

    @Test
    public void exceptionLion() {
        try {
           new Lion("Львенок", feline);;

        } catch (Exception exception)
        {
           new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }
}