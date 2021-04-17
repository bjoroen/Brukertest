import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oppgave1Test {

    Oppgave1 opp = new Oppgave1();

    @Test
    public void testSomething() {
        assertEquals(6, opp.grow(new int[]{1,2,3}));
        assertEquals(16, opp.grow(new int[]{4,1,1,1,4}));
        assertEquals(64, opp.grow(new int[]{2,2,2,2,2,2}));
    }
}


