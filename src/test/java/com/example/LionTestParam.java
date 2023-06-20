package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionTestParam  extends Feline{

    private final String sexN;
    private final boolean expected;

    public LionTestParam(String sexN, boolean expected) {
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
    @Mock
    Feline feline;

    @Test
    public void lionHaveManeTest() throws Exception {
        Lion lion = new Lion(sexN, feline);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
