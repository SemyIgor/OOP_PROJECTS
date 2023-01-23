public class Program {
   public static void main(String[] args) {
      Foo f1 = new Foo();
      f1.value = 123;
      System.out.printf("f1.value = %s\n", f1); // f1.value = 123
      f1.printCount(); // 1
      // К статическим объектам можно и нужно обращаться по имени класса
      Foo.count = 555;
      // System.out.println(Foo.count); // 555, при этом Foo.printCount() не будет
      // работать, так как метод printCount() - это метод экземпляра, а не класса
      f1.printCount(); // 555
      f1.count = 5555; // Консоль выдаёт предупреждение, что доступ к статическому count должен
                       // осуществляться статическими методами (то есть через имя класса, как выше:
                       // Foo.count = 5555), но программа выполняет и этот неправильный вариант
      System.out.println("----------------------");

      Foo f2 = new Foo(); // При создании f2 происходит увеличение count на 1 (5555+1)
      f2.value = 222;
      System.out.printf("f2.value = %s\n", f2); // f2.value = 222
      // Если в конструкторе класса Foo не будет инкремента, то будет 5555, а не 5556
      f2.printCount(); // 5556
      System.out.println("---------------------");

      Foo f3 = new Foo();
      f3.value = 345;
      System.out.printf("f3.value = %s\n", f3); // f3.value = 345
      f3.printCount(); // 5557

   }
}
