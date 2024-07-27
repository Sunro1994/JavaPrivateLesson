package org.example.collections.PriorityQueue;

class Task implements Comparable<Task> {
    private int priority;
    private String description;

    public Task(int priority, String description) {
        this.priority = priority;
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{" +
                "priority=" + priority +
                ", description='" + description + '\'' +
                '}';
    }
}



