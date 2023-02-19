package Controller;

import Filmpack.Film;
import Filmpack.FilmBase;
import Rentpack.RentFilm;
import Personpack.Person;
import Personpack.PersonBase;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
   public Controller() {
   }

   public void start() throws IOException {
      Person admin;
      ArrayList<Film> fb;
      ArrayList<Person> pb;
      ArrayList<RentFilm> rf;
      FilmBase filmbase = new FilmBase();
      PersonBase personbase = new PersonBase();
      RentFilm rentFilm = new RentFilm();
      fb = filmbase.inputFile("filmsbase");
      // pb = personbase.inputFile("База людей");
      pb = personbase.inputFile("personbase");
      // rf = rentFilm.inputFile("База записей", pb);
      rf = rentFilm.inputFile("scriptsbase", pb);
      admin = personbase.Worker(pb);
      if (admin != null) {

         int a;
         System.out.println("""
               Выберите вариант:
               1 - Дополнить базу фильмов
               2 - Дополнить базу людей
               3 - Дополнить базу записей об аренде фильмов""");
         Scanner input = new Scanner(System.in);
         a = input.nextInt();
         if (a == 1) {
            filmbase.fillRecord(fb);
            filmbase.outputToTxtFile("filmsbase", filmbase.getrecordfilms());
         }
         if (a == 2) {
            personbase.fillRecord(pb);
            personbase.outputToTxtFile("personbase", personbase.getRecordpersons());
         }
         if (a == 3) {
            rentFilm.fillRecord(rf, pb, fb, admin);
            rentFilm.outputToTxtFile("scriptsbase", rentFilm.getRentFilmArrayList());
         }

      }
   }
}