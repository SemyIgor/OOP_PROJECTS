public class ProductStore extends Store implements Seller {
   public ProductStore(String nameOfDirector) {
      super(nameOfDirector); // Использование конструктора родителя?
   }

   @Override
   void setSlogan() {
      System.out.println("Самый сок");
   }

   @Override
   public void welcome() {
      System.out.println("Добро пожаловать в продуктовый магазин!");
   }
}
