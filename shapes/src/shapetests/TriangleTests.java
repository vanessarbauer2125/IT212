package shapetests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import shapes.Triangle;

class TriangleTest {

    @Test
    void calculatePerimeter_withValidSides_ReturnsCorrectPerimeter() {
        Triangle tri = new Triangle("tri", 3, 4, 5);
        double perimeter = tri.calculatePerimeter();
        Assertions.assertEquals(12.0, perimeter);
    }

    @Test
    void calculateArea_withValidSides_ReturnsCorrectArea() {
        Triangle tri = new Triangle("tri", 3, 4, 5);
        double area = tri.calculateArea();
        Assertions.assertEquals(6.0, area);  // exact result for 3-4-5
    }

    @Test
    void triangleConstructor_withNegativeSide_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Triangle("tri", -3, 4, 5)
        );
        Assertions.assertEquals("Provided dimension : -3.0 should be greater than 1.", ex.getMessage());
    }

    @Test
    void triangleConstructor_withZeroSide_shouldThrowException() {
        IllegalArgumentException ex = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> new Triangle("tri", 0, 4, 5)
        );
        Assertions.assertEquals("Provided dimension : 0.0 should be greater than 1.", ex.getMessage());
    }

    @Test
    void calculateArea_withDoubleSides_ReturnsCorrectArea() {
        Triangle tri = new Triangle("tri", 6.5, 7.2, 8.1);
        double area = tri.calculateArea();

        // expected value using Heron's formula
        double s = (6.5 + 7.2 + 8.1) / 2; // 10.9
        double expected = Math.sqrt(s * (s - 6.5) * (s - 7.2) * (s - 8.1));

        Assertions.assertEquals(expected, area);
    }
}
