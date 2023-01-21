import java.util.Random;

public class BaseHero {
   protected static int number;
   protected static Random r;

   protected String name;
   protected int hp;
   protected int maxHp;

   static {
      BaseHero.number = 0;
      BaseHero.r = new Random();
   }

   public BaseHero(String name, int hp) {
      this.name = name;
      this.hp = hp;
      this.maxHp = hp;
   }

   public BaseHero() {
      this(String.format("Hero_Priest #%d", ++BaseHero.number),
            BaseHero.r.nextInt(100, 200));
   }

   public String getInfo() {
      return String.format("Name: %s\tHp: %d  Type: %s",
            this.name, this.hp, this.getClass().getSimpleName());
   }

   public void healed(int Hp) {
      this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
   }

   public void getDamage(int damage) {
      if (this.hp - damage > 0) {
         this.hp -= damage;
      } else {
         this.hp = 0;
         System.out.printf("%s умер...\n", this.getClass().getSimpleName());
      }
   }

   public int energyLost() {
      return 1;
   }

   public void attack(BaseHero target) {
      if (this.hp != 0 && target.hp != 0) {
         int damage = BaseHero.r.nextInt(20, 30);
         if (this.energyLost() > 0) {
            target.getDamage(damage);
         } else {
            System.out.printf("%s. Нет энергии!!!\n", this.getClass().getSimpleName());
         }
      } else {
         System.out.println("Бой закончен");
      }
   }

}
