package Home_Work_38.todo_list;

public enum Todo_List {
    // Task 1. Implement an application "To-Do List" using ENUM to organize the menu.
    // TODO LIST - list of tasks
    // Application menu:
    // Add a task
    // View all tasks
    // Delete a task (by number)
    // Exit
    // Use the Task class, which you define yourself.

    // Enum declaration with different menu options and their descriptions
    ADD_TASK("Add a task"),// Represents the option to add a new task
    VIEW_TASK("View all tasks"),// Represents the option to view all tasks
    DELETE_TASK("Delete a task (by number)"),// Represents the option to delete a task by specifying its number
    EXIT("Exit");// Represents the option to exit the application

    // Private instance variable to store the description of the menu option
    private String description;

    // Constructor to initialize the description of each menu option
    Todo_List(String description) {
        this.description = description;
    }

    // Public method to get the description of the menu option
    public String getDescription() {
        return description;
    }
}