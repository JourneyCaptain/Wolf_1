package Home_Work_13.part_2;

import java.util.Scanner;

public class String_In_Reverse_Order {
    public static void main(String[] args) {

        // Задача 3. Пользователь вводит строку.
        // Распечатайте эту строку в обратном порядке.


        Scanner scan = new Scanner(System.in);
        System.out.print("input string: ");
        String string = scan.nextLine();

        String stringReverse = printStringReverse(string);
        System.out.println();

        System.out.println(string);
        System.out.println();

        System.out.println(stringReverse);

    }
    public static String printStringReverse(String string){
        String stringReverse = "";
        for (int i = string.length()-1; i >= 0; i--) {
            stringReverse = stringReverse + string.charAt(i);


        }
        return stringReverse;
    }

}