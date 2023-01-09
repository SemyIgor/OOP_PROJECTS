public class Dog extends Pet implements PetVoice {
   public boolean isTired;

   public Dog(String name, boolean isHungry, boolean moodToPlay, Human human, boolean isTired, int weight, int age) {
      super(name, isHungry, moodToPlay, human, weight, age);
      this.isTired = isTired;
   }

   public boolean isTired() {
      return isTired;
   }

   public void setTired(boolean isTired) {
      this.isTired = isTired;
   }

   @Override
   public void go() {
      System.out.printf("%s убежал\n", super.getName());
   }

   @Override
   public void eat() {
      System.out.println("Собака поела");
   }

   @Override
   public void play() {
      System.out.println("Собака играет");
   }

   @Override
   public void pleasureSound() {
      System.out.println("Собака радостно лает");
   }

   @Override
   public void unPleasureSound() {
      System.out.println("Собака скулит");
   }

   @Override
   public void agressiveSound() {
      System.out.println("Собака рычит");
   }

   @Override
   boolean petCanPlay(Human human) {
      if (human.isHasToy()) {
         if (super.isHungry()) {
            this.agressiveSound();
            return false;
         } else if (this.isTired) {
            this.unPleasureSound();
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
