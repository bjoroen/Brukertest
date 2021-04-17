import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oppgave2Test {

    Oppgave2 sum = new Oppgave2();


    @Test
    public void TestPositive()
    {
        assertEquals(14, sum.getSum(5, -1));
        assertEquals(127759, sum.getSum(505, 4));
        assertEquals(44178, sum.getSum(321, 123));
    }
    @Test
    public void TestNegative()
    {
        assertEquals(-1275, sum.getSum(-50, 0));
        assertEquals(-15, sum.getSum(-1, -5));
        assertEquals(-5, sum.getSum(-5, -5));
        assertEquals(-127755, sum.getSum(-505, 4));
        assertEquals(-44055, sum.getSum(-321, 123));
    }

    @Test
    public void TestZero()
    {
        assertEquals(0, sum.getSum(0, 0));
    }

    @Test
    public void TestSwitchMinMax()
    {
        assertEquals(-15, sum.getSum(-5, -1));
        assertEquals(15, sum.getSum(5, 1));
    }

    @Test
    public void TestEqual()
    {
        assertEquals(-17, sum.getSum(-17, -17));
        assertEquals(17, sum.getSum(17, 17));
    }
}
