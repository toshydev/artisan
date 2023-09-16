package model;

import java.util.List;

public record Course(
        String id,
        String creatorID,
        String name,
        String description,
        List<String> categoryIDs,
        List<String> lessonIDs,
        List<String> sessionIDs,
        String imageURL
) {
}
