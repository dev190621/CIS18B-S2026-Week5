package edu.norcocollege.cis18b.week5.mini06;

import java.util.*;

public class Playlist implements Iterable<PlaylistItem> {

    private final List<PlaylistItem> items = new ArrayList<>();

    public void add(PlaylistItem item) {
        items.add(item);
    }

    // Default traversal (insertion order)
    @Override
    public Iterator<PlaylistItem> iterator() {
        return items.iterator();
    }

    // Priority traversal (highest priority first)
    public Iterator<PlaylistItem> priorityIterator() {
        List<PlaylistItem> copy = new ArrayList<>(items);

        copy.sort(Comparator
                .comparingInt(PlaylistItem::getPriority)
                .reversed());

        return copy.iterator();
    }

    // Helper for printing default order
    public List<String> defaultOrderTitles() {
        List<String> result = new ArrayList<>();
        for (PlaylistItem item : this) {
            result.add(item.getTitle());
        }
        return result;
    }

    // Helper for printing priority order
    public List<String> priorityOrderTitles() {
        List<String> result = new ArrayList<>();

        Iterator<PlaylistItem> iterator = priorityIterator();
        while (iterator.hasNext()) {
            result.add(iterator.next().getTitle());
        }

        return result;
    }
}