import java.util.ArrayList;

public class Person {
   private String name;
   private ArrayList<Person> family = new ArrayList<>();

   public Person(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public ArrayList<Person> getFamily() {
      return family;
   }

   public void appendToFamily(Person person) {
      if (person != null && person != this) { // Исключаем появление в семье пустого человека
                                              // и добавление в свою семью самого себя (защита рекурсии
                                              // в методе viewFamily)
         family.add(person);
      }
   }

   @Override
   public String toString() {
      return "\nPerson [name=" + name + "]";
   }

}
