package shapes;

import java.util.List;

public abstract class Shape {

   protected String name;

   public Shape(String name) {
      this.name = name;
   }

   public String getName() {
      return this.name;
   }

   public abstract double calculateArea();

   public abstract double calculatePerimeter();

   public void verifyPostiveNumber(double num) throws IllegalArgumentException {
      if (num <= 0) {
         throw new IllegalArgumentException("Provided dimension : " + num + " should be greater than 1.");
      }
   }

   public void verifyPostiveNumber(double num1, double num2) throws IllegalArgumentException {
      if (num1 <= 0 || num2 <= 0) {
         double invalidNum = num1 < num2 ? num1 : num2;
         throw new IllegalArgumentException("Provided dimension : " + invalidNum + " should be greater than 1.");
      }
   }

   public void verifyPostiveNumber(double num1, double num2, double num3) throws IllegalArgumentException {
      if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
         double invalidNum = Math.min(num1, num2);
         invalidNum = Math.min(invalidNum, num3);
         throw new IllegalArgumentException("Provided dimension : " + invalidNum + " should be greater than 1.");
      }
   }
}