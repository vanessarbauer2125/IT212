package shapes;

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
   
}