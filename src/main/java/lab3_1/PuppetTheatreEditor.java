package lab3_1;

public class PuppetTheatreEditor extends TheatreEditor {
    @Override
    protected void initializeFields() {
        super.initializeFields();
        this.addField(new StringField("главная кукла"));
        this.addField(new ConstrainedIntegerField("число кукол (1 - 666)", 0, 666));
    }

    @Override
    protected void updateObject() {
        if (this.obj == null) {
            this.obj = new DramaTheatre();
        }
        super.updateObject();
        ((PuppetTheatre) this.obj).setMainDoll((String) this.fields.get(3).getValue());
        ((PuppetTheatre) this.obj).setDollCount((int) this.fields.get(4).getValue());
    }

    @Override
    protected void loadObjectFields() {
        super.loadObjectFields();
        this.fields.get(3).setValue(((PuppetTheatre) this.obj).getMainDoll());
        this.fields.get(4).setValue(((PuppetTheatre) this.obj).getDollCount());
    }

}
