public class Main {
   public static void main(String[] args) {
      Human bobDilan = new Human(true, true);

      Pet bobic = new Pet("Бобик", true, false, false);

      bobDilan.setPet(bobic);
      bobic.setHuman(bobDilan);

      System.out.println(bobDilan);
      System.out.println(bobic);

      bobDilan.playWithPet(bobic);

      // bobDilan has got some meal and he is trying to feed the pet
      bobDilan.feedPet();
      // System.out.println(bobic);

      // bobDilan hasn't got some meal and he is trying to feed the pet
      bobDilan.feedPet();

      // bobDilan hasn't got some toy and he is trying to play with bobic
      bobDilan.setHasToy(false);
      bobDilan.playWithPet(bobic);

      // bobDilan has got some toy and he is trying to play with bobic
      bobDilan.setHasToy(true);
      bobDilan.playWithPet(bobic);

   }
}
