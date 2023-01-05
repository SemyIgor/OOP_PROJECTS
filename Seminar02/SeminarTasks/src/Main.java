public class Main {
   public static void main(String[] args) {
      HouseholdStore householdStore = new HouseholdStore("Иванов И. И.", 10);
      ProductStore productStore = new ProductStore("Петров П. П.");
      householdStore.welcome();
      productStore.welcome();
      householdStore.sell();
      productStore.sell();
   }
}