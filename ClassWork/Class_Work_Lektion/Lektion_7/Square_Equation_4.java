package Lektion_7;

import java.util.Scanner;

public class Square_Equation_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Задание 4:
        // Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с.


        System.out.println("Input 1st number ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number ");
        int c = scanner.nextInt();

        int d = b * b -4 * a * c; // calculate discriminant

        if (d < 0){
            System.out.println("There are no roots, d is negative " + d);
        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println("X = " + x);

        } else {
            double x1 = ( - b + Math.sqrt(d))/(2*a);
            double x2 = (- b - Math.sqrt(d) )/(2*a);
            System.out.println("X1 = " + x1 + ", X2 " + x2);

        }
       System.out.println("Thanks and goodbye!");
   }

}