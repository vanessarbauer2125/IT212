package zoo;

public class ZooDemo {
   public static void main(String[] args) {
      Animal lion = new Lion("Kitty");
      Animal elephant = new Elephant("Tiny");
      Animal monkey = new Monkey("Dingo");
      
      Animal[] zoo = new Animal[]{lion, elephant, monkey};
      
      for (Animal a : zoo) {
         a.makeSound();
         a.makeSound(3);
         System.out.println();
      }
   }
}