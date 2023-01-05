public abstract class Pet {
   public String name;
   public boolean isHungry;
   public boolean isTired;
   public boolean isSleeping;
   public boolean moodToPlay;
   public Human human;

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
