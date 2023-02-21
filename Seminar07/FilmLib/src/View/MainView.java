package View;

import java.util.Scanner;

public class MainView {

   public void show() {
      authorize();
   }

   public int showAdminMenu() {
      System.out.println("1 - Добавить фильм");
      System.out.println("2 - Редактировать описание");
      System.out.println("3 - Удалить фильм");
      System.out.println("4 - Проверить заявки на аренду");

      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();
      // scanner.close();
      return choice;
   }

   public int showClientMenu() {
      System.out.println("1 - Подать заявку на фильм");
      System.out.println("2 - Вернуть фильм");

      Scanner scanner = new Scanner(System.in);
      int choice = scanner.nextInt();
      // scanner.close();
      return choice;
   }

   public String authorize() {
      System.out.println("Введите имя: ");
      Scanner sc = new Scanner(System.in);
      var name = sc.nextLine();
      // sc.close(); // Если закрыть этот сканер, то НЕ БУДЕТ РАБОТАТЬ сканер в
      // showAdminMenu()
      return name;
   }
}
