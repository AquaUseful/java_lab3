package lab3_1;

public class EmptyAttribute extends TheatreException {
    private String attrName;

    public EmptyAttribute(String attrName) {
        super("Пустой атрибут: " + attrName);
        this.attrName = attrName;
    }

    public String getAttrName() {
        return this.attrName;
    }
}
