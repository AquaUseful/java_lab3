package lab3_1;

public class PuppetTheatre extends Theatre {
    private String mainDoll;
    private int dollCount;

    {
        typeName = "кукольный";
    }

    public PuppetTheatre() {
        super();
    }

    public PuppetTheatre(String name, int rating, String artDir) {
        super(name, rating, artDir);
    }

    public PuppetTheatre(String name, int rating, String artDir, String mainDoll, int dollCount) {
        this(name, rating, artDir);
        this.setMainDoll(mainDoll);
        this.setDollCount(dollCount);
    }

    public void setMainDoll(String mainDoll) {
        this.mainDoll = mainDoll;
    }

    public String getMainDoll() {
        return this.mainDoll;
    }

    public void setDollCount(int dollCount) {
        this.dollCount = dollCount;
    }

    public int getDollCount() {
        return this.dollCount;
    }

    @Override
    public String getFancyInfo() {
        return super.getFancyInfo() +
                "Главная марионетка: " + this.getMainDoll() + "\n" +
                "Количество кукол: " + this.getDollCount() + "\n";
    }

    @Override
    public PuppetTheatreEditor getEditor() {
        var ed = new PuppetTheatreEditor();
        ed.setObject(this);
        return ed;
    }

}
