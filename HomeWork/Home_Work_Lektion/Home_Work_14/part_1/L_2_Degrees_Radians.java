package Home_Work_14.part_1;

import java.util.Scanner;

public class L_2_Degrees_Radians {
    public static void main(String[] args) {

//        Задача 2
//        Напишите приложение, которое переводит радианы в градусы. Радианы - это число типа double.

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите значение в радианах: ");
        double radians = scan.nextDouble();

        double degrees = Math.toDegrees(radians);

        System.out.println("Значение в градусах: " + degrees);



      }
    }



