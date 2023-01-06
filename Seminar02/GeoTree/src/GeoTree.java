import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeoTree implements Savable {
   private ArrayList<Node> tree = new ArrayList<>();

   public ArrayList<Node> getTree() {
      return tree;
   }

   public void appendNode(Person first, Relationship forward, Person second, Relationship backward) {
      tree.add(new Node(first, forward, second));
      tree.add((new Node(second, backward, first)));
   }

   @Override
   public String toString() {
      return "GeoTree [" + tree + "]";
   }

   @Override
   public void saveToCSVFile(GeoTree tree) {
      try (FileWriter fw = new FileWriter("file.csv", false)) {
         for (Node node : tree.getTree()) {
            fw.write(node.p1.toString());
            fw.write(node.re.toString());
            fw.write(node.p2.toString());
            fw.flush();
         }
      } catch (IOException e) {
         System.out.println("Ошибка записи в файл");
         // TODO: handle exception
      }
   }

}