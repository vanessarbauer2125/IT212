package shapes;

public class Circle extends Shape {
   
   private double radius;
   
   public Circle(String name, double radius) {
      super(name);
      this.radius = radius;   
   }
   
   public double calculatePerimeter() {
      return 2 * radius * Math.PI;
   }
   
   public double calculateArea() {
      return Math.pow(radius, 2) * Math.PI;
   }
}