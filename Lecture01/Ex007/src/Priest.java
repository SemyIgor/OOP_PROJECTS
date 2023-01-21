public class Priest extends BaseHero {

   private int elixir;
   private int maxElixir;

   public Priest() {
      super(String.format("Hero_Priest #%d", ++Magician.number),
            Magician.r.nextInt(100, 200));
      this.maxElixir = Magician.r.nextInt(100, 150);
      this.elixir = maxElixir;
   }

   public String getInfo() {
      return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
   }

   public int energyLost() {
      int energyLost = (int) (0.7 * BaseHero.r.nextInt(20, 30));
      if ((this.elixir - energyLost) > 0) {
         this.elixir -= energyLost;
         return 1;
      } else {
         return -1;
      }
   }
}
