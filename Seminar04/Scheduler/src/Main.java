
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
      public static void main(String[] args) {

            // Task task01 = new Task("Иванов И.И.", "Покрасить забор", "Покрасить забор
            // зелёной краской", 1,
            // LocalDate.of(2023, 02, 22));

            // Task task02 = new Task("Петров В.И.", "Покрасить ворота", "Покрасить ворота
            // красной краской", 2,
            // LocalDate.of(2023, 02, 25));

            Set<Task> schadule = new HashSet<>();

            // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

            // schadule.add(task01);
            // schadule.add(task02);

            // System.out.println(schadule);

            String str;
            System.out.print("\033[H\033[J");
            Scanner scanner = new Scanner(System.in);
            do {

                  System.out.printf("Введите 1 для ввода задачи: ");
                  System.out.printf("\nВведите 2 для вывода задачи в консоль");
                  System.out.printf("\nВведите 3 для загрузки списка задач из файла");
                  System.out.printf("\nВведите 4 для сохранения списка задач в файл");
                  System.out.printf("\nДля отмены операции введите Q или q\n");
                  str = scanner.nextLine();

                  if (str.equals("1")) {
                        Task currentTask = new Task("", "", "", 0, LocalDate.now());
                        schadule.add(currentTask.taskEnter(currentTask));
                  } else if (str.equals("2")) {
                        System.out.println(schadule);
                  } else if (str.equals("3")) {
                        System.out.println("Загрузить список задач из файла");
                  } else if (str.equals("4")) {
                        System.out.println("Сохранить список задач в файл TXT");
                        saveToTXTFile(schadule);
                  } else if (str.equals("Q") || str.equals("q")) {
                        System.out.println("Выход");
                        scanner.close();
                  } else {
                        scanner.close();
                        str = "q";
                  }

            } while (!str.equals("q") && !str.equals("Q"));
      }

      static void saveToTXTFile(Set<Task> tasks) {
            try (FileWriter fw = new FileWriter("file.txt", true)) {
                  for (Task task : tasks) {
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
