package edu.norcocollege.cis18b.week5.mini01;

import java.util.ArrayList;
import java.util.List;

public class CollectionSelectionClinic {

    public static void main(String[] args) {
        List<ScenarioRecommendation> recommendations = buildRecommendations();

        for (ScenarioRecommendation recommendation : recommendations) {
            System.out.println("Scenario: " + recommendation.scenario());
            System.out.println("Best choice: " + recommendation.bestChoice());
            System.out.println("Why: " + recommendation.justification());
            System.out.println("Likely implementation: " + recommendation.implementation());
            System.out.println("Implementation why: " + recommendation.implementationWhy());
            System.out.println();
        }
    }

    public static List<ScenarioRecommendation> buildRecommendations() {
        List<ScenarioRecommendation> recommendations = new ArrayList<>();

        recommendations.add(new ScenarioRecommendation(
                "Attendance log",
                "List",
                "duplicates and arrival order both matter.",
                "ArrayList",
                "it preserves insertion order and is a strong default for append-heavy lists."
        ));

        recommendations.add(new ScenarioRecommendation(
                "Unique course codes",
                "Set",
                "duplicates should be rejected automatically.",
                "LinkedHashSet",
                "it keeps values unique while preserving insertion order for readable output."
        ));

        recommendations.add(new ScenarioRecommendation(
                "Student ID to current score lookup",
                "Map",
                "each student ID should map to one current score for fast key-based lookup.",
                "HashMap",
                "it is a strong default for fast lookups when sorted order is not required."
        ));

        recommendations.add(new ScenarioRecommendation(
                "Support ticket processing",
                "Queue",
                "tickets are usually handled first-in, first-out.",
                "ArrayDeque",
                "it efficiently supports queue operations without using legacy classes."
        ));

        recommendations.add(new ScenarioRecommendation(
                "Undo history",
                "Deque",
                "undo operations work naturally in last-in, first-out order.",
                "ArrayDeque",
                "it supports push and pop cleanly for stack-like behavior."
        ));

        recommendations.add(new ScenarioRecommendation(
                "Playlist steps in editable order",
                "List",
                "position matters and users may revisit or reorder items by index.",
                "ArrayList",
                "it supports indexed access and predictable general performance."
        ));

        return recommendations;
    }

    public record ScenarioRecommendation(
            String scenario,
            String bestChoice,
            String justification,
            String implementation,
            String implementationWhy
    ) {}
}