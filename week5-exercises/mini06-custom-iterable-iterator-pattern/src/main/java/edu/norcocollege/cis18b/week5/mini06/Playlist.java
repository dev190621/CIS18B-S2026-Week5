package edu.norcocollege.cis18b.week5.mini06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<PlaylistItem> {

    private final List<PlaylistItem> items = new ArrayList<>();

    public void add(PlaylistItem item) {
        items.add(item);
    }

    @Override
    public Iterator<PlaylistItem> iterator() {
        return List.copyOf(items).iterator();
    }

    public Iterator<PlaylistItem> priorityIterator() {
        List<PlaylistItem> sorted = new ArrayList<>(items);
        sorted.sort(Comparator.comparingInt(PlaylistItem::getPriority).reversed());
        return sorted.iterator();
    }

    public Iterator<PlaylistItem> titleIterator() {
        List<PlaylistItem> sorted = new ArrayList<>(items);
        sorted.sort(Comparator.comparing(PlaylistItem::getTitle));
        return sorted.iterator();
    }
}