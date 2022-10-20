package lab3_1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class StringField extends EditorField<String> {

    public StringField() {
        super();
    }

    public StringField(String name) {
        super(name);
    }

    @Override
    protected String fetchValue(Scanner scn) {
        String val = scn.nextLine();
        return val;
    }
}
