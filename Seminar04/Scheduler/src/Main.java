
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
   public static void main(String[] args) {

      Task task01 = new Task("Иванов И.И.", "Покрасить забор", "Покрасить забор зелёной краской", 1,
            LocalDate.of(2023, 02, 12));

      Task task02 = new Task("Петров В.И.", "Покрасить ворота", "Покрасить ворота красной краской", 1,
            LocalDate.of(2023, 02, 10));

      Set<Task> schadule = new HashSet<>();

      schadule.add(task01);
      schadule.add(task02);
      System.out.println(schadule);

      String str;
      // System.out.print("\033[H\033[J");
      do {

         System.out.printf("Введите 1 для ввода задачи: ");
         System.out.printf("\nВведите 2 для вывода задачи в консоль");
         System.out.printf("\nВведите 3 для загрузки списка задач из файла");
         System.out.printf("\nВведите 4 для сохранения списка задач в файл");
         System.out.printf("\nДля отмены операции введите Q или q\n");
         Scanner scanner = new Scanner(System.in);
         str = scanner.nextLine();
         // scanner.close();

         if (str.equals("1")) {
            Task currentTask = new Task("", "", "", 0, LocalDate.now());
            currentTask.setAuthor("Петрович");
            System.out.println(currentTask.getAuthor());
            // currentTask.taskEnter();
         } else if (str.equals("2")) {
            System.out.println("Вывести список задач в консоль");
         } else if (str.equals("3")) {
            System.out.println("Загрузить список задач из файла");
         } else if (str.equals("4")) {
            System.out.println("Сохранить список задач в файл CSV");
         } else if (str.equals("Q") || str.equals("q")) {
            System.out.println("Выход");
            scanner.close();
         } else {
            scanner.close();
            str = "q";
         }

      } while (!str.equals("q") && !str.equals("Q"));
   }
}
