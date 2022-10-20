package lab3_1;

abstract class TheatreEditor extends Editor<Theatre> {
    @Override
    protected void initializeFields() {
        this.addField(new StringField("название театра"));
        this.addField(new ConstrainedIntegerField("рейтинг", 0, 100));
        this.addField(new StringField("художественный руководитель"));
    }

}