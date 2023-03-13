package tasks;

/**
 * Process class
 * 
 * A class representing a process with a process ID and a priority level.
 * Implements the Priority interface and Comparable interface with a type
 * argument of Process.
 * 
 * @author Marti Lonnemann
 *         Project 2; Tasks
 */
public class Process implements Priority, Comparable<Process> {

    private String processID;
    private int priority;

    /**
     * Constructs a new Process object with the given process ID and a default
     * priority of 5 (MED_PRIORITY).
     * 
     * @param processID the ID of the process
     */
    public Process(String processID) {
        this.processID = processID;
        this.priority = MED_PRIORITY; // default priority is medium (5)
    }

    /**
     * Sets the process ID to the given value.
     * 
     * @param processID the new process ID to set
     */
    public void setProcessID(String processID) {
        this.processID = processID;
    }

    /**
     * Gets the process ID of the Process object.
     * 
     * @return the process ID of the Process object
     */
    public String getProcessID() {
        return processID;
    }

    /**
     * Sets the priority level of the Process object to the given value, if it is
     * valid.
     * 
     * @param priority the new priority level to set
     */
    @Override // from Priority interface
    public void setPriority(int priority) { // validate the priority value before setting it
        if (priority >= MIN_PRIORITY && priority <= MAX_PRIORITY) // if valid, set the new priority value
            this.priority = priority; // otherwise, keep the existing value
    }

    /**
     * Gets the priority level of the Process object.
     * 
     * @return the priority level of the Process object
     */
    @Override // from Priority interface
    public int getPriority() {
        return priority;
    }

    /**
     * Compares the priority level of this Process object with that of another
     * Process object.
     * 
     * @param other the other Process object to compare with
     * @return 1 if this Process has higher priority, -1 if it has lower priority,
     *         and 0 if they have equal priority
     */
    @Override
    public int compareTo(Process other) {
        if (this.getPriority() > other.getPriority()) {
            return 1;
        } else if (this.getPriority() < other.getPriority()) {
            return -1;
        }
        return 0; // must be equal
    }

    /**
     * Returns a string representation of the Process object.
     * 
     * @return a string representation of the Process object
     */
    @Override
    public String toString() {
        return "Process [processId=" + processID + ", priority=" + priority + "]";
    }

}