package edu.norcocollege.cis18b.week5.mini06;

public class PlaylistItem {

    private final String title;
    private final int priority;

    public PlaylistItem(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }
}