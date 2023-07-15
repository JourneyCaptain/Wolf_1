package Home_Work_5;

import java.util.Scanner;

public class L_3_Heron {
    public static void main(String[] args) {

//        Задача 3
//        Вычислите площадь треугольника по формуле Герона:
//        p = (a + b + с)/2; S = sqrt(p*(p-a)(p-b)(p-c));

        Scanner scan = new Scanner(System.in);
        System.out.print( "Enter side length (a) ");
        double sideA = scan.nextDouble();


        System.out.print("Enter side length (b) ");
        double sideB = scan.nextDouble();

        System.out.print("Enter side length (c) ");
        double sideC= scan.nextDouble();

        double p = (sideA + sideB + sideC)/2;
        double s = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));

        System.out.printf("Area of triangle %.2f",s );





    }
}
