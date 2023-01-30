package Control;

import Model.Model;

public class Controller {

   public void start() {
      System.out.println("\nКонтроллер запущен!");
      System.out.println("--------------");

      new Model().chooseTask();

   }
}