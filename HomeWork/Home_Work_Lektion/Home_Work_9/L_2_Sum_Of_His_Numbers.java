package Home_Work_9;

import java.util.Scanner;

public class L_2_Sum_Of_His_Numbers {
    public static void main(String[] args) {
        // Задача 2
        // Вводится положительное целое число,
        // найдите сумму его цифр.

        Scanner scan = new Scanner(System.in);
        System.out.println(" Input integer number:");
        int n = scan.nextInt();
        System.out.println(" Sum number " + sumD(n));

    }
    public static int sumD (int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return  sum;

    }
}
