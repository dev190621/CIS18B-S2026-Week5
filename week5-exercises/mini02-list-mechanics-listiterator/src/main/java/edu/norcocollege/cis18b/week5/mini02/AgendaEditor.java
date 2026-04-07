package edu.norcocollege.cis18b.week5.mini02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class AgendaEditor {

    public static void main(String[] args) {
        List<String> agenda = new ArrayList<>(Arrays.asList(
                "Intro", "Demo", "Optional", "Quiz"
        ));

        applyEdits(agenda);

        System.out.println("Forward: " + agenda);
        System.out.println("Reverse: " + reverseView(agenda));
    }

    public static void applyEdits(List<String> agenda) {
        ListIterator<String> iterator = agenda.listIterator();

        while (iterator.hasNext()) {
            String step = iterator.next();

            if ("Optional".equals(step)) {
                iterator.remove();
                continue;
            }

            if ("Demo".equals(step)) {
                iterator.set("Live Demo");
                iterator.add("Reflection");
            }
        }
    }

    public static List<String> reverseView(List<String> agenda) {
        List<String> reversed = new ArrayList<>();
        ListIterator<String> iterator = agenda.listIterator(agenda.size());

        while (iterator.hasPrevious()) {
            reversed.add(iterator.previous());
        }

        return reversed;
    }
}