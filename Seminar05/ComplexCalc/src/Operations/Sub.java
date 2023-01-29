package Operations;

import Classes.CalcOp;
import Classes.Num;

public class Sub extends CalcOp {
   public Sub(Num z1, Num z2) {
      this.z1 = z1;
      this.z2 = z2;
   }

   public Sub() {

   }

   @Override
   public Num op() {
      return (new Num(z1.getR() - z2.getR(), z1.getI() - z2.getI()));
   }

   @Override
   public void setZ1() {

   }

   @Override
   public void setZ2() {

   }

}