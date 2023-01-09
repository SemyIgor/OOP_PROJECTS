public class Cat extends Pet implements PetVoice {
   public boolean isSleeping;

   public Cat(String name, boolean isHungry, boolean moodToPlay, Human human, boolean isSleeping, int weight, int age) {
      super(name, isHungry, moodToPlay, human, weight, age);
      this.isSleeping = isSleeping;
   }

   public boolean isSleeping() {
      return isSleeping;
   }

   public void setSleeping(boolean isSleeping) {
      this.isSleeping = isSleeping;
   }

   @Override
   public void go() {
      System.out.println("Котик фыркнул и ушёл");
   }

   @Override
   public void eat() {
      System.out.println("Котик поел");
   }

   @Override
   public void play() {
      System.out.println("Котик играет");
   }

   @Override
   public void pleasureSound() {
      System.out.println("Котик мурлычет");
   }

   @Override
   public void unPleasureSound() {
      System.out.println("Котик мяукает");
   }

   @Override
   public void agressiveSound() {
      System.out.println("Котик шипит");
   }

   @Override
   public boolean petCanPlay(Human human) {
      if (human.isHasToy()) {
         if (super.isHungry()) {
            this.unPleasureSound();
            return false;
         } else if (this.isSleeping) {
            this.pleasureSound();
            return false;
         } else {
            super.setMoodToPlay(true);
            return true;
         }
      } else {
         this.go();
         return false;
      }
   }
}
