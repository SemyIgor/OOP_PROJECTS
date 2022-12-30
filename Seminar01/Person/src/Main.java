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
      viewFamily(third); /*
                          * Person [name=Иванова Елена Сергеевна]
                          * Person [name=Иванов Иван Иванович]
                          * Person [name=Иванов Сергей Иванович]
                          */
      System.out.println();
      viewFamily(first); /*
                          * Person [name=Иванов Иван Иванович]
                          */
      viewFamily(null);
      /*
       * Если нет person, то метод viewFamily при
       * проверке if это обнаружит и завершит работу
       */
   }

   // Методы static работают только с методами static. Поэтому, для использования
   // viewFamily() в методе main() (не классе Main!!!), метод viewFamily() тоже
   // должен быть static
   static void viewFamily(Person rootPerson) {
      if (rootPerson != null) {
         System.out.print(rootPerson); // Срабатывает сразу, а затем при каждой итерации
         for (Person person : rootPerson.getFamily()) {
            viewFamily(person);
         }
      }
   }
}
