import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RageTest {

    @Test
    public void isStartWithInclusiveWithKampooShouldBeTrue(){

        Range range = new Range("[1,5]");

        boolean actualResult = range.isStartWithInclusive();

        assertTrue(actualResult);
    }
}
