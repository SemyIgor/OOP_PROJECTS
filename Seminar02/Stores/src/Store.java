import java.util.List;

public abstract class Store {
   private String nameOfDirector;
   private List<String> address; // В итоге ему не нашлось применение. На перспективу оставим

   public Store(String nameOfDirector) {
      this.nameOfDirector = nameOfDirector;
   }

   // public Store() {
   // }

   public String getNameOfDirector() {
      return nameOfDirector;
   }

   public void setNameOfDirector(String nameOfDirector) {
      this.nameOfDirector = nameOfDirector;
   }

   public List<String> getAddress() {
      return address;
   }

   // Абстрактный метод, реализация которого будет за наследниками. Поскольку метод
   // абстрактный, то его можно не описывать - поэтому фигурные скобки не нужны.
   // Более того, если их поставить, то будет "ругаться", что в абстрактном методе
   // "тело" не должно быть определено
   abstract void setSlogan();

}
