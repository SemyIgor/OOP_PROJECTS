public interface Seller extends Communication {
   default void sell() {
      System.out.println("Мы продали товары");
   }
}
