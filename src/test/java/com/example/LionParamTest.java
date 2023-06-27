package com.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionParamTest {
    private final String sexN;
    private final boolean expected;
    public LionParamTest(String sexN, boolean expected) {
        this.sexN = sexN;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
          };
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(Feline.class);
    }
   Feline feline = Mockito.mock(Feline.class);
    @Test
    public void lionHaveManeTest()  throws Exception{
        Lion lion = new Lion(sexN, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
