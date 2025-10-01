package zoo;
public class Elephant extends Animal {
   public Elephant(String name) {
      super(name);
   }
   
   public void makeSound() {
      System.out.println("Hjooonk");
   }

   public void makeSound(int num) {
      if (num <= 0) {
         return;
      }

      System.out.print("Hjooonk");
      for (int i = 0; i < num - 1; i++) {
         System.out.print(" Hjooonk");
      }
   }
}