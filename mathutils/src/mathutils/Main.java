package mathutils;

public class Main {
    public static void main(String[] args) {

        System.out.println("Addition: " + MathUtils.add(10, 5));           // 15
        System.out.println("Subtraction: " + MathUtils.subtract(10, 5));   // 5
        System.out.println("Multiplication: " + MathUtils.multiply(10, 5)); // 50

        // Division normal case
        System.out.println("Division: " + MathUtils.divide(10, 5));         // 2.0

        // Division by zero test
        System.out.println("Division by zero: " + MathUtils.divide(10, 0)); // NaN
    }
}
