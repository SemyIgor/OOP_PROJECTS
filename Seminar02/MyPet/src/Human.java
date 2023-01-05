public class Human {
   private boolean hasMeal;
   private boolean hasToy;
   private Pet pet;

   public Human(boolean hasMeal, boolean hasToy) {
      this.hasMeal = hasMeal;
      this.hasToy = hasToy;
   }

   public boolean isHasMeal() {
      return hasMeal;
   }

   public void setHasMeal(boolean hasMeal) {
      this.hasMeal = hasMeal;
   }

   public boolean isHasToy() {
      return hasToy;
   }

   public void setHasToy(boolean hasToy) {
      this.hasToy = hasToy;
   }

   public Pet getPet() {
      return pet;
   }

   public void setPet(Pet pet) {
      this.pet = pet;
   }

   public void feedPet() {
      if (this.isHasMeal()) {
         this.getPet().setHungry(false);
         this.hasMeal = false;
         System.out.println("Бобик наелся");
      } else {
         this.getPet().growl();
      }
   }

   public void playWithPet(Pet pet) {
      if (pet.petCanPlay(this)) {
         System.out.println("Бобик играет");
      } else {
         System.out.println("Бобик не хочет играть");
      }
   }

   @Override
   public String toString() {
      return "Human [hasMeal=" + hasMeal + ", hasToy=" + hasToy + "]";
   }

}
