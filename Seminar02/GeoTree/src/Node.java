public class Node {

   public Node(Person p1, Relationship re, Person p2) {
      this.p1 = p1;
      this.re = re;
      this.p2 = p2;
      // this.re2 = re2;
   }

   Person p1;
   Relationship re;
   Person p2;
   // Relationship re2;

   @Override
   public String toString() {
      return String.format("<%s %s %s>", p1, re, p2);
   }

}