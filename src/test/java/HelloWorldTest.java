import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKachawut () {
        //Arrange
        HelloWorld helloWorld = new HelloWorld();

        //Act
        String actualResult = helloWorld.greeting("Kachawut");

        //Assert
        assertEquals("Hello Kachawut", actualResult);
    }
}