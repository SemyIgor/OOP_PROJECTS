package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

   @Override
   public String toString() {
      return "[id=" + id + ", автор=" + author + ", Заголовок=" + taskHeader + ", Задача=" + taskBody
            + ", Приоритет=" + priority + ", Дата ввода=" + startDate + ", Срок завершения=" + endDate + "]\n";
   }

}
