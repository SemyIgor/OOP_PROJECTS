package Seminar01;

public class Animal { // extends Object - наследуется от класса Object
   private String phylum;
   private int age;

   /*
    * это конструктор по умолчанию. Он вызывается в случае, если конструктор в
    * классе не описан. Здесь его можно не отображать, создастся автоматически.
    * Но, если мы попробуем создать этот объект (в модуле Main.java, например)
    * без параметров при наличии здесь конструктора с параметрами,
    * то будет ошибка и конструктор по умолчанию не сработает. В таком случае его
    * следует прописать здесь явно:
    */
   // public Animal() {
   // }

   // Это созданный конструктор с двумя параметрами
   public Animal(String phylum, int age) {
      // Здесь левый phylum относится к классу, а правый phylum - это передаваемый
      // параметр (конструктор, по сути, есть метод и может получать параметры)
      // Переданы два параметра и присвоены очередному создаваемому объекту
      this.phylum = phylum;
      this.age = age;
      // В конструкторе можно создавать переменные, не передаваемые в параметрах:
      // ArrayList<Integer> list = new ArrayList<>();
      // Можно присваивать им значение. Но такие действия не оправданы и неуклюжи
      // list.add(getAge());
   }

   public Animal() {
   }

   // Это созданный конструктор с одним параметром
   public Animal(String phylum) {
      // Здесь всем создаваемым объектам - животым будет присваиваться возраст 0
      this.phylum = phylum;
      setAge(0);
   }

   // Геттеры и сеттеры
   public String getPhylum() {
      return phylum;
   }

   public void setPhylum(String phylum) {
      this.phylum = phylum;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public String toString() {
      return "Animal [phylum=" + phylum + ", age=" + age + "]";
   }

}

/*
 * Абстракция
 * Инкапсуляция
 * Наследование
 */