package Home_Work_22.code;

import java.util.Scanner;

public class Conversion_Of_Length_Measures {
    public static void main(String[] args) {
        //Задача 3. (switch case, бесконечный цикл, методы)
        // Составьте программу для перевода мер длины:

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option to convert:");
            System.out.println("1. Sazhen to meters");
            System.out.println("2. Inches to centimeters");
            System.out.println("3. Feet to meters");
            System.out.println("4. Arshins to meters");
            System.out.println("5. Inches to millimeters");
            System.out.println("6. Exit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Input the number of sazhens: ");
                    double sazhen = scanner.nextDouble();
                    double meters = sazhen * 2.1366;
                    System.out.println(sazhen + " sazhens = " + meters + " meters");
                    break;
                case 2:
                    System.out.print("Input the number of inches: ");
                    double inches = scanner.nextDouble();
                    double centimeters = inches * 2.5;
                    System.out.println(inches + " inches = " + centimeters + " centimeters");
                    break;
                case 3:
                    System.out.print("Input the number of feet: ");
                    double feet = scanner.nextDouble();
                    meters = feet * 0.3048;
                    System.out.println(feet + "feet = " + meters + " meters");
                    break;
                case 4:
                    System.out.print("Input the number of arshins: ");
                    double arshin = scanner.nextDouble();
                    meters = arshin * 0.7112;
                    System.out.println(arshin + " arshins = " + meters + " meters");
                    break;
                case 5:
                    System.out.print("Input the number of inches: ");
                    inches = scanner.nextDouble();
                    double millimeters = inches * 25.3995;
                    System.out.println(inches + " inches = " + millimeters + " millimeters");
                    break;
                case 6:
                    System.out.println("The program is finished.");
                    System.exit(0);
                default:
                    System.out.println("Wrong input. Try again.");
                    break;
            }
        }

    }
}