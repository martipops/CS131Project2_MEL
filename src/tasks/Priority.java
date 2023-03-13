package tasks;

/**
 * Priority interface
 * 
 * Represents a Priority interface to allow for priority setting and comparison.
 * 
 * @author Marti Lonnemann
 *         Project 2; Tasks
 * 
 */

interface Priority {
    int MED_PRIORITY = 5;
    int MIN_PRIORITY = 1;
    int MAX_PRIORITY = 10;

    void setPriority(int priority);

    int getPriority();
}