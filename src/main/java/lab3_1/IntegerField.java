package lab3_1;

import java.util.Scanner;

public class IntegerField extends EditorField<Integer> {
    @Override
    protected Integer fetchValue() {
        Scanner scn = new Scanner(this.inp);
        Integer val = scn.nextInt();
        scn.close();
        return val;
    }
}
