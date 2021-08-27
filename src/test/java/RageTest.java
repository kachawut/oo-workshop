import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RageTest {

    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue(){

        Range range = new Range("[1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertTrue(actualResult);
    }

    @Test
    public void isStartWithInclusiveWithBracketShouldBefalse(){

        Range range = new Range("(1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertFalse(actualResult);
    }

    @Test
    public void getStartInputShouldBe1(){

        Range range = new Range("(1,5]");

        int actualResult = range.getStartInput();

        assertEquals(1,actualResult);
    }

    @Test
    public void isEndWithInclusiveWithKampooShouldBeTrue(){

        Range range = new Range("[1,5]");

        boolean actualResult = range.isEndWithInclusive();

        assertTrue(actualResult);
    }

    @Test
    public void isEndWithInclusiveWithBracketShouldBefalse(){

        Range range = new Range("(1,5]");

        boolean actualResult = range.isEndWithInclusive();

        assertFalse(actualResult);
    }
}
