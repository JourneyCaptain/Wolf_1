package Home_Work_9;

import java.util.Scanner;

public class L_1_String_Repeats {
    public static void main(String[] args) {

        // Задача 1
        // Программа получает на вход строку и число повторений этой строки.
        // Программа должна вывести эту строку нужное количество раз.

        Scanner scan = new Scanner(System.in);

        System.out.println("Input text");
        String text = scan.next();

        System.out.println("Input quantity");
        int repeats = scan.nextInt();

        int num = 0;

        while (num < repeats){

            System.out.println(text);
            num ++;

        }

    }
}
