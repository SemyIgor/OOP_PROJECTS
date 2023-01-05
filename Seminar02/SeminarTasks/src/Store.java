import java.util.List;

public abstract class Store {
   private String nameOfDirector;

   public Store(String nameOfDirector) {
      this.nameOfDirector = nameOfDirector;
   }

   public String getNameOfDirector() {
      return nameOfDirector;
   }

   public void setNameOfDirector(String nameOfDirector) {
      this.nameOfDirector = nameOfDirector;
   }

   abstract void setSlogan();

}