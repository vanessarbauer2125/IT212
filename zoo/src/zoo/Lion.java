package zoo;

public class Lion extends Animal {
   public Lion(String name) {
      super(name);
   }
   
   public void makeSound() {
      System.out.println("Roar");
   }
   
   public void makeSound(int num) {
      if (num <= 0) {
         return;
      }

      System.out.print("Roar");
      for (int i = 0; i < num - 1; i++) {
         System.out.print(" Roar");
      }
   }
}