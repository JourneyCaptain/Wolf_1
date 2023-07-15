package Home_Work_14.part_1;

import java.util.Scanner;

public class L_1_Square_Area {
    public static void main(String[] args) {

        // Задача 1
        // Вычислите площадь квадрата и объем куба со стороной а. Значение a запросить у пользователя.

//        Scanner scan = new Scanner (System.in);
//
//        System.out.println("Введи Площадь квадрата:");
//        int a = scan.nextInt();
//
//        System.out.println("Площадь квадрата:"+(Math.pow(a,2 )));         //  //(a*a)
//        System.out.println("Обьем куба:"+ (Math.pow(a,3)));           //(a*a*a)

//        int a = 6;
//        int b = 6;
//        int c = 6 ;


//        System.out.println("Площадь кварата:"+ (a*a));
//        System.out.println("Обьем куба:"+(a*a*a));

//        int n = 2;
//        int k = 10;
//        int pow2 = (int) Math.pow(n, k);
//        System.out.println(pow2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение стороны a: ");
        double a = scanner.nextDouble();

        double squareArea = a * a;
        double cubeVolume = Math.pow(a, 3);

        System.out.println("Площадь квадрата: " + squareArea);
        System.out.println("Объем куба: " + cubeVolume);

    }
}
