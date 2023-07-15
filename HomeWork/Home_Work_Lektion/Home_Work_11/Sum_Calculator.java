package Home_Work_11;

import java.util.Scanner;

public class Sum_Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();
        double sum = calculateSum(n);
        System.out.printf("Сумма чисел от 1 до 1/%d равна: %.2f%n", n, sum);
    }

    public static double calculateSum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}

