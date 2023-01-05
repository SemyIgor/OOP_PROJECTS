public class Main {
   public static void main(String[] args) {
      HouseHoldStore houseHoldStore = new HouseHoldStore("Блюхер К.В.", 10);

      ProductStore productStore = new ProductStore("Швабенланд А.П.");

      houseHoldStore.welcome();
      houseHoldStore.sell();
      productStore.welcome();
      productStore.sell();
   }
}
