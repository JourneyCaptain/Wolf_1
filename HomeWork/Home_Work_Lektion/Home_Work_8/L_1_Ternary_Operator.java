package Home_Work_8;

import java.util.Scanner;

public class L_1_Ternary_Operator {
    public static void main(String[] args) {

        // Задача 1
        // Пользователь вводит с клавитуры число.
        // Вывести абсолютное значение (модуль) числа,
        // используя тернарный оператор.

        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------");

        System.out.print("Input your number: ");
        int number = scan.nextInt();

        int ternary = number >= 0 ? number : - number;

        System.out.println("-------------------------");
        System.out.println("_________________________");
        System.out.println("Absolute value of number " + ternary);




    }

}
