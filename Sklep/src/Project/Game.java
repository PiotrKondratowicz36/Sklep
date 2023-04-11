package Project;

import java.io.*;

public class Game implements Serializable {
    String title;
    String genre;
    String year;
    String developer;
    String publisher;
    String consoleExclusive;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getConsoleExclusive() {
        return consoleExclusive;
    }

    public void setConsoleExclusive(String consoleExclusive) {
        this.consoleExclusive = consoleExclusive;
    }

    public Game (String title, String genre, String year, String developer, String publisher, String consoleExclusive) {
        super();
        setTitle(title);
        setGenre(genre);
        setYear(year);
        setDeveloper(developer);
        setPublisher(publisher);
        setConsoleExclusive(consoleExclusive);
    }
}

