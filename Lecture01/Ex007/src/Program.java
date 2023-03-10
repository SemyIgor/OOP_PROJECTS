import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
   public static void main(String[] args) {

      // #region ex1 Demo

      BaseHero hero3 = new Magician();
      System.out.println(hero3.toString());
      System.out.println("--------------------");

      BaseHero hero4 = new Priest();
      System.out.println(hero4.getInfo());
      System.out.println("--------------------");

      // #endregion

      // #region ex2 attack
      System.out.println("------");

      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");
      hero3.attack(hero4);
      hero4.attack(hero3);
      System.out.println(hero3.getInfo());
      System.out.println(hero4.getInfo());
      System.out.println("------");

      // #endregion

      // #region Teams

      int teamCount = 10;
      Random rand = new Random();
      int magicianCount = 0;
      int priestCount = 0;

      List<BaseHero> teams = new ArrayList<>();
      for (int i = 0; i < teamCount; i++) {
         if (rand.nextInt(2) == 0) {
            teams.add(new Priest());
            priestCount++;
         } else {
            teams.add(new Magician());
            magicianCount++;
         }

         // System.out.println(teams.get(i).getInfo());
      }
      System.out.println();
      System.out.printf("magicalCount: %d priestCount: %d \n\n", magicianCount, priestCount);

      // attack

      // #endregion

      // todo ???????????????? ?????? ???????? ?????????? ??
      // ?????????????????????? ?????????????????????? ?????????????? ????????????
   }
}