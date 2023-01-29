package Control;

import java.util.logging.*;
import java.util.logging.Logger;

import Main.Main;
import MVC.Model;

public class Controller {
   Logger logger = Logger.getLogger(Main.class.getName());

   public void start() {
      System.out.println("\nКонтроллер запущен!");
      System.out.println("--------------");
      logger.log(Level.INFO, "Запущен контроллер");

      new Model().printTestLine();

   }
}
