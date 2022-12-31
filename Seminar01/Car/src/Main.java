public class Main {
   public static void main(String[] args) {
      Person wife = new Person("Мария", true, true, true);
      Person husband = new Person("Данила", true, true, false);

      Car wifesCar = new Car(false, false, false);
      Car husbandsCar = new Car(true, false, false);
      wifesCar.setModel("Тайота");
      husbandsCar.setModel("BMW");

      if (familyOnTrip(husband, wifesCar)) {
         System.out.println("Поездка состоится");
      } else if (familyOnTrip(wife, wifesCar)) {
         System.out.println("Поездка состоится");
      } else if (familyOnTrip(husband, husbandsCar)) {
         System.out.println("Поездка состоится");
      } else if (familyOnTrip(wife, husbandsCar)) {
         System.out.println("Поездка состоится");
      } else {
         System.out.println("Поездка не состоится");
      }

   }

   public static boolean familyOnTrip(Person person, Car car) {
      if (car.openCar(person, car) && car.fueledCar(car) && person.startCar(person, car)
            && person.personIsNotDrunk(person, car)) {
         System.out.printf("%s будет управлять автомобилем %s в поездке\n", person.getName(), car.getModel());
         return true;
      } else {
         return false;
      }
   }
}
