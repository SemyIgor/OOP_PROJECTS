package Service;

import Models.UserRequest;

public interface IRentService {
   void processRequest(UserRequest request);

   void returnMovie(UserRequest request);
}
