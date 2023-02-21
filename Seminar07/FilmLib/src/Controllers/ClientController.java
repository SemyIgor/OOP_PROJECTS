package Controllers;

import Models.User;
import Models.UserRequest;
import Service.IFilmService;
import Service.IRentService;
import View.UserView;

public class ClientController {

   private User user;
   private IRentService rentService;
   // private IFilmService filmService;
   private UserView userView;

   public ClientController(User user, IRentService rentService) {
      this.user = user;
      this.rentService = rentService;
      userView = new UserView();
   }

   public void run(int choice) {
      if (choice == 1) {
         submitRequest();
      }
      if (choice == 2) {
         returnMovie();
      }

   };

   void submitRequest() {
      var movieName = userView.showSubmitMenu();
      rentService.processRequest(createRequest(movieName));
   }

   void returnMovie() {
      var movieName = userView.showReturnMenu();
      rentService.returnMovie(createRequest(movieName));

   }

   private UserRequest createRequest(String movieName) {
      UserRequest req = new UserRequest();
      req.setMovieName(movieName);
      req.setUser(user);
      return req;
   }
}
