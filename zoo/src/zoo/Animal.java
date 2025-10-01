package zoo;
public abstract class Animal {
   protected String name;
   
   public Animal (String name) {
      this.name = name;
   }

    public abstract void makeSound();
    public abstract void makeSound(int n);

}