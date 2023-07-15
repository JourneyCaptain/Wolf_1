package Home_Work_11;

import java.util.Scanner;

public class Debt_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму ссуды (в тысячах рублей): ");
        double m = scanner.nextDouble();
        System.out.print("Введите целевую сумму (в тысячах рублей): ");
        double s = scanner.nextDouble();

        double r = 0.10; // Процентная ставка (10%)
        int t = calculateYearsToExceedDebt(m, r, s);

        System.out.printf("Долг превысит %f тысяч рублей через %d лет.%n", s, t);
    }

    public static int calculateYearsToExceedDebt(double initialDebt, double interestRate, double targetDebt) {
        int years = 0;
        double debt = initialDebt;

        while (debt <= targetDebt) {
            debt += debt * interestRate;
            years++;
        }

        return years;

    }
}
