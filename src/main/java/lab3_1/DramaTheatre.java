package lab3_1;

public class DramaTheatre extends Theatre {
    private int stateAwardsCount;
    private String mainPrize;

    static {
        typeName = "драматический";
    }

    public DramaTheatre() {
        super();
    }

    public DramaTheatre(String name, int rating, String artDir) {
        super(name, rating, artDir);
    }

    public DramaTheatre(String name, int rating, String artDir, String mainPrize, int awardsCount) {
        this(name, rating, artDir);
        this.setMainPrize(mainPrize);
        this.setAwardsCount(awardsCount);
    }

    public void setMainPrize(String mainPrize) {
        this.mainPrize = mainPrize;
    }

    public String getMainPrize() {
        return this.mainPrize;
    }

    public void setAwardsCount(int stateAwardsCount) {
        this.stateAwardsCount = stateAwardsCount;
    }

    public int getAwardsCount() {
        return this.stateAwardsCount;
    }
}
