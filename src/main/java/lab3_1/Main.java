package lab3_1;

public class Main {
    static public void main(String[] args) {

        try {

            StringField f = new StringField("Название");

            f.request();

            ArtDirector a = new ArtDirector("fname", "mname", "lname", 10);
            DramaTheatre th = new DramaTheatre(f.getValue(), 50, a);

            System.out.println(a.getFisrtName());
            System.out.println(th.getTypeName());
            System.out.println(th.getName());
        } catch (TheatreException e) {
            System.out.println("ОШибка:\n" + e.getMessage());
        }
    }

}
