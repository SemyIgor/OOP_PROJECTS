## Домашнее задание к Семинару №3, проект MyPet

Были внесены следующие изменения к проекту MyPet из домашнего задания к семинару №2
1. Закомментированы строки в классе Main(), описывающие взаимодействие между животными и людьми 
2. Добавлены два класса компараторов: 
   - компаратор по весу животных (PetWeightComparator);
   - компаратор по возрасту животных (PetAgeComparator).
3. В классе Main() выведены списки животных в сравнении до сортировки и после сортировки.

`
`
`

`Полезная штука`
``` java
Iterator<Pet> iterator = playGroundPets.iterator();
while (iterator.hasNext()) {
   Pet next = iterator.next();
   System.out.println(next); // If we've overrided toString() for Pet Class
   // System.out.println(next.toString()); // If we've not overrided toString() for Pet Class
}
```
