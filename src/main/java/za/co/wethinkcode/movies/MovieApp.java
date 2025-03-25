package za.co.wethinkcode.movies;

import java.time.Duration;
import java.time.LocalDate;

public class MovieApp {
    public static void main(String[] args) {
        Person director = new Person("Sam Mendes", LocalDate.of(1965, 8, 1));

        Movie skyfall = new Movie(
                "Skyfall",
                "Bond investigates a series of targeted data leaks and co-ordinated attacks on MI6 led by Silva.",
                LocalDate.of(2012, 10, 23),
                director,
                Duration.ofMinutes(143)
        );
//        skyfall.asFormattedString();



    }
}
