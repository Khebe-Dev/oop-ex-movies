package za.co.wethinkcode.movies;

import java.time.Duration;
import java.time.LocalDate;

public class Movie {
    private final String title;
    private String synopsis;
    private LocalDate releaseDate;
    private Person director;
    private final Duration runtime;

    public Movie(String title, String synopsis, LocalDate releaseDate, Person director, Duration runtime) {
        if (title == null || title.isEmpty()) throw new IllegalArgumentException("Title cannot be null or empty");
        if (releaseDate == null) throw new IllegalArgumentException("Release date cannot be null");
        if (director == null) throw new IllegalArgumentException("Director cannot be null");
        if (runtime == null) throw new IllegalArgumentException("Runtime cannot be null");

        this.title = title;
        this.synopsis = (synopsis == null) ? "" : synopsis;
        this.releaseDate = releaseDate;
        this.director = director;
        this.runtime = runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public Person getDirector() {
        return director;
    }

    public Duration getRuntime() {
        return runtime;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = (synopsis == null) ? "" : synopsis;
    }

    public void setReleaseDate(LocalDate newReleaseDate) {
        if (newReleaseDate == null) throw new IllegalArgumentException("Release date cannot be null");
        if (newReleaseDate.isAfter(LocalDate.now())) {
            this.releaseDate = newReleaseDate;
        }
    }

    public void setDirector(Person newDirector) {
        if (newDirector == null) throw new IllegalArgumentException("Director cannot be null");
        if (this.releaseDate.isAfter(LocalDate.now())) {
            this.director = newDirector;
        }
    }

    public void asFormattedString() {
        System.out.println("Title: " + title + "\n"
                + "Synopsis: " + synopsis + "\n"
                + "Release Date: " + releaseDate + "\n"
                + "Director: " + director.name() + "\n"
                + "Runtime: " + runtime.toMinutes() + " minutes");
    }
}
