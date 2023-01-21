public class Program {
   public static void main(String[] args) {
      Point2D a = new Point2D(4, 0);
      System.out.println(a.toString()); // x = 4, y = 0
      Point2D b = new Point2D(0);
      System.out.println(b.toString()); // x = 0, y = 0

      /**
       * 4.0 Вызываем метод на имени класса, а не на экземпляре, т.к. метод static
       */
      System.out.println(Point2D.distance(a, b));
   }
}
