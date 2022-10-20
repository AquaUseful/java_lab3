package lab3_1;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Theatre {
    private static final int[] ratingLimits = { 0, 100 };
    /** Название типа театра */
    static String typeName;
    /** Название театра */
    private String name;
    /** Рейтинг театра */
    private int rating;
    /** Художественный руководитель */
    private String artDir;
    private static LinkedList<Theatre> allTheatres;

    static {
        typeName = null;
    }

    public Theatre() {
        allTheatres.add(this);
    }

    public Theatre(String name, int rating, String director) throws EmptyAttribute, BadRating {
        this();
        this.setName(name);
        this.rating = rating;
        this.setArtDirector(director);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setArtDirector(String artDir) {
        this.artDir = artDir;
    }

    public String getName() {
        return this.name;
    }

    public int getRating() {
        return this.rating;
    }

    public String getArtDirector() {
        return this.artDir;
    }

    public String getTypeName() {
        return typeName;
    }
}