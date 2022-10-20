package lab3_1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public abstract class Editor<T> {
    protected ArrayList<EditorField> fields;
    protected T obj;

    {
        fields = new ArrayList<>();
    }

    Editor() {
        initializeFields();
    }

    protected void addField(EditorField field) {
        this.fields.add(field);
    }

    public T getObject() throws Exception {
        this.updateObject();
        return this.obj;
    };

    public void requestEdit(int fieldIndex, PrintStream out, Scanner scn) {
        this.fields.get(fieldIndex).requestEdit(out, scn);
    }

    public void requestNew(PrintStream out, Scanner scn) {
        for (var field : this.fields) {
            field.requestNew(out, scn);
        }
    }

    protected abstract void updateObject() throws Exception;

    protected abstract void initializeFields();

}
