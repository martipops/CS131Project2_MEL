package tasks;

/**
 * TaskTester class
 * 
 * Tests all the methods for Task and Process class
 * 
 * @author Marti Lonnemann
 *         Project 2; Tasks
 */
public class TaskTester {
    public static void mainTasks() {
        Task task1 = new Task("Task1 Test");

        // test getName() and toString() methods
        System.out.println("Task name: " + task1.getName());
        System.out.println("Task details: " + task1.toString());

        // test setStatus() method
        task1.setStatus(Task.Status.IN_PROGRESS);
        System.out.println("Task status: " + task1.getStatus());

        // test setPriority() method
        task1.setPriority(Priority.MAX_PRIORITY);
        System.out.println("Task priority: " + task1.getPriority());

        // create a second task object for comparison testing
        Task task2 = new Task("Task2 Launch Pac-Man");

        // test compareTo() method by comparing the two tasks
        int comparisonResult = task1.compareTo(task2);
        System.out.println("Comparison result: " + comparisonResult);
    }
}
