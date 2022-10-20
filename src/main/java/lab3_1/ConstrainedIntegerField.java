package lab3_1;

import java.util.Scanner;

public class ConstrainedIntegerField extends IntegerField {
    private int minVal;
    private int maxVal;

    ConstrainedIntegerField() {
        super();
    }

    ConstrainedIntegerField(String name, int minVal, int maxVal) {
        super(name);
        this.minVal = minVal;
        this.maxVal = maxVal;
    }

    @Override
    protected Integer fetchValue(Scanner scn) {
        var value = super.fetchValue(scn);
        if (value < this.minVal) {
            value = this.minVal;
        } else if (value > this.maxVal) {
            value = this.maxVal;
        }
        return value;
    }

}
