public class Main {
   public static void main(String[] args) {
      Person first = new Person("Иванов Иван Иванович");
      Person second = new Person("Иванов Сергей Иванович");
      Person third = new Person("Иванова Елена Сергеевна");

      System.out.println(third.getName()); // Иванова Елена Сергеевна
      System.out.println(third.getFamily()); // []

      third.appendToFamily(first);
      third.appendToFamily(second);
      System.out.println(third.getFamily()); // [Person [name=Иванов Иван Иванович],
                                             // Person [name=Иванов Сергей Иванович]]

   }

   static void viewFamily(Person rootPerson) {
   }
}
