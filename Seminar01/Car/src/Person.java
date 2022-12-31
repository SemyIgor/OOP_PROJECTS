public class Person {
   private String name;
   private boolean hasDoorKey;
   private boolean hasIgnitionKey;
   private boolean notDrunk;

   public Person(String name, boolean hasDoorKey, boolean hasIgnitionKey, boolean notDrunk) {
      this.name = name;
      this.hasDoorKey = hasDoorKey;
      this.hasIgnitionKey = hasIgnitionKey;
      this.notDrunk = notDrunk;
   }

   public boolean isHasDoorKey() {
      return hasDoorKey;
   }

   public String getName() {
      return name;
   }

   public boolean isHasIgnitionKey() {
      return hasIgnitionKey;
   }

   public boolean isNotDrunk() {
      return notDrunk;
   }

   public boolean personIsNotDrunk(Person person, Car car) {
      if (!person.notDrunk) {
         System.out.printf("Система безопасности автомобиля %s определила, что водитель %s нетрезв\n", car.getModel(),
               name);
         return false;
      } else {
         return true;
      }
   }

   public boolean startCar(Person person, Car car) {
      if (car.isSound()) {
         System.out.printf("Автомобиль %s был уже заведен\n", car.getModel());
         return true;
      }
      if (person.isHasIgnitionKey()) {
         car.setSound(true);
         System.out.printf("Водителю %s удалось завести автомобиль %s\n", person.getName(), car.getModel());
         return true;
      } else {
         System.out.printf("Водителю %s не удалось завести автомобиль %s\n", person.getName(), car.getModel());
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + name + hasDoorKey + ", " + hasIgnitionKey + ", " + notDrunk + "]";
   }

}
