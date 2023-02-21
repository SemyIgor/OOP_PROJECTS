package Service;

import Models.Movie;

public interface IFilmService {
   public void addMovie(Movie movie);

   public Movie getMovie(Movie movie);

   public void editMovie(String movieName);

   public void deleteMovie(Movie movie);
}
