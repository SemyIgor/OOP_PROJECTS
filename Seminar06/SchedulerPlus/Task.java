package Model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
   private final int id;
   private final String author;
   private final String taskHeader;
   private final String taskBody;
   private final int priority; // low, middle, immidietly
   private final LocalDate startDate;
   private final LocalDate endDate;
   static int count = 1;

   // public Task(String author, String taskHeader, String taskBody, int priority,
   // LocalDate endDate) {
   // this.author = author;
   // this.id = count++;
   // this.taskHeader = taskHeader;
   // this.taskBody = taskBody;
   // this.priority = priority;
   // this.startDate = LocalDate.now();
   // this.endDate = endDate;
   // }

   public Task(TaskBuilder taskBuilder) {
      this.id = taskBuilder.id;
      this.author = taskBuilder.author;
      this.taskHeader = taskBuilder.taskHeader;
      this.taskBody = taskBuilder.taskBody;
      this.priority = taskBuilder.priority;
      this.startDate = LocalDate.now();
      this.endDate = taskBuilder.endDate;

   }

   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

   // gets ====================================================
   public int getId() {
      return id;
   }

   public int getPriority() {
      return priority;
   }

   public String getTaskHeader() {
      return taskHeader;
   }

   public String getTaskBody() {
      return taskBody;
   }

   public String getEndDate() {
      return String.valueOf(endDate.getDayOfMonth()) + "-" + String.valueOf(
            endDate.getMonth()) + "-"
            + String.valueOf(endDate.getYear());
   }

   public String getAuthor() {
      return author;
   }

   public String getStartDate() {
      return String.valueOf(startDate.getDayOfMonth()) + "-" + String.valueOf(startDate.getMonth()) + "-"
            + String.valueOf(startDate.getYear());
   }

   // ----------------------------------------------------------

   public static class TaskBuilder {
      private int id;
      private String author;
      private String taskHeader;
      private String taskBody;
      private int priority; // low, middle, immidietly
      // private LocalDate startDate;
      private LocalDate endDate;
      static int count = 1;

      public TaskBuilder() {

      }

      public TaskBuilder id(int id) {
         // this.id = id;
         this.id = count++;
         return this;
      }

      public TaskBuilder author(String author) {
         this.author = author;
         return this;
      }

      public TaskBuilder taskHeader(String taskHeader) {
         this.taskHeader = taskHeader;
         return this;
      }

      public TaskBuilder taskBody(String taskBody) {
         this.taskBody = taskBody;
         return this;
      }

      public TaskBuilder priority(int priority) {
         this.priority = priority;
         return this;
      }

      public TaskBuilder endDate(LocalDate endDate) {
         this.endDate = endDate;
         return this;
      }

      public Task build() {
         Task task = new Task(this);
         return task;
      }

   }

   @Override
   public String toString() {
      return "[id=" + id + ", автор=" + author + ", Заголовок=" + taskHeader + ", Задача=" + taskBody
            + ", Приоритет=" + priority + ", Дата ввода=" + startDate + ", Срок завершения=" + endDate + "]\n";
   }

}
