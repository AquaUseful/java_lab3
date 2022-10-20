package lab3_1;

public class DramaTheatre extends Theatre {
    static {
        typeName = "драматический";
    }

    public DramaTheatre() {
        super();
    }

    public DramaTheatre(String name, int rating, String director) throws EmptyAttribute, BadRating {
        super(name, rating, director);
    };

}
