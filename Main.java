
import Seminar01.Animal;

public class Main {
   public static void main(String[] args) {
      /*
       * Вызываем конструктор класса Animal. Если в классе Animal конструктор не
       * описан,
       * то вызывается конструктор по умолчанию
       */
      Animal animal = new Animal();
      animal.getPhylum();
      animal.setPhylum("Млекопитающее");
      System.out.println(animal.getPhylum()); // Млекопитающее

      Animal cat01 = new Animal("Mammal");
      System.out.println(cat01); // Animal [phylum=Mammal, age=0]

      Animal cat02 = new Animal("Mammal", 3);
      System.out.println(cat02); // Animal [phylum=Mammal, age=3]

   }
}
