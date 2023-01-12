
import java.time.LocalDate;

public class Task {
   private int id;
   private String author;
   private String taskHeader;
   private String taskBody;
   private int priority; // low, middle, immidietly
   private LocalDate startDate;
   private LocalDate deadDate;
   static int count = 0;

   public Task(String author, String taskHeader, String taskBody, int priority, LocalDate deadDate) {
      this.author = author;
      this.id = count++;
      this.taskHeader = taskHeader;
      this.taskBody = taskBody;
      this.priority = priority;
      this.startDate = LocalDate.now();
      this.deadDate = deadDate;
   }

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

   public LocalDate getDeadDate() {
      return deadDate;
   }

   public void setDeadDate(LocalDate deadDate) {
      this.deadDate = deadDate;
   }

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public LocalDate getStartDate() {
      return startDate;
   }

   public void taskEnter() {
      System.out.println("Введите задачу");
   }

   @Override
   public String toString() {
      return "[id=" + id + ", автор=" + author + ", Заголовок=" + taskHeader + ", Задача=" + taskBody
            + ", Приоритет=" + priority + ", Дата ввода=" + startDate + ", Срок завершения=" + deadDate + "]\n";
   }

}
