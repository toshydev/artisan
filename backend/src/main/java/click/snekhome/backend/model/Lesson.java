package model;

public record Lesson(
        String id,
        String name,
        String description,
        String videoURL,
        long duration,
        int cost
) {
}
