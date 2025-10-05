package shapetests;

import org.junit.jupiter.api.Assertions;
import shapes.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void calculateArea_withPostiveInt_ReturnsCorrectArea() {
        Shape circ = new Circle("circ", 10);
        Assertions.assertEquals(314.1592653589793, circ.calculateArea());
    }

    @org.junit.jupiter.api.Test
    void calculatePerimeter_withPostiveInt_ReturnsCorrectArea() {
        Shape circ = new Circle("circ", 10);
        Assertions.assertEquals(62.83185307179586, circ.calculatePerimeter());
    }

    @org.junit.jupiter.api.Test
    void circleConstructor_withNegativeRadius_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Circle("circ", -10)   // code that should throw
        );

        // now you can check the exception message
        Assertions.assertEquals("Provided dimension : -10.0 should be greater than 1.", ex.getMessage());
    }
}