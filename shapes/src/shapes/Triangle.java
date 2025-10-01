package shapes;

public class Triangle extends Shape {
   private double sideA;
   private double sideB;
   private double sideC;
   
   public Triangle (String name, double sideA, double sideB, double sideC) {
      super(name);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
   }
   
   public double calculatePerimeter() {
      return sideA + sideB + sideC;
   }
   
   public double calculateArea() {
      double semiPerimeter = (sideA + sideB + sideC) / 2;
      return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * 
            (semiPerimeter - sideB) * (semiPerimeter - sideC));
   }
}