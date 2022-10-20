package lab3_1;

public abstract class Theatre {
    /** Название типа театра */
    static String typeName;
    /** Название театра */
    private String name;
    /** Рейтинг театра */
    private TheatreRating rating;
    /** Художественный руководитель */
    private ArtDirector artDir;

    static {
        typeName = null;
    }

    public Theatre() {
        this.name = null;
        this.rating = null;
        this.artDir = null;
    }

    public Theatre(String name, TheatreRating rating, ArtDirector director) throws EmptyAttribute {
        this.setName(name);
        this.setRating(rating);
        this.setArtDirector(director);
    }

    public Theatre(String name, int rating, ArtDirector director) throws EmptyAttribute, BadRating {
        this.setName(name);
        this.rating = new TheatreRating(rating);
        this.setArtDirector(director);
    }

    public void setName(String name) throws EmptyAttribute {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new EmptyAttribute("название");
        }
        this.name = name;
    }

    public void setRating(TheatreRating rating) throws EmptyAttribute {
        if (rating == null) {
            throw new EmptyAttribute("рейтинг");
        }
        this.rating = rating;
    }

    public void setRating(int rating) throws BadRating {
        this.rating.setValue(rating);
    }

    public void setArtDirector(ArtDirector artDir) throws EmptyAttribute {
        if (artDir == null) {
            throw new EmptyAttribute("худ. директор");
        }
        this.artDir = artDir;
    }

    public String getName() {
        return this.name;
    }

    public TheatreRating getRating() {
        return this.rating;
    }

    public ArtDirector getArtDirector() {
        return this.artDir;
    }

    public String getTypeName() {
        return typeName;
    }
}