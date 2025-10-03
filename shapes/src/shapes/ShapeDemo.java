package shapes;

public class ShapeDemo {
   public static void main(String[] args) throws IllegalArgumentException {
      Shape circle = new Circle("Circ", 10);
      Shape rectangle = new Rectangle("Rect", 5, 10);
      Shape triangle = new Triangle("Tri", 5, 5, 5);
      
      System.out.println("Circle name = " + circle.getName());
      System.out.println("Circle area = " + round1(circle.calculateArea()));
      System.out.println("Circle perimeter = " + round1(circle.calculatePerimeter()));
      System.out.println();
      
      System.out.println("Rectangle name = " + rectangle.getName());
      System.out.println("Rectangle area = " + round1(rectangle.calculateArea()));
      System.out.println("Rectangle perimeter = " + round1(rectangle.calculatePerimeter()));
      System.out.println();
      
      System.out.println("Triangle name = " + triangle.getName());
      System.out.println("Triangle area = " + round1(triangle.calculateArea()));
      System.out.println("Triangle perimeter = " + round1(triangle.calculatePerimeter()));
      System.out.println();

   }
   
   public static double round1(double num) {
      return Math.round(num * 100) / 100.0;
   }
}