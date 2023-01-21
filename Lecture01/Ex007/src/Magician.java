public class Magician extends BaseHero {

   private int mana;
   private int maxMana;

   public Magician() {
      super(String.format("Hero_Magician #%d", ++Magician.number),
            Magician.r.nextInt(100, 200));
      this.maxMana = Magician.r.nextInt(100, 150);
      this.mana = maxMana;
   }

   public String getInfo() {
      return String.format("%s  Mana: %d", super.getInfo(), this.mana);
   }

   public int energyLost() {
      int energyLost = (int) (0.7 * BaseHero.r.nextInt(20, 30));
      if ((this.mana - energyLost) > 0) {
         this.mana -= energyLost;
         return 1;
      } else {
         return -1;
      }
   }

   @Override
   public String toString() {
      return getInfo();
   }

}