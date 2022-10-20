package lab3_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public abstract class Theatre implements Comparable<Theatre> {
    /** Название типа театра */
    static String typeName;
    /** Название театра */
    private String name;
    /** Рейтинг театра */
    private int rating;
    /** Художественный руководитель */
    private String artDir;
    private static ArrayList<Theatre> allTheatres;

    static {
        typeName = null;
        allTheatres = new ArrayList<>();
    }

    public Theatre() {
        allTheatres.add(this);
    }

    public Theatre(String name, int rating, String director) {
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

    @Override
    public String toString() {
        return this.getTypeName() + " театр " + this.name + " " + this.artDir + " " + this.rating;
    }

    public int compareTo(Theatre theatre) {
        return this.name.compareTo(theatre.getName());
    }

    public static ArrayList<Theatre> getTheatres() {
        return allTheatres;
    }

    public static void sortAll() {
        Collections.sort(allTheatres, (Theatre th1, Theatre th2) -> th2.getName().compareTo(th1.getName()));
    }

    public static Theatre getWithHighestRating() {
        return Collections.max(allTheatres, (Theatre th1, Theatre th2) -> th1.getRating() - th2.getRating());
    }

    public static Theatre findByArtDirector(String artDir) {
        for (var th : allTheatres) {
            if (th.getArtDirector() == artDir) {
                return th;
            }
        }
        return null;
    }

    public static Theatre getWithName(String name) {
        for (var th : allTheatres) {
            if (th.getName() == name) {
                return th;
            }
        }
        return null;
    }

    public static ArrayList<Theatre> getWithRatingHigherThan(String name) {
        var withName = getWithName(name);
        if (withName == null) {
            return null;
        }
        ArrayList<Theatre> result = new ArrayList<>();
        for (var th : allTheatres) {
            if (th.getRating() > withName.getRating()) {
                result.add(th);
            }
        }
        return result;
    }

    public String getFancyInfo() {
        return "Информация о театре '" + this.name + "' (" + this.getTypeName() + ")\n" +
                "Рейтинг: " + this.rating + "\n" +
                "Худ. руководитель: " + this.artDir + "\n";

    }

}