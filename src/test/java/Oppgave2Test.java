import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oppgave2Test {



    @Test
    public void TestPositive()
    {
        assertEquals(14, Oppgave2.getSum(5, -1));
        assertEquals(127759, Oppgave2.getSum(505, 4));
        assertEquals(44178, Oppgave2.getSum(321, 123));
    }
    @Test
    public void TestNegative()
    {
        assertEquals(-1275, Oppgave2.getSum(-50, 0));
        assertEquals(-15, Oppgave2.getSum(-1, -5));
        assertEquals(-5, Oppgave2.getSum(-5, -5));
        assertEquals(-127755, Oppgave2.getSum(-505, 4));
        assertEquals(-44055, Oppgave2.getSum(-321, 123));
    }

    @Test
    public void TestZero()
    {
        assertEquals(0, Oppgave2.getSum(0, 0));
    }

    @Test
    public void TestSwitchMinMax()
    {
        assertEquals(-15, Oppgave2.getSum(-5, -1));
        assertEquals(15, Oppgave2.getSum(5, 1));
    }

    @Test
    public void TestEqual()
    {
        assertEquals(-17, Oppgave2.getSum(-17, -17));
        assertEquals(17, Oppgave2.getSum(17, 17));
    }
}
