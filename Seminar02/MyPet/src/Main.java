public class Main {
   public static void main(String[] args) {
      Human bobDilan = new Human(true, true);

      Dog bobic = new Dog("Бобик", true, false, false);

      bobDilan.setPet(bobic);
      bobic.setHuman(bobDilan);

      System.out.println(bobDilan); // Human [hasMeal=true, hasToy=true]
      System.out.println(bobic); // Pet [name=Бобик, isHungry=true, isTired=false, isSleeping=false,
                                 // moodToPlay=false]

      bobDilan.playWithPet(bobic); // Бобик рычит // Бобик не хочет играть

      // bobDilan has got some meal and he is trying to feed the pet
      bobDilan.feedPet(); // Бобик наелся

      // bobDilan hasn't got some meal and he is trying to feed the pet
      bobDilan.feedPet(); // Бобик рычит

      // bobDilan hasn't got some toy and he is trying to play with bobic
      bobDilan.setHasToy(false);
      bobDilan.playWithPet(bobic); // Бобик убегает // Бобик не хочет играть

      // bobDilan has got some toy and he is trying to play with bobic
      bobDilan.setHasToy(true);
      bobDilan.playWithPet(bobic); // Бобик играет

   }
}
