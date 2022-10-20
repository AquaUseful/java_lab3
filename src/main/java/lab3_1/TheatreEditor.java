package lab3_1;

abstract class TheatreEditor<T> extends Editor<T> {
    @Override
    protected void initializeFields() {
        this.addField(new StringField("название театра"));
        this.addField(new IntegerField("рейтинг"));
        this.addField(new StringField("художественный руководитель"));
    }

}