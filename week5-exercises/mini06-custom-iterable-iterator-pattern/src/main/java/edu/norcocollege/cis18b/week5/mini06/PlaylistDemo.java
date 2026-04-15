package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlaylistDemo {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        System.out.println("Default order: " + titles(playlist.iterator()));
        System.out.println("Priority order: " + titles(playlist.priorityIterator()));
        System.out.println("Title order: " + titles(playlist.titleIterator()));

        System.out.println(
            "Reflection: Built-in iteration is enough when one obvious order exists. " +
            "A custom iterator is useful when the same data needs different traversal views, " +
            "such as insertion order, priority order, or alphabetical order."
        );
    }

    static List<String> titles(Iterator<PlaylistItem> iterator) {
        List<String> titles = new ArrayList<>();
        while (iterator.hasNext()) {
            titles.add(iterator.next().getTitle());
        }
        return titles;
    }
}