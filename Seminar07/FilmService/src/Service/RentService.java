package Service;

import java.util.ArrayList;
import java.util.Queue;

import Models.UserRequest;

public class RentService implements IRentService {

   public static ArrayList<UserRequest> requests;

   public RentService() {
      requests = new ArrayList<>();
   }

   @Override
   public void processRequest(UserRequest request) {
      requests.add(request);
   }

   @Override
   public void returnMovie(UserRequest request) {
      var user = request.getUser();
      var films = user.getFilms() - 1;
      user.setFilms((byte) films);
   }

}
