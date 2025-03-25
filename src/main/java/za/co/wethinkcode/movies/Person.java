package za.co.wethinkcode.movies;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final LocalDate birthDate;

    public Person(String name, LocalDate birthDate) {
        if (name == null) throw new NullPointerException("Name may not be null");
        if (name.isEmpty()) throw new IllegalArgumentException("Name may not be empty");
        if (birthDate != null && birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date must be in the past or null");
        }

        this.name = name;
        this.birthDate = birthDate;
    }

    public Person(String name) {
        this(name, null);
    }

    public String name() {
        return name;
    }

    public LocalDate birthDate() {
        return birthDate;
    }
}
