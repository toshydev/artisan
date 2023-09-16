package model;

import java.time.LocalDateTime;
import java.util.List;

public record Session(
        String id,
        String lessonID,
        LocalDateTime start,
        boolean cancelled,
        List<String> participantIDs
) {
}
