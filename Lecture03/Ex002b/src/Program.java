import java.util.Iterator;

public class Program {
   public static void main(String[] args) {
      Beverage latte = new Coffee();
      latte.addComponent(new Water("Вода"));
      latte.addComponent(new Вeans("Зёрна"));
      latte.addComponent(new Milk("Молоко"));

      Iterator<Ingredient> iterator = latte;
      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
