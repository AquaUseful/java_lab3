package lab3_1;

public class DramaTheatre extends Theatre {
    static {
        typeName = "драматический";
    }

    public DramaTheatre() {
        super();
    }

    public DramaTheatre(String name, TheatreRating rating, ArtDirector director) throws EmptyAttribute {
        super(name, rating, director);
    }

    public DramaTheatre(String name, int rating, ArtDirector director) throws EmptyAttribute, BadRating {
        super(name, rating, director);
    };

}
