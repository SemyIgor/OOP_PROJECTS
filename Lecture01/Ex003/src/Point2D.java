/**
 * Это точка 2D
 */
public class Point2D {
   private int x;
   private int y;

   /**
    * Это конструктор точки 2D
    * 
    * @param valueX Это координата X
    * @param valueY Это координата Y
    */
   public Point2D(int valueX, int valueY) {
      x = valueX;
      y = valueY;
   }

   public Point2D(int value) {
      this(value, value);
   }

   public Point2D() {
      this(0);
   }

   public int getX() {
      return x;
   }

   public void setX(int value) {
      this.x = value;
   }

   public int getY() {
      return y;
   }

   public void setY(int value) {
      this.y = value;
   }

   public String getInfo() {
      return String.format("x = %d, y = %d", getX(), getY());
   }

   @Override
   public String toString() {
      return getInfo();
   }

   public static String distance(Point2D a, Point2D b) {

      // return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
      double dis = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
      return String.format("Расстояние от A до B равно %.1f", dis);

   }

}
