
// javac main.java controller/*.java filmpack/*.java personpack/*.java rentpack/*.java
// java main.java
import java.io.IOException;
import java.text.ParseException;

import Controller.Controller;

public class Main {
   public static void main(String[] args) throws IOException, ParseException {
      Controller conroller = new Controller();
      conroller.start();

   }
}