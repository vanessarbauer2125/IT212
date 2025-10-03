package shapetests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shapes.Rectangle;

class RectangleTest {

    @Test
    void calculatePerimeter_withPositiveInts_ReturnsCorrectPerimeter() {
        Rectangle rect = new Rectangle("rect", 5, 10);
        double perimeter = rect.calculatePerimeter();
        Assertions.assertEquals(30.0, perimeter);
    }

    @Test
    void calculateArea_withPositiveInts_ReturnsCorrectArea() {
        Rectangle rect = new Rectangle("rect", 5, 10);
        double area = rect.calculateArea();
        Assertions.assertEquals(50.0, area);
    }

    @Test
    void calculatePerimeter_withDoubles_ReturnsCorrectPerimeter() {
        Rectangle rect = new Rectangle("rect", 2.5, 4.0);
        double perimeter = rect.calculatePerimeter();
        Assertions.assertEquals(13.0, perimeter);
    }

    @Test
    void calculateArea_withDoubles_ReturnsCorrectArea() {
        Rectangle rect = new Rectangle("rect", 2.5, 4.0);
        double area = rect.calculateArea();
        Assertions.assertEquals(10.0, area);
    }

    @Test
    void rectangleConstructor_withNegativeWidth_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Rectangle("rect", -5, 10)
        );
        Assertions.assertEquals("Provided dimension : -5.0 should be greater than 1.", ex.getMessage());
    }

    @Test
    void rectangleConstructor_withNegativeHeight_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Rectangle("rect", 5, -10)
        );
        Assertions.assertEquals("Provided dimension : -10.0 should be greater than 1.", ex.getMessage());
    }

    @Test
    void rectangleConstructor_withZeroDimensions_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Rectangle("rect", 0, 0)
        );
        Assertions.assertEquals("Provided dimension : 0.0 should be greater than 1.", ex.getMessage());
    }
}
