package lab3_1;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class EditorField<T> {
    private String name;
    private T value;

    public EditorField(String name) {
        this.name = name;
    }

    public EditorField() {
        this(null);
    }

    public String getName() {
        return this.name;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    private void printPrompt(PrintStream out) {
        out.print("Введите значение поля '" + this.getName() + "': ");
    }

    private void printValue(PrintStream out) {
        out.println("Текущее значение поля '" + this.getName() + "': " + this.getValue());
    }

    public void requestNew(PrintStream out, Scanner scn) {
        this.printPrompt(out);
        this.value = this.fetchValue(scn);
    }

    public void requestEdit(PrintStream out, Scanner scn) {
        this.printValue(out);
        this.requestNew(out, scn);
    }

    abstract protected T fetchValue(Scanner scn);

}