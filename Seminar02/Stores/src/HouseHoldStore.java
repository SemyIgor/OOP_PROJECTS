public class HouseHoldStore extends Store implements Seller {

   private int count = 0; // Поле для примера, смысла не несёт!

   public HouseHoldStore(String nameOfDirector, int count) {
      super(nameOfDirector);
      this.count = count;
   }

   @Override
   void setSlogan() {
      System.out.println("Лучшие бытовые товары в вашем районе");
   }

   @Override
   public void welcome() {
      System.out.println("Добро пожаловать в магазин бытовых товаров!");
   }
}
