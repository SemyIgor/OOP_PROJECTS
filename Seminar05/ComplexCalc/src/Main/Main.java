package Main;

import java.io.IOException;
import java.util.logging.*;

import Control.Controller;

public class Main {
   public static void main(String[] args) throws SecurityException, IOException {

      Logger logger = Logger.getLogger(Main.class.getName());
      FileHandler fh = new FileHandler("log.txt");
      logger.addHandler(fh);

      SimpleFormatter sFormat = new SimpleFormatter();
      fh.setFormatter(sFormat);

      logger.log(Level.INFO, "Запускаем программу");

      new Controller().start();
   }
}
