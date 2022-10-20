package lab3_1;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.management.openmbean.OpenType;

public class Main {

    static private int readNumber(PrintStream out, Scanner scn, String prompt, int min, int max) {
        int num;
        for (;;) {
            out.print(prompt);
            try {
                num = scn.nextInt();
                scn.nextLine();
            } catch (InputMismatchException e) {
                out.println("Недопустимое значение!");
                scn.next();
                continue;
            }
            if ((num < min) || (num > max)) {
                out.println("Значение не в диапазоне!");
                continue;
            }
            return num;
        }
    }

    static private String readString(PrintStream out, Scanner scn, String prompt) {
        String line;
        for (;;) {
            out.print(prompt);
            try {
                line = scn.nextLine();
            } catch (InputMismatchException e) {
                out.println("Недопустимое значение!");
                scn.next();
                continue;
            }
            return line;
        }
    }

    static public void main(String[] args) {

        var out = System.out;
        var scn = new Scanner(System.in);

        new PuppetTheatre("имени Такташкина", 100, "Такташкин", "ПГУ", 256);
        new DramaTheatre("Драмтеатр всех драмтеатров", 50, "Дух Ленина", "премия Ленина", 500);
        new DramaTheatre("ЯЯЯЯЯЯазь", 0, "язь", "Премия язи", 0);

        for (boolean repeat = true; repeat;) {
            out.println("\nВыберите желаемое действие:\n" +
                    "1. Вывести театр с самым большим рейтингом\n" +
                    "2. Упорядочить массив театров по названиям в обратном порядке\n" +
                    "3. Найти театр по фамилии худ. руководителя и отрадактировать\n" +
                    "4. Вывести информацию о театрах с рейтингом больше введенного\n" +
                    "5. Добавить драматический театр\n" +
                    "6. Добавить кукольный театр\n" +
                    "7. Вывести список всех театров\n" +
                    "8. Выход\n");
            int action = readNumber(out, scn, "> ", 1, 8);

            switch (action) {
                case 1:
                    out.println(Theatre.getWithHighestRating().getFancyInfo());
                    break;
                case 2:
                    out.print("Сортирую...  ");
                    Theatre.sortAll();
                    out.println("OK");
                    break;
                case 3:
                    var dir = readString(out, scn, "Фамилия: ");
                    var theatre = Theatre.findByArtDirector(dir);
                    if (theatre == null) {
                        out.println("Театра с таким руководителем нет!");
                        break;
                    }
                    var editor = theatre.getEditor();
                    editor.requestEdit(out, scn);
                    editor.updateObject();
                    break;
                case 4:
                    var name = readString(out, scn, "Название: ");
                    ArrayList<Theatre> theaters = Theatre.getWithRatingHigherThan(name);
                    if (theaters.isEmpty()) {
                        out.println("Театров с рейтингом выше заданного нет");
                        break;
                    }
                    for (var t : theaters) {
                        out.println(t.getFancyInfo());
                    }
                    break;
                case 5:
                    var dramaEditor = new DramaTheatreEditor();
                    dramaEditor.requestNew(out, scn);
                    dramaEditor.updateObject();
                    break;
                case 6:
                    var puppetEditor = new PuppetTheatreEditor();
                    puppetEditor.requestNew(out, scn);
                    puppetEditor.updateObject();
                    break;
                case 7:
                    for (var t : Theatre.getTheatres()) {
                        out.println(t.getFancyInfo());
                    }
                    break;
                case 8:
                    repeat = false;
                    break;

            }
        }

        scn.close();
    }

}
