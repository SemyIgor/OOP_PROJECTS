package MVC;

import java.util.Scanner;

import Classes.Num;

public class View {
   Scanner in;

   public View() {
   }

   public String getNumber(String s) {
      System.out.print(s);
      in = new Scanner(System.in);
      String input = in.nextLine();
      if (input == "") {
         System.out.print("0\n");
         return "0";
      }
      return input;
   }

   public Double getDoubleNumber(String string) {
      boolean flag = false;
      while (!flag) {
         try {
            flag = true;
            return Double.parseDouble(getNumber(string));
         } catch (Exception e) {
            System.out.println("Ошибка ввода. Повторите ввод.\n");
            flag = false;
         }
      }
      return 0.;
   }

   public Num getComplexNumber(String string) {
      System.out.println(string);
      Num n = new Num();
      n.setR(getDoubleNumber("Введите действительную часть: "));
      n.setI(getDoubleNumber("Введите мнимую часть: "));
      return n;
   }

   @Override
   public String toString() {
      return "View [in=" + in + "]";
   }

}
