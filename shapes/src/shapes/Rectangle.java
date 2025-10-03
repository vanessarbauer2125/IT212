package shapes;

import java.util.LinkedList;

public class Rectangle extends Shape {
   private double length;
   private double width;
   
   public Rectangle(String name, double length, double width) throws IllegalArgumentException {
      super(name);
      this.verifyPostiveNumber(length, width);
      this.length = length;
      this.width = width;
   }
   
   public double calculateArea() {
      return length * width;
   }
   
   public double calculatePerimeter() {
      return 2 * (length + width);
   }
}
