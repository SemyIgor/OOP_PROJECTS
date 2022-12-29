public class Dog extends Animal { // Класс Dog наследуется от класса Animal
   // private String phylum; убрали, тотому что наследуется от Animal
   private String name;

   public Dog(String phylum, int age, String name) {
      // this.phylum = phylum; не присваиваем, а наследуем от Animal
      super(phylum, age);
      this.name = name;
   }

   public Dog(String phylum, int age) {
      super(phylum, age);
   };

   public Dog(String name) {
      this.name = name;
   }

   /*
    * Геттеры и сеттеры этого свойства будут использоваться от класса Animal
    * public String getPhylum() {
    * return phylum;
    * }
    * 
    * public void setPhylum(String phylum) {
    * this.phylum = phylum;
    * }
    */

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public void voice() {
      System.out.println("Dog " + name + " says: Гав-гав-гав");
   }

   @Override
   public String toString() {
      return "Dog [name=" + name + ", age=" + super.getAge() + ", phylum=" + super.getPhylum() + "]";
   }

}
