package edu.norcocollege.cis18b.week5.mini03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetComparisonDemo {

    public static void main(String[] args) {
        List<String> tags = Arrays.asList(
                "queue", "stack", "map", "set", "queue", "Map", "STACK"
        );

        Set<String> hashSet = toHashSet(tags);
        Set<String> linkedHashSet = toLinkedHashSet(tags);
        Set<String> treeSet = toTreeSet(tags);
        Set<String> caseInsensitiveTreeSet = toCaseInsensitiveTreeSet(tags);

        System.out.println("Source list: " + tags);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("Case-insensitive TreeSet: " + caseInsensitiveTreeSet);
        System.out.println();
        System.out.println("HashSet explanation: order is not reliable.");
        System.out.println("LinkedHashSet explanation: preserves insertion order.");
        System.out.println("TreeSet explanation: keeps unique values in sorted order.");
        System.out.println("Case-insensitive TreeSet explanation: comparator affects ordering and can treat values like Map and map as duplicates.");
    }

    public static Set<String> toHashSet(List<String> tags) {
        return new HashSet<>(tags);
    }

    public static Set<String> toLinkedHashSet(List<String> tags) {
        return new LinkedHashSet<>(tags);
    }

    public static Set<String> toTreeSet(List<String> tags) {
        return new TreeSet<>(tags);
    }

    public static Set<String> toCaseInsensitiveTreeSet(List<String> tags) {
        Set<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        set.addAll(tags);
        return set;
    }

    public static Set<String> toLengthThenAlphabeticalTreeSet(List<String> tags) {
        Comparator<String> comparator = Comparator
                .comparingInt(String::length)
                .thenComparing(String::compareToIgnoreCase);

        Set<String> set = new TreeSet<>(comparator);
        set.addAll(tags);
        return set;
    }
}