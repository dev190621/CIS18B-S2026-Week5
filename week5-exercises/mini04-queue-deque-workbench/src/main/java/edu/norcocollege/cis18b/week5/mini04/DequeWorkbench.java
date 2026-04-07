package edu.norcocollege.cis18b.week5.mini04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class DequeWorkbench {

    public static void main(String[] args) {
        demonstrateQueue();
        System.out.println();
        demonstrateStack();
        System.out.println();
        System.out.println("Why not Stack? ArrayDeque is the preferred modern choice because Deque supports both queue and stack operations cleanly.");
    }

    public static void demonstrateQueue() {
        Deque<String> tickets = new ArrayDeque<>();

        tickets.addLast("import roster");
        tickets.addLast("email reminder");
        tickets.addFirst("urgent outage");

        System.out.println("Queue state: " + tickets);

        while (!tickets.isEmpty()) {
            System.out.println("FIFO processed: " + tickets.removeFirst());
            System.out.println("Queue now: " + tickets);
        }
    }

    public static void demonstrateStack() {
        Deque<String> undoStack = new ArrayDeque<>();

        undoStack.push("insert checkpoint");
        undoStack.push("rename file");
        undoStack.push("delete temp note");

        System.out.println("Stack state: " + undoStack);

        while (!undoStack.isEmpty()) {
            System.out.println("Undo popped: " + undoStack.pop());
            System.out.println("Stack now: " + undoStack);
        }
    }

    public static List<String> fifoOrder() {
        Deque<String> tickets = new ArrayDeque<>();
        List<String> processed = new ArrayList<>();

        tickets.addLast("import roster");
        tickets.addLast("email reminder");
        tickets.addLast("close ticket");

        while (!tickets.isEmpty()) {
            processed.add(tickets.removeFirst());
        }

        return processed;
    }

    public static List<String> lifoOrder() {
        Deque<String> undoStack = new ArrayDeque<>();
        List<String> popped = new ArrayList<>();

        undoStack.push("first edit");
        undoStack.push("second edit");
        undoStack.push("third edit");

        while (!undoStack.isEmpty()) {
            popped.add(undoStack.pop());
        }

        return popped;
    }
}