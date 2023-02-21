// Фильмотека / Прокат фильмов
// Добавлять фильмы, брать их в аренду (Продумать отслеживание количества)
// Два типа пользователей - Администратоп и пользователь
// Добавить, удалить фильм и редактировать описание. Проверяет заявки на аренду фильма.

// javac Start/*.java Controllers/*java Models/*.java Service/*.java View/*.java
// java start/main.java

package Start;

import Controllers.NetflixController;

public class Main {
   public static void main(String[] args) {
      new NetflixController().run();
   }

}
