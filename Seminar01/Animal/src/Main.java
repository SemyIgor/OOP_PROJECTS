public class Main {
    public static void main(String[] args) {
        /*
         * Вызываем конструктор класса Animal. Если в классе Animal конструктор не
         * описан,
         * то вызывается конструктор по умолчанию
         */
        Animal animal = new Animal();
        animal.getPhylum();
        animal.setPhylum("Млекопитающее");
        System.out.println(animal.getPhylum()); // Млекопитающее

        Animal cat01 = new Animal("Mammal");
        System.out.println(cat01); // Animal [phylum=Mammal, age=0]

        Animal cat02 = new Animal("Mammal", 3);
        System.out.println(cat02); // Animal [phylum=Mammal, age=3]

        Dog dog = new Dog("Mammal", 2, "Bobik");
        System.out.println(dog); // Dog [name=Bobik, age=2, phylum=Mammal]
        // НЕПОНЯТНО, где и как переопределить toString(), чтобы печатались все три
        // параметра (phylum, age, name) ???

        Dog dog1 = new Dog("New Mammal", 1);
        dog1.setName("Барбос");
        System.out.println(dog1); // Dog [name=Барбос, age=1, phylum=New Mammal]

        Animal dogger = new Dog("Mammal", 5, "Rex");
        // Компилятор до выполнения программы "не видит" правую часть, где new Dog
        // Для него не получится вставить строку dogger.getName(), так как у Animal
        // нет переменной name. При выполнении программы срабатывает так называемый
        // МЕХАНИЗМ ПОЗДНЕГО СВЯЗЫВАНИЯ", когда при выполнении строки dogger.voice()
        // метод voice() будет взят не из Animal, а из Dog (ПОЛИМОРФИЗМ)
        System.out.println(dogger); // Dog [name=Rex, age=5, phylum=Mammal]

        dog.voice(); // Dog Bobik says: Гав-гав-гав
        dog1.voice(); // Dog Барбос says: Гав-гав-гав
        cat02.voice(); // Animal Mammal says: У-у-у
        dogger.voice(); // Dog Rex says: Гав-гав-гав
    }

}

/*
 * Абстракция
 * Инкапсуляция
 * Наследование
 * Полиморфизм
 */
