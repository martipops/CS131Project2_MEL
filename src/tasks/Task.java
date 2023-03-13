package tasks;

/**
 * Task class
 * 
 * This class represents a task object, which has a name, status, and priority.
 * The status of a task can be new, in progress, or complete. The priority value
 * of a task can be set to one of three values: MIN_PRIORITY (1), MED_PRIORITY
 * (5), or MAX_PRIORITY (10). A task object can be compared to another task
 * object based on their priority values. This class implements the Priority
 * interface and the Comparable interface to compare priorities.
 * 
 * @author Marti Lonnemann
 *         Project 2; Tasks
 */

class Task implements Priority, Comparable<Task> {
    /**
     * The status of a task can be new, in progress, or complete.
     */
    public enum Status {
        NEW, IN_PROGRESS, COMPLETE
    };

    private String name;
    private Status status;
    private int priority;

    /**
     * Constructs a new task object with the given name, default status set to
     * "new", and default priority set to "medium".
     * 
     * @param name: the name of the task
     */
    public Task(String name) {
        this.name = name;
        this.status = Status.NEW;
        this.priority = MED_PRIORITY; // default to medium
    }

    /**
     * Returns the name of the task.
     * 
     * @return the name of the task
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the task to the given name.
     * 
     * @param name: the new name for the task
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the status of the task.
     * 
     * @return the status of the task
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the status of the task to the given status.
     * 
     * @param status: the new status for the task
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Sets the priority of the task to the given priority value, but only if the
     * value is within the valid range of priorities.
     * 
     * @param priority: the new priority value for the task
     */
    @Override // from Priority interface
    public void setPriority(int priority) {
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY)
            this.priority = priority;
    }

    /**
     * Compares this task's priority to another task's priority.
     * 
     * @param other: the other task to compare to
     * @return a positive integer if this task has higher priority, a negative
     *         integer if this task has lower priority, or zero if they have equal
     *         priority
     */
    @Override
    public int compareTo(Task other) {
        if (this.getPriority() > other.getPriority()) {
            return 1;
        } else if (this.getPriority() < other.getPriority()) {
            return -1;
        }
        return 0;
    }

    /**
     * Returns the priority value of the task.
     * 
     * @return the priority value of the task
     */
    @Override // from Priority interface
    public int getPriority() {
        return priority;
    }

    /**
     * Returns a string representation of the task, including its name, status, and
     * priority.
     * 
     * @return a string representation of the task
     */
    @Override
    public String toString() {
        return "Task [name=" + name + ", status=" + status + ", priority=" + priority + "]";
    }

}