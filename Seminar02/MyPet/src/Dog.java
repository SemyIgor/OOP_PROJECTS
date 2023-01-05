public class Dog extends Pet {
   // public String name;
   // public boolean isHungry;
   // public boolean isTired;
   // public boolean isSleeping;
   // public boolean moodToPlay;
   // public Human human;

   public Dog(String name, boolean isHungry, boolean isTired, boolean isSleeping) {
      super.name = name;
      super.isHungry = isHungry;
      super.isTired = isTired;
      super.isSleeping = isSleeping;
      if (super.isHungry == false && super.isTired == false && super.isSleeping == false) {
         super.moodToPlay = true;
      } else {
         super.moodToPlay = false;
      }
   }
}
