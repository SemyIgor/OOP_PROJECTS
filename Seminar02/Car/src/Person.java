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

   public boolean personIsNotDrunk(Car car) {
      if (!this.notDrunk) {
         System.out.printf("Система безопасности автомобиля %s определила, что водитель %s нетрезв\n", car.getModel(),
               name);
         return false;
      } else {
         return true;
      }
   }

   public boolean openCar(Car car) {
      if (car.isOpened()) {
         System.out.printf("Автомобиль %s был уже открыт, водитель %s внутри\n", car.getModel(), this.getName());
         return true;
      }
      if (this.isHasDoorKey()) {
         car.setOpened(true);
         System.out.printf("Водитель %s открыл автомобиль %s и попал внутрь\n", this.getName(), car.getModel());
         return true;
      } else {
         System.out.printf("Водитель %s не сумел попасть в автомобиль %s\n", this.getName(), car.getModel());
         return false;
      }
   }

   public boolean startCar(Car car) {
      if (car.isSound()) {
         System.out.printf("Автомобиль %s был уже заведен\n", car.getModel());
         return true;
      }
      if (this.isHasIgnitionKey()) {
         car.setSound(true);
         System.out.printf("Водителю %s удалось завести автомобиль %s\n", this.getName(), car.getModel());
         return true;
      } else {
         System.out.printf("Водителю %s не удалось завести автомобиль %s\n", this.getName(), car.getModel());
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + name + hasDoorKey + ", " + hasIgnitionKey + ", " + notDrunk + "]";
   }

}
