package Classes;

public class Num {
   private Double r;
   private Double i;

   public Num(Double r, Double i) {
      this.r = r;
      this.i = i;
   }

   public Num(Double r) {
      this(r, 0.);
   }

   public Num() {
      this(0.);
   }

   @Override
   public String toString() {
      if ((double) i < 0) {
         return String.format("(%.2f-i%.2f)", r, Math.abs((double) i));
      } else if ((double) i > 0) {
         return String.format("(%.2f+i%.2f)", r, Math.abs((double) i));
      } else {
         return String.format("(%.2f)", (double) r);
      }
   }

   public Double getR() {
      return r;
   }

   public void setR(Double r) {
      this.r = r;
   }

   public Double getI() {
      return i;
   }

   public void setI(Double i) {
      this.i = i;
   }
}
