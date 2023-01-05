import java.util.ArrayList;

public class GeoTree {
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

}