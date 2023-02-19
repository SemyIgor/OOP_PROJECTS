package Models;

public class User {
   private String name;
   private Role role; // Админ или Пользователь
   private int balance; // денег на балансе
   private byte films; // количество фильмов

   public User(String name, Role role, int balance, byte films) {
      this.name = name;
      this.role = role;
      this.balance = balance;
      this.films = films;
   }

   public Role getRole() {
      return role;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public byte getFilms() {
      return films;
   }

   public void setFilms(byte films) {
      this.films = films;
   }

   public int getBalance() {
      return balance;
   }

   public void setBalance(int balance) {
      this.balance = balance;
   }

}
