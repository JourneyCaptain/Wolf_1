package Home_Work_10;

import java.util.Scanner;

public class L_2_Compound_Interest {     // Сложный процент
    public static void main(String[] args) {

        // Задача 2
        // В сберкассу на трёхпроцентный вклад положили S рублей.
        // Какой станет сумма вклада через N лет?

        Scanner scanner = new Scanner(System.in);
        System.out.println("======================================");

        System.out.print(" Enter the initial deposit amount: ");
        double s = scanner.nextInt();

        System.out.println("--------------------------------------");

        System.out.print(" Enter the number of years: ");
        double n = scanner.nextInt();

        double p = 0.03; //annual percentage rate (3%)

        int years = 0;

        while (years < n) {
            s = s + s * p;
            years++;
        }

        System.out.println("--------------------------------------");

        System.out.printf (" In: %.0f %s %n " , n , " Years. ");
        System.out.printf("Your  deposit will be : %.2f %s " , s , "Money");

    }
}
