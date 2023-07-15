package Home_Work_9;

import java.util.Scanner;

public class L_3_Target_Mileage {
    public static void main(String[] args) {

        // Задача 3
        //В первый день спортсмен пробежал s километров,
        // а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
        // Определите номер дня, на который пробег спортсмена составит не менее target километров.
        // Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.



        Scanner scanner = new Scanner(System.in);

        System.out.print(" Enter the initial mileage (in km): ");
        double s = scanner.nextInt();
        System.out.println("-----------------------------------------");
        System.out.print(" Enter the target mileage (in km): ");
        double target = scanner.nextInt();

        int day = 1;
        while (s < target) {
            // s = s + s * 10/100;
            // s = s * 1.1;
            s = s + s * 0.1;
            day++;
        }

        System.out.println("--------------------------------------");

        System.out.printf( " Target mileage is: %.0f %s %n " , target , " Km ");
        System.out.println("Number of days to reach the goal is: " + day + " Days");
    }
}



