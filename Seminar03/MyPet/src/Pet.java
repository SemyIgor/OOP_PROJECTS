public abstract class Pet {
   private String name;
   private boolean isHungry;
   private boolean moodToPlay;
   private Human human;
   private int weight;
   private int age;

   public Pet(String name, boolean isHungry, boolean moodToPlay, Human human, int weight, int age) {
      this.name = name;
      this.isHungry = isHungry;
      this.moodToPlay = moodToPlay;
      this.human = human;
      this.weight = weight;
      this.age = age;
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

   public int getWeight() {
      return weight;
   }

   public void setWeight(int weight) {
      this.weight = weight;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   abstract boolean petCanPlay(Human human);

   @Override
   public String toString() {
      return "Pet [name=" + name + ", isHungry=" + isHungry + ", moodToPlay=" + moodToPlay + ", human=" + human + "]";
   }

}
