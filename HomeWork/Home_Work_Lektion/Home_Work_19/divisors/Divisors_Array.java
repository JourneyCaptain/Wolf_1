package Home_Work_19.divisors;

import java.util.Scanner;

public class Divisors_Array {
    public static void main(String[] args) {
//        Задача 2. (на повторение темы массивы, циклы и вычисления)
//        Вводится пользователем натуральное число n.
//        Сформировать массив из всех делителей данного числа.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a natural number: ");
        int n = scanner.nextInt();

        int[] divisors = findDivisors(n);

        System.out.println("An array of divisors of a number " + n + ":");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    public static int[] findDivisors(int n) {
        // Determine the maximum size of the array of divisors
        int maxDivisors = countDivisors(n);

        //  Create an array with the size found
        int[] divisors = new int[maxDivisors];

        // Filling the array with divisors
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[index] = i;
                index++;
            }
        }

        // Reduce the size of the array to the actual number of divisors
        int[] result = new int[index];
        System.arraycopy(divisors, 0, result, 0, index);

        return result;
    }

    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;

    }
}
