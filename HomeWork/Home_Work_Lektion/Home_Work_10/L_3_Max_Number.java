package Home_Work_10;

import java.util.Scanner;

public class L_3_Max_Number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Задача 3
//        Написать метод, определяющий максимум из трех натуральных чисел.
//        Числа вводит пользователь с клавиатуры.
//        Метод должен быть защищен от ввода отрицательных чисел.
//        - ЭТО ПОКА МОЖНО НЕ ДЕЛАТЬ

        System.out.print("Print the first number: ");
        double a = yourNumber(scanner);

        System.out.print("Print the second  number: ");
        double b = yourNumber(scanner);

        System.out.print("Print the third  number: ");
        double c = yourNumber(scanner);

        double max = Math.max(a ,Math.max(b,c));

        System.out.println("======================================");
        System.out.printf("The greater of the 3 numbers is:  %.0f" , max );
    }
    public static double yourNumber(Scanner scanner) {
        double input = scanner.nextDouble();
        if (input < 0) {
            System.out.println("Error: Enter a positive number.");
            System.out.print("Please re-enter: ");
            input = scanner.nextDouble();
        }
        return input;

    }

}