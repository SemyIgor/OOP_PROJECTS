package MVC;

import java.util.logging.*;
import java.util.logging.Logger;

import Main.Main;
import Operations.Sum;
import Operations.Sub;
import Operations.Mul;
import Operations.Div;

public class Model {

   Logger logger = Logger.getLogger(Main.class.getName());

   public Model() {
   }

   public void printTestLine() {
      View ui = new View();
      StringBuilder sb = new StringBuilder()
            .append("\nДействия с рациональными / комплексными числами\n")
            .append("(Enter без ввода числа = 0)\n")
            .append("1 - сложение\n")
            .append("2 - вычитание\n")
            .append("3 - умножение\n")
            .append("4 - деление\n")
            .append("Q или q - выход\n");

      System.out.print(sb);
      while (true) {
         switch (ui.getNumber("")) {
            case "1":
               logger.log(Level.INFO, "Приступили к операции сложения");
               System.out.println(new Sum(ui.getComplexNumber("\nВведите первое число: "),
                     ui.getComplexNumber("\nВведите второе число: ")).op());
               logger.log(Level.INFO, "Выполнена операция сложения");
               break;
            case "2":
               logger.log(Level.INFO, "Приступили к операции вычитания");
               System.out.println(new Sub(ui.getComplexNumber("\nВведите первое число: "),
                     ui.getComplexNumber("\nВведите второе число: ")).op());
               logger.log(Level.INFO, "Выполнена операция вычитания");
               break;
            case "3":
               logger.log(Level.INFO, "Приступили к операции умножения");
               System.out.println(new Mul(ui.getComplexNumber("\nВведите первое число: "),
                     ui.getComplexNumber("\nВведите второе число: ")).op());
               logger.log(Level.INFO, "Выполнена операция умножения");
               break;
            case "4":
               logger.log(Level.INFO, "Приступили к операции деления");
               System.out.println(new Div(ui.getComplexNumber("\nВведите первое число: "),
                     ui.getComplexNumber("\nВведите второе число: ")).op());
               logger.log(Level.INFO, "Выполнена операция деления");
               break;
            case "q":
               return;
            default:
               return;
         }
      }
   }

}
