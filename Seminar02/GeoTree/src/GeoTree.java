import java.util.ArrayList;

public class GeoTree {
   private ArrayList<Node> tree = new ArrayList<>();

   public ArrayList<Node> getTree() {
      return tree;
   }

   public void appendSpouse(Person husband, Person wife) {
      tree.add(new Node(husband, Relationship.husband, wife));
      tree.add(new Node(wife, Relationship.wife, husband));
   }

   public void appendChild(Person parent, Person child) {
      tree.add(new Node(parent, Relationship.parent, child));
      tree.add(new Node(child, Relationship.child, parent));
   }

   public void appendSibling(Person brother, Person sister) {
      tree.add(new Node(brother, Relationship.brother, sister));
      tree.add(new Node(sister, Relationship.sister, brother));
   }

   public void appendBroBrother(Person brother1, Person brother2) {
      tree.add(new Node(brother1, Relationship.brother, brother2));
      tree.add(new Node(brother2, Relationship.brother, brother1));
   }

   public void appendSisSister(Person sister1, Person sister2) {
      tree.add(new Node(sister1, Relationship.sister, sister2));
      tree.add(new Node(sister2, Relationship.sister, sister1));
   }

   public void appendCousin(Person cousin1, Person cousin2) {
      tree.add(new Node(cousin1, Relationship.cousin, cousin2));
      tree.add(new Node(cousin2, Relationship.cousin, cousin1));
   }

}