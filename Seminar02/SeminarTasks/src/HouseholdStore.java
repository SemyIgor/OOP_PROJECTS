public class HouseholdStore extends Store implements Seller {
   // Поле просто для примера. Смысла не несет
   private int count = 0;

   public HouseholdStore(String nameOfDirector, int count) {
      super(nameOfDirector);
      this.count = count;
   }

   @Override
   void setSlogan() {
      System.out.println("Лучшие бытовые товары в вашем районе");
   }

   @Override
   public void welcome() {
      System.out.println("Добро пожаловать в магазин бытовых товаров");
   }
}