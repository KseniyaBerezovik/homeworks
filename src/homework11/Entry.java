package homework11;

import java.time.LocalTime;

public class Entry {
    private LocalTime startTime;
    private LocalTime endTime;
    private String description;

    public Entry(LocalTime startTime, LocalTime endTime, String description) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return startTime + "-" + endTime + " " + description;
    }
}
