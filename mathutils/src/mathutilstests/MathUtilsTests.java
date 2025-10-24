package mathutilstests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import mathutils.*;

public class MathUtilsTests {

    @Test
    void testAdd() {
        Assertions.assertEquals(15, MathUtils.add(10, 5));
        Assertions.assertEquals(-5, MathUtils.add(-10, 5));
        Assertions.assertEquals(0, MathUtils.add(0, 0));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(5, MathUtils.subtract(10, 5));
        Assertions.assertEquals(-15, MathUtils.subtract(-10, 5));
        Assertions.assertEquals(0, MathUtils.subtract(0, 0));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(50, MathUtils.multiply(10, 5));
        Assertions.assertEquals(-50, MathUtils.multiply(-10, 5));
        Assertions.assertEquals(0, MathUtils.multiply(0, 5));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2.0, MathUtils.divide(10, 5));
        Assertions.assertTrue(Double.isNaN(MathUtils.divide(10, 0)));  // divide by zero
        Assertions.assertEquals(-2.5, MathUtils.divide(-5, 2));
    }
}
