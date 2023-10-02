package Lektion_38.coffee;

import java.util.Scanner;

public class CoffeeMaschine {
    public static void main(String[] args) {

        // Display a welcome message
        System.out.println("Welcome to our Coffee Shop!");

        // Create an array of Coffee options from the Coffee enum
        Coffee[] menu = Coffee.values();

        // Display the coffee menu
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i]);
        }

        // Prompt the user to make a choice
        System.out.println("Input the number of your choice:");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Process the user's choice and display details
        switch (choice) {
            case 1, 2, 3, 4, 5: {
                System.out.println("Your choice is: " + menu[choice - 1].name());
                System.out.println("The volume is: " + menu[choice - 1].getVolume());
                System.out.println("Your price is: " + menu[choice - 1].getPrice());
                break;
            }
            default: {
                System.out.println("Wrong choice.");
            }
        }
    }
}

