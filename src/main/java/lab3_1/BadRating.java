package lab3_1;

public class BadRating extends TheatreException {
    private int ratingValue;

    public BadRating(int ratingValue) {
        super("Недопустимое значение рейтинга (" + ratingValue + ")");
        this.ratingValue = ratingValue;
    }

    public int getRatingValue() {
        return this.ratingValue;
    }
}
