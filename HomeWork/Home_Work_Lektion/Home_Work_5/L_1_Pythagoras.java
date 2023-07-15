package Home_Work_5;

import java.util.Scanner;

public class L_1_Pythagoras {
    public static void main(String[] args) {

//        Задача 1
//        Вычислите гипотенузу по двум катетам. Длину катетов запросите у пользователя.
//        Теорема Пифагора. Math.sqrt();
//
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length of the first leg (a): ");
        double a = scan.nextDouble();

        System.out.print("Enter the length of the second leg (b): ");
        double b = scan.nextDouble();

        // Вычисление гипотенузы с использованием теоремы Пифагора
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.printf("Hypotenuse length (c): %.2f ", c );



    }


    }

