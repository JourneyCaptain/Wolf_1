package Home_Work_38.todo_list;

// Definition of the Task class to represent individual tasks in the to-do list
class Task {
    // Private instance variable to store the description of the task
    private String description;

    // Constructor to initialize a task with the provided description
    public Task(String description) {
        this.description = description;
    }

    // Public method to get the description of the task
    public String getDescription() {
        return description;
    }
}


