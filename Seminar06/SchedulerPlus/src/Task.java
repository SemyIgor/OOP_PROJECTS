
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task {
   private int id;
   private String author;
   private String taskHeader;
   private String taskBody;
   private int priority; // low, middle, immidietly
   private LocalDate startDate;
   private LocalDate endDate;
   static int count = 1;

   public Task(String author, String taskHeader, String taskBody, int priority, LocalDate endDate) {
      this.author = author;
      this.id = count++;
      this.taskHeader = taskHeader;
      this.taskBody = taskBody;
      this.priority = priority;
      this.startDate = LocalDate.now();
      this.endDate = endDate;
   }

   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

   public int getId() {
      return id;
   }

   public int getPriority() {
      return priority;
   }

   public void setPriority(int priority) {
      this.priority = priority;
   }

   public String getTaskHeader() {
      return taskHeader;
   }

   public void setTaskHeader(String taskHeader) {
      this.taskHeader = taskHeader;
   }

   public String getTaskBody() {
      return taskBody;
   }

   public void setTaskBody(String taskBody) {
      this.taskBody = taskBody;
   }

   public String getEndDate() {
      return String.valueOf(endDate.getDayOfMonth()) + "-" + String.valueOf(
            endDate.getMonth()) + "-"
            + String.valueOf(endDate.getYear());
   }

   public void setEndDate(String end) {
      this.endDate = LocalDate.parse(end, formatter);
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getStartDate() {
      return String.valueOf(startDate.getDayOfMonth()) + "-" + String.valueOf(startDate.getMonth()) + "-"
            + String.valueOf(startDate.getYear());
   }

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

   @Override
   public String toString() {
      return "[id=" + id + ", автор=" + author + ", Заголовок=" + taskHeader + ", Задача=" + taskBody
            + ", Приоритет=" + priority + ", Дата ввода=" + startDate + ", Срок завершения=" + endDate + "]\n";
   }

}
