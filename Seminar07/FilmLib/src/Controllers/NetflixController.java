package Controllers;

import java.util.ArrayList;

import Models.Role;
import Models.User;
import Service.IFilmService;
import Service.IRentService;
import Service.RentService;
import View.MainView;

public class NetflixController {
   IRentService rentService;
   IFilmService filmService;
   MainView view;
   private User user;

   public NetflixController() {
      view = new MainView();
   }

   public void run() {
      String name = view.authorize();
      if (isAdmin(name)) {
         adminMenu();
      } else if (isUser(name)) {
         userMenu();
      } else {
         System.out.println("В базе нет такого пользователя");
      }
   }

   private void userMenu() {
      var num = view.showUserMenu();
      var ctrl = new UserController(user, new RentService());
      ctrl.run(num);
   }

   private void adminMenu() {
      var num = view.showAdminMenu();
      // ДОДЕЛАТЬ !!!
   }

   private boolean isAdmin(String name) {
      var list = getUsers();
      for (User user : list) {
         if (user.getName().equals(name)) {
            this.user = user;
            return user.getRole().equals(Role.admin);
         }
      }
      // System.out.println("Это не админ");
      return false;
   }

   private boolean isUser(String name) {
      var list = getUsers();
      for (User user : list) {
         if (user.getName().equals(name)) {
            this.user = user;
            return user.getRole().equals(Role.user);
         }
      }
      // System.out.println("Это не клиент");
      return false;
   }

   private ArrayList<User> getUsers() {
      ArrayList<User> list = new ArrayList<>();
      // Доработать
      list.add(new User("Admin", Role.admin, 999999, (byte) 0));
      list.add(new User("User", Role.user, 100, (byte) 0));
      return list;
   };
}
