public class Program {
   static double distance(Point2D a, Point2D b) {
      return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow(a.y - b.y, 2));
   }

   public static void main(String[] args) {
      Point2D a = new Point2D();
      a.x = 0;
      a.y = 4;
      System.out.println(a.toString());

      Point2D b = new Point2D();
      b.x = 3;
      b.y = 0;
      System.out.println(b.toString());
      System.out.println(distance(a, b));
   }
}
