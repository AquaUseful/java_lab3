package lab3_1;

public class TheatreRating {
    /** Коэффициент зависимости цены от рейтинга */
    static final double costCoef;
    /** Ограничения на значения рейтинга */
    static final int[] ratingLimits = { 0, 100 };

    /** Значение рейтинга */
    private int value;

    static {
        costCoef = 0.015;
    }

    public TheatreRating() {
        this.value = 0;
    }

    public TheatreRating(int value) throws BadRating {
        this.setValue(value);
    }

    public void setValue(int value) throws BadRating {
        if ((value < ratingLimits[0]) || (value > ratingLimits[1])) {
            throw new BadRating(value);
        }
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public double getCostMultiplier() {
        return this.value * costCoef;
    }

}
