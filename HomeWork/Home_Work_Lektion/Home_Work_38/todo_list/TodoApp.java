package Home_Work_38.todo_list;

import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {

        // Create a new instance of TodoList with a maximum size of 10 tasks
        TodoList todoList = new TodoList(10);


        Scanner scanner = new Scanner(System.in);

        // Start an infinite loop for the application
        while (true) {
            System.out.println("\nApp Menu:");

            // Display the menu options using the values from the Todo_List enum
            for (int i = 0; i < Todo_List.values().length; i++) {
                System.out.println((i + 1) + ". " + Todo_List.values()[i].getDescription());
            }

            // Read the user's choice from the menu
            int choice = scanner.nextInt();

            // Use a switch statement to handle the user's choice
            switch (choice) {
                case 1:
                    scanner.nextLine(); // Consume newline
                    System.out.print("Input a description of the task: ");
                    String description = scanner.nextLine();
                    Task task = new Task(description);
                    todoList.addTask(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    System.out.println("\nTask List: ");
                    todoList.viewTasks();
                    break;
                case 3:
                    System.out.print("Input the number of the record to be deleted: ");
                    int index = scanner.nextInt();
                    todoList.deleteTask(index);
                    break;
                case 4:
                    System.out.println("Exit from the application.");
                    System.exit(0); // Exit the application
                default:
                    System.out.println("Invalid input. Please select an existing menu item.");
                    break;
            }
        }
    }
}


