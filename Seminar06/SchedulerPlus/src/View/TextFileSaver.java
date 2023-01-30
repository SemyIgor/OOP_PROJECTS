package View;

import java.io.FileWriter;
import java.util.Set;

import Model.Task;

public class TextFileSaver implements Saver {

   @Override
   public void saveToFile(Set<Task> schadule) {
      try (FileWriter fw = new FileWriter("file.txt", true)) {
         for (Task task : schadule) {
            fw.write(String.valueOf(task.getId()));
            fw.append('\n');
            fw.write(task.getAuthor());
            fw.append('\n');
            fw.write(task.getTaskHeader());
            fw.append('\n');
            fw.write(task.getTaskBody());
            fw.append('\n');
            fw.write(String.valueOf(task.getPriority()));
            fw.append('\n');
            fw.write(task.getStartDate());
            fw.append('\n');
            fw.write(task.getEndDate());
            fw.append('\n');
            fw.append(',');
            fw.append('\n');
            fw.flush();
         }
      } catch (Exception e) {
         System.out.println("Ошибка записи в файл");
      }
   }

}
