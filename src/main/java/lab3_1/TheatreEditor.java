package lab3_1;

abstract class TheatreEditor extends Editor<Theatre> {
    @Override
    protected void initializeFields() {
        this.addField(new StringField("название театра"));
        this.addField(new ConstrainedIntegerField("рейтинг (1 - 100)", 0, 100));
        this.addField(new StringField("художественный руководитель"));
    }

    @Override
    protected void updateObject() {
        this.obj.setName((String) this.fields.get(0).getValue());
        this.obj.setRating((int) this.fields.get(1).getValue());
        this.obj.setArtDirector((String) this.fields.get(2).getValue());
    }

    @Override
    protected void loadObjectFields() {
        this.fields.get(0).setValue(obj.getName());
        this.fields.get(1).setValue(obj.getRating());
        this.fields.get(2).setValue(obj.getArtDirector());
    }
}