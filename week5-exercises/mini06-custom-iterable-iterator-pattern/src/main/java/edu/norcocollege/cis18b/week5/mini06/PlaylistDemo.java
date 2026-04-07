package edu.norcocollege.cis18b.week5.mini06;

public class PlaylistDemo {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        System.out.println("Default order: " + playlist.defaultOrderTitles());
        System.out.println("Priority order: " + playlist.priorityOrderTitles());

        System.out.println("Reflection: Built-in iteration works for simple traversal, but custom Iterable is useful when multiple traversal strategies like priority order are needed.");
    }
}