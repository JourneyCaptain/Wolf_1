package Lektion_7;
import java.util.Scanner;

public class If_Else_Next_Next_3 {
    public static void main(String[] args) {

        // Задание 3:
        // Написать метод, выводящий на экран максимальное из трех целых чисел.
        // Числа должны вводится с клавиатуры.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number ");
        int c = scanner.nextInt();


        // Алгоритм:
        // Шаг 1 - объявить переменную max
        // Шаг 2 - присвоим max = a (любую из наших переменных)
        // Шаг 3 - сравним b и max, если b > max то max = b
        // Шаг 4 - сравним с и max, если с > max то max = с


        int maximum;
        maximum = maxABC(a, b, c);
        System.out.println("Max from " + a + " , " + b + ", " + c + " is: " + maximum);
    }

    //_______Methods_________
    public static int maxABC(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;

        //____end of Methods______

    }
}

