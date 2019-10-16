package race;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ResultTest {

    private Result result;
    private Result result2;

    @Before
    public void setUp() {
        result = new Result("Lightning McQueen", 95, 100, false);
        result2 = new Result("Lightning McQueen", 95, 75, true);
    }

    @Test
    public void getResultStringFalse() {
        assertEquals("Lightning McQueen driving car number 95 scored 100! They had a clean race.", result.getResultString());
    }

    @Test
    public void getResultStringTrue() {
        assertEquals("Lightning McQueen driving car number 95 scored 75! They were damaged in the race and forced to pit.", result2.getResultString());
    }
}