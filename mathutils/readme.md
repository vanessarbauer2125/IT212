# MathUtils Project

This project contains a simple Java utility class `MathUtils` that provides static methods for common mathematical operations, along with JUnit 5 tests to verify correctness.

## Files Included

* `MathUtils.java` — Contains static methods: add, subtract, multiply, divide.
* `MathUtilsTest.java` — JUnit 5 test class to validate all methods.
* `TestMathUtils.java` *(optional standalone runner if included)* — For manual console testing.

## Features

* Addition, subtraction, multiplication, and division
* Safe division that returns `Double.NaN` when dividing by zero
* Fully tested using JUnit 5

## How to Run Tests

1. Ensure you have JUnit 5 configured in your project.
2. Run the following command (Maven example):

   ```bash
   mvn test
   ```

   Or simply run the test class from your IDE.

## Example Usage

```java
System.out.println(MathUtils.add(10, 5));      // 15
System.out.println(MathUtils.divide(10, 0));   // NaN
```

## Requirements

* Java 8 or higher
* JUnit 5 for automated testing

