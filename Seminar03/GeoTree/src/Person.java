public class Person implements Comparable<Person> {
   private String fullName;
   private int age;
   private String sex;

   public Person(String fullName, int age, String sex) {
      this.fullName = fullName;
      this.age = age;
      this.sex = sex;
   }

   public String getFullName() {
      return fullName;
   }

   public int getAge() {
      return age;
   }

   public String getSex() {
      return sex;
   }

   public void whoIsOlder(Person otherPerson) {
      if (compareTo(otherPerson) < 0) {
         System.out.printf("\n%s младше, чем %s\n", this.fullName, otherPerson.fullName);
      } else if (compareTo(otherPerson) == 0) {
         System.out.printf("\n%s и %s ровесники\n", this.fullName, otherPerson.fullName);
      } else {
         System.out.printf("\n%s старше, чем %s\n", this.fullName, otherPerson.fullName);
      }
   }

   @Override
   public String toString() {
      return "[" + fullName + ", " + age + ", " + sex + "]";
   }

   @Override
   public int compareTo(Person otherPerson) {
      return Integer.compare(getAge(), otherPerson.getAge());
   }

}