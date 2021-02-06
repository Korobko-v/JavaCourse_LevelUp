package org.levelup.lesson10.lambda;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Task {
    private final String id;
    private final String title;
    private final TaskType type;
    private final LocalDate createdOn;
    private boolean done = false;
    private Set<String> tags = new HashSet<>();
    private LocalDate dueOn;

    public Task(String id, String title, TaskType type, LocalDate createdOn, boolean done, Set<String> tags, LocalDate dueOn) {
        this.id = id;
        this.title = title;
        this.type = type;
        this.createdOn = createdOn;
        this.done = done;
        this.tags = tags;
        this.dueOn = dueOn;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskType getType() {
        return type;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
}
