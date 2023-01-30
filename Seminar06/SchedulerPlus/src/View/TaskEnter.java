package View;

import java.util.Scanner;

import Model.Task;

public class TaskEnter {
   public Task taskEnter(Task task) {
      System.out.println("Вводим задачу");
      String st;
      System.out.print("\033[H\033[J");

      // Task task = new Task("", "", "", 3, LocalDate.now());

      final Scanner scan = new Scanner(System.in);
      System.out.printf("Введите автора задачи: ");
      st = scan.nextLine();
      System.out.println(st);
      task.setAuthor(st);

      System.out.printf("\nВведите заголовок задачи: ");
      st = scan.nextLine();
      System.out.println(st);
      task.setTaskHeader(st);

      System.out.printf("\nВведите текст задачи: ");
      st = scan.nextLine();
      System.out.println(st);
      task.setTaskBody(st);

      System.out.printf("\nВведите преоритет задачи (1, 2 или 3): ");
      st = scan.nextLine();
      System.out.println(st);
      task.setPriority(Integer.valueOf(st));

      System.out.printf("\nВведите дату срока завершения задачи в формате dd-MM-yyyy: ");
      st = scan.nextLine();
      System.out.println(st);
      task.setEndDate(st);

      System.out.println(task);

      // scan.close();

      return task;
   }
}
