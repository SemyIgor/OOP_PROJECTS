import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
   public static void main(String[] args) {

      List<Integer> nums = new ArrayList<>();
      nums.add(1);
      nums.add(12);
      nums.add(123);
      nums.add(1234);
      nums.add(12345);

      Iterator<Integer> iter = nums.iterator();
      while (iter.hasNext()) {
         System.out.println(iter.next());
      }

      List<String> slist = new ArrayList<>();
      slist.add("Аз");
      slist.add("Буки");
      slist.add("Веди");
      slist.add("Глаголь");

      System.out.println("\n" + slist);
      Iterator<String> iterist = slist.iterator();
      while (iterist.hasNext()) {
         System.out.println(iterist.next());
      }

      Worker worker1 = new Worker("Сергей", "Николаевич", 28, 50000);
      Worker worker2 = new Worker("Василий", "Иванович", 45, 38000);

      List<Worker> worklist = new ArrayList<>();
      worklist.add(worker1);
      worklist.add(worker2);

      // System.out.println(worker1);
      // System.out.println(worker2);

      Iterator<Worker> iterNew = worklist.iterator();
      while (iterNew.hasNext()) {
         System.out.println(iterNew.next());
      }

      // Worker worker = new Worker(
      // "Имя", "Фамилия", 23, 4567);

      // Iterator<Object> components = worker.iterator();

   }
}