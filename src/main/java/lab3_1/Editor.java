package lab3_1;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
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

    public void requestEdit(PrintStream out, Scanner scn) {
        out.println("Выберите поле для редактиривания:");
        for (int i = 0; i < this.fields.size(); ++i) {
            out.println(i + " - " + this.fields.get(i).getName());
        }
        int fieldIndex;
        for (;;) {
            out.print("Номер поля: ");
            try {
                fieldIndex = scn.nextInt();
                scn.nextLine();
            } catch (InputMismatchException e) {
                scn.next();
                out.println("Недопустимый ввод!");
                continue;
            }
            if ((fieldIndex >= 0) && (fieldIndex < this.fields.size())) {
                break;
            } else {
                out.println("Несущестующий номер поля!");
            }
        }
        this.requestEdit(fieldIndex, out, scn);
    }

    public void requestNew(int fieldIndex, PrintStream out, Scanner scn) {
        this.fields.get(fieldIndex).requestNew(out, scn);
    }

    public void requestNew(PrintStream out, Scanner scn) {
        for (int i = 0; i < this.fields.size(); ++i) {
            for (;;) {
                try {
                    this.requestNew(i, out, scn);
                } catch (InputMismatchException e) {
                    out.println("Недопустимое значение поля, попробуйте ещё раз!");
                    scn.next();
                    continue;
                }
                break;
            }
        }
    }

    protected abstract void updateObject();

    protected abstract void loadObjectFields(T obj);

    protected abstract void initializeFields();

}
