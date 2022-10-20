package lab3_1;

public class DramaTheatreEditor extends TheatreEditor {
    @Override
    protected void updateObject() {
        this.obj = new DramaTheatre((String) this.fields.get(0).getValue(),
                (int) this.fields.get(1).getValue(),
                (String) this.fields.get(2).getValue());
    }
}
