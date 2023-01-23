package Base;

import Healers.Healer;
import Warriors.Warrior;

public class God extends Hero implements Healer, Warrior {

   @Override
   public void attack(Hero target) {

   }

   @Override
   public void healing(Hero target) {

   }

   @Override
   public String toString() {
      return "God []";
   }

}