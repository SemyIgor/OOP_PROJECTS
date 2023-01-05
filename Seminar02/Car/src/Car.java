public class Car {
   private String model;
   private boolean fueled;
   private boolean opened;
   private boolean sound;

   public Car(boolean fueled, boolean opened, boolean sound) {
      this.fueled = fueled;
      this.opened = opened;
      this.sound = sound;
   }

   public Car(String model, boolean fueled, boolean opened, boolean sound) {
      this.model = model;
      this.fueled = fueled;
      this.opened = opened;
      this.sound = sound;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public boolean isFueled() {
      return fueled;
   }

   public boolean isOpened() {
      return opened;
   }

   public void setOpened(boolean opened) {
      this.opened = opened;
   }

   public boolean isSound() {
      return sound;
   }

   public void setSound(boolean sound) {
      this.sound = sound;
   }

   public boolean fueledCar(Car car) {
      if (car.isFueled()) {
         System.out.printf("Автомобиль %s заправлен\n", car.model);
         return true;
      } else {
         System.out.printf("Автомобиль %s не заправлен\n", car.model);
         return false;
      }
   }

   @Override
   public String toString() {
      return "[" + model + fueled + ", " + opened + ", " + sound + "]";
   }

}
