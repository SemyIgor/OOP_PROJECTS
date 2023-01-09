public class Main {
   public static void main(String[] args) {
      Human bobDilan = new Human(true, true);
      Human ellySmith = new Human(true, true);

      // Dog bobic = new Dog("Бобик", true, false, false);
      Dog bobic = new Dog("Бобик", true, false, bobDilan, false);

      Cat mursic = new Cat("Мурзик", true, false, ellySmith, false);

      bobDilan.setPet(bobic);
      bobic.setHuman(bobDilan);

      ellySmith.setPet(mursic);
      mursic.setHuman(ellySmith);

      System.out.println(bobDilan); // Human [hasMeal=true, hasToy=true]
      System.out.println(bobic); // Pet [name=Бобик, isHungry=true, isTired=false,
                                 // isSleeping=false, moodToPlay=false]
      System.out.println(ellySmith);
      System.out.println(mursic);

      bobDilan.playWithPet(bobic); // Бобик рычит // Бобик не хочет играть
      ellySmith.playWithPet(mursic); // Мурзик не хочет играть

      // bobDilan has got some meal and he is trying to feed the pet
      bobDilan.feedPet(); // Бобик наелся
      ellySmith.feedPet();

      // bobDilan hasn't got some meal and he is trying to feed the pet
      bobDilan.feedPet(); // Бобик рычит

      // bobDilan hasn't got some toy and he is trying to play with bobic
      bobDilan.setHasToy(false);
      bobDilan.playWithPet(bobic); // Бобик убегает // Бобик не хочет играть

      ellySmith.playWithPet(mursic);

      // bobDilan has got some toy and he is trying to play with bobic
      bobDilan.setHasToy(true);
      bobDilan.playWithPet(bobic); // Бобик играет

   }
}
