import java.util.ArrayList;
import java.util.Collections;

public class Main {
   public static void main(String[] args) {
      Human bobDilan = new Human(true, true);
      Human ellySmith = new Human(true, true);

      // Dog bobic = new Dog("Бобик", true, false, false);
      Dog barbos = new Dog("Барбос", true, false, bobDilan, false, 15, 8);
      Dog bobic = new Dog("Бобик", true, false, bobDilan, false, 10, 5);

      Cat mursic = new Cat("Мурзик", true, false, ellySmith, false, 4, 4);
      Cat vasily = new Cat("Василий", true, false, ellySmith, false, 7, 12);
      Cat barsic = new Cat("Барсик", false, false, ellySmith, false, 5, 7);

      // Set<Pet> playGroundPets = new HashSet<>();
      ArrayList<Pet> playGroundPets = new ArrayList<>();

      playGroundPets.add(bobic);
      playGroundPets.add(barbos);
      playGroundPets.add(mursic);
      playGroundPets.add(barsic);
      playGroundPets.add(vasily);

      System.out.println("Животные до сортировки по весу");
      for (Pet pet : playGroundPets) {
         System.out.println(pet.getName() + " - вес " + pet.getWeight());
      }

      Collections.sort(playGroundPets, new PetWeightComparator());

      System.out.println("Животные после сортировки по весу");
      for (Pet pet : playGroundPets) {
         System.out.println(pet.getName() + " - вес " + pet.getWeight());
      }

      System.out.println("Животные до сортировки по возрасту");
      for (Pet pet : playGroundPets) {
         System.out.println(pet.getName() + " - возраст " + pet.getAge());
      }

      Collections.sort(playGroundPets, new PetAgeComparator());

      System.out.println("Животные после сортировки по возрасту");
      for (Pet pet : playGroundPets) {
         System.out.println(pet.getName() + " - возраст " + pet.getAge());
      }

      /*
       * bobDilan.setPet(bobic);
       * bobic.setHuman(bobDilan);
       * 
       * ellySmith.setPet(mursic);
       * mursic.setHuman(ellySmith);
       * 
       * System.out.println(bobDilan); // Human [hasMeal=true, hasToy=true]
       * System.out.println(bobic); // Pet [name=Бобик, isHungry=true, isTired=false,
       * // isSleeping=false, moodToPlay=false]
       * System.out.println(ellySmith);
       * System.out.println(mursic);
       * 
       * bobDilan.playWithPet(bobic); // Бобик рычит // Бобик не хочет играть
       * ellySmith.playWithPet(mursic); // Мурзик не хочет играть
       * 
       * // bobDilan has got some meal and he is trying to feed the pet
       * bobDilan.feedPet(); // Бобик наелся
       * ellySmith.feedPet();
       * 
       * // bobDilan hasn't got some meal and he is trying to feed the pet
       * bobDilan.feedPet(); // Бобик рычит
       * 
       * // bobDilan hasn't got some toy and he is trying to play with bobic
       * bobDilan.setHasToy(false);
       * bobDilan.playWithPet(bobic); // Бобик убегает // Бобик не хочет играть
       * 
       * ellySmith.playWithPet(mursic);
       * 
       * // bobDilan has got some toy and he is trying to play with bobic
       * bobDilan.setHasToy(true);
       * bobDilan.playWithPet(bobic); // Бобик играет
       * 
       */

   }
}
