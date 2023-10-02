package Lektion_38.coffee;

import java.util.Scanner;

public class Coffee_M {
    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("Welcome to our Coffee Shop!");

        // Create an array of Coffee options from the Coffee enum
        Coffee[] menu = Coffee.values();

        // Display the coffee menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i]);
        }

        // Declare the choice variable
        int choice;

        // Prompt the user to make a choice and repeat until a valid choice is entered
        do {
            System.out.println("Input the number of your choice:");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice) {
                case 1, 2, 3, 4, 5:
                    System.out.println("Your choice is: " + menu[choice - 1].name());
                    System.out.println("The volume is: " + menu[choice - 1].getVolume());
                    System.out.println("Your price is: " + menu[choice - 1].getPrice());
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and " + menu.length);
            }
        } while (choice < 1 || choice > menu.length);
    }
}


