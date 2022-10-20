package lab3_1;

public class DramaTheatreEditor extends TheatreEditor {
    @Override
    protected void initializeFields() {
        super.initializeFields();
        this.addField(new StringField("высшая присвоенная награда"));
        this.addField(new ConstrainedIntegerField("число гос наград", 0, 1000000));
    }

    @Override
    protected void updateObject() {
        if (this.obj == null) {
            this.obj = new DramaTheatre();
        }
        super.updateObject();
        ((DramaTheatre) this.obj).setMainPrize((String) this.fields.get(3).getValue());
        ((DramaTheatre) this.obj).setAwardsCount((int) this.fields.get(4).getValue());
    }

    @Override
    protected void loadObjectFields() {
        super.loadObjectFields();
        this.fields.get(3).setValue(((DramaTheatre) this.obj).getMainPrize());
        this.fields.get(4).setValue(((DramaTheatre) this.obj).getAwardsCount());
    }

}
