package lab3_1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StringField extends EditorField<String> {

    public StringField(String name, InputStream inp, PrintStream out) {
        super(name, inp, out);
    }

    public StringField(String name) {
        super(name);
    }

    public StringField() {
        super();
    }

    @Override
    protected String fetchValue() {
        Scanner scn = new Scanner(this.inp);
        String val = scn.nextLine();
        scn.close();
        return val;
    }
}
