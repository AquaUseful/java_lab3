package lab3_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerField extends EditorField<Integer> {

    public IntegerField() {
        super();
    }

    public IntegerField(String name) {
        super(name);
    }

    @Override
    protected Integer fetchValue(Scanner scn) throws InputMismatchException {
        Integer val = scn.nextInt();
        scn.nextLine();
        return val;
    }
}
