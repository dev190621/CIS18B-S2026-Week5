package edu.norcocollege.cis18b.week5.mini06;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {

    @Test
    void testDefaultOrder() {
        Playlist playlist = new Playlist();

        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        List<String> result = new ArrayList<>();

        for (PlaylistItem item : playlist) {
            result.add(item.getTitle());
        }

        assertEquals(List.of("Intro", "Demo", "Quiz"), result);
    }

    @Test
    void testPriorityOrder() {
        Playlist playlist = new Playlist();

        playlist.add(new PlaylistItem("Intro", 1));
        playlist.add(new PlaylistItem("Demo", 2));
        playlist.add(new PlaylistItem("Quiz", 3));

        List<String> result = new ArrayList<>();

        Iterator<PlaylistItem> iterator = playlist.priorityIterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().getTitle());
        }

        assertEquals(List.of("Quiz", "Demo", "Intro"), result);
    }
}