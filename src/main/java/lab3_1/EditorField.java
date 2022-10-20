package lab3_1;

import java.io.InputStream;
import java.io.PrintStream;

public abstract class EditorField<T> {
    private String name;
    private T value;
    protected InputStream inp;
    private PrintStream out;

    {
        this.name = null;
        this.value = null;
        this.inp = null;
        this.out = null;
    }

    public EditorField(String name, InputStream inp, PrintStream out) {
        this.name = name;
        this.inp = inp;
        this.out = out;
    }

    public EditorField(String name) {
        this(name, System.in, System.out);
    }

    public EditorField() {
    }

    public String getName() {
        return this.name;
    }

    public T getValue() {
        return this.value;
    }

    private void printPrompt() {
        this.out.print("Введите значение поля '" + this.getName() + "': ");
    }

    public void request() {
        printPrompt();
        this.value = fetchValue();
    };

    abstract protected T fetchValue();

}