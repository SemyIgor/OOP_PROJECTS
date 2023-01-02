public class Pet {
   private String name;
   private boolean isHungry;
   private boolean isTired;
   private boolean isSleeping;
   private boolean moodToPlay;
   private Human human;

   public Pet(String name, boolean isHungry, boolean isTired, boolean isSleeping) {
      this.name = name;
      this.isHungry = isHungry;
      this.isTired = isTired;
      this.isSleeping = isSleeping;
      if (this.isHungry == false && this.isTired == false && this.isSleeping == false) {
         this.moodToPlay = true;
      } else {
         this.moodToPlay = false;
      }
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public boolean isHungry() {
      return isHungry;
   }

   public void setHungry(boolean isHungry) {
      this.isHungry = isHungry;
   }

   public boolean isTired() {
      return isTired;
   }

   public void setTired(boolean isTired) {
      this.isTired = isTired;
   }

   public boolean isSleeping() {
      return isSleeping;
   }

   public void setSleeping(boolean isSleeping) {
      this.isSleeping = isSleeping;
   }

   public boolean isMoodToPlay() {
      return moodToPlay;
   }

   public void setMoodToPlay(boolean moodToPlay) {
      this.moodToPlay = moodToPlay;
   }

   public Human getHuman() {
      return human;
   }

   public void setHuman(Human human) {
      this.human = human;
   }

   public void growl() {
      System.out.println("Бобик рычит");
   }

   public void whine() {
      System.out.println("Бобик скулит");
   }

   public void sniffle() {
      System.out.println("Бобик фыркает");
   }

   public void runAway() {
      System.out.println("Бобик убегает");
   }

   public boolean petCanPlay(Human human) {
      if (human.isHasToy()) {
         if (this.isHungry) {
            this.growl();
            return false;
         } else if (this.isTired) {
            this.whine();
            return false;
         } else if (this.isSleeping) {
            this.sniffle();
            return false;
         } else {
            this.moodToPlay = true;
            return true;
         }
      } else {
         this.runAway();
         return false;
      }
   }

   @Override
   public String toString() {
      return "Pet [name=" + name + ", isHungry=" + isHungry + ", isTired=" + isTired + ", isSleeping=" + isSleeping
            + ", moodToPlay=" + moodToPlay + "]";
   }

}
