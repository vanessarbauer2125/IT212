package mathutils;

public class MathUtils {

    // Addition
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division with error handling
    public static double divide(int a, int b) {
        if (b == 0) {
            return Double.NaN; // Not a Number — avoids crash
        }
        return (double) a / b;
    }
}
