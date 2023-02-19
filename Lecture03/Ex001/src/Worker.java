public class Worker {
   public String firstName;
   public String lastName;
   public int age;
   public int salary;

   public Worker(String firstName,
         String lastName,
         int age,
         int salary) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.salary = salary;
   }

   public String fullName() {
      return String.format("%s %s", firstName, lastName);
   }

   @Override
   public String toString() {
      return firstName + " " + lastName + ", возраст: " + age + ", з/плата: " + salary;
   }

}