public class Foo {
   public Integer value;
   public static Integer count;

   // Статический инициализатор
   static {
      count = 0;
   }

   // Конструктор (при каждом вызове конструктора, count увеличивается на 1)
   public Foo() {
      count++;
   }

   public void printCount() {
      System.out.println(count);
   }

   @Override
   public String toString() {
      // return "" + value; // "" используется для преобразования при печати Integer
      // value в строку
      return value.toString(); // Второй вариант. Оба рабочие
   }

}
