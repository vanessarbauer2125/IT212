package zoo;
public class Monkey extends Animal {
   public Monkey(String name) {
      super(name);
   }
   
   public void makeSound() {

      System.out.println("Ook eek");
   }
   
   public void makeSound(int num) {
      if (num <= 0) {
         return;
      }

      System.out.print("Ook eek");
      for (int i = 0; i < num - 1; i++) {
         System.out.print(" Ook eek");
      }
   }
}