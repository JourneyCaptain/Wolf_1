package Home_Work_38.todo_list;

// Definition of the TodoList class to manage the list of tasks
public class TodoList {
    // Private array to store the tasks and an integer to track the number of tasks
    private Task[] tasks;
    private int taskCount;

    // Constructor to initialize a TodoList with a specified maximum size
    public TodoList(int maxSize) {
        tasks = new Task[maxSize];
        taskCount = 0;
    }

    // Method to add a task to the list
    public void addTask(Task task) {
        // Check if the list is not full
        if (taskCount < tasks.length) {
            tasks[taskCount] = task;
            taskCount++;
        } else {
            System.out.println("The task list is full. You cannot add more tasks.");
        }
    }

    // Method to view all tasks in the list
    public void viewTasks() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println((i + 1) + ". " + tasks[i].getDescription());
        }
    }

    // Method to delete a task from the list by its index
    public void deleteTask(int index) {
        if (index >= 1 && index <= taskCount) {
            for (int i = index - 1; i < taskCount - 1; i++) {
                tasks[i] = tasks[i + 1];
            }
            tasks[taskCount - 1] = null;
            taskCount--;
            System.out.println("Record deleted.");
        } else {
            System.out.println("Invalid entry number.");
        }
    }
}