package Home_Work_13.part_1;

import java.util.Scanner;

public class L_1_Rectangle {
    public static void main(String[] args) {

        System.out.println("Введите длину прямоуголника ");
        Scanner scan = new Scanner(System.in);
        int number1 = scan. nextInt();
        System.out.println("Введите ширину прямоугольника ");
        int number2 = scan.nextInt();
        System.out.println("Периметр прямоугольника " +  (number1 + number2) * 2 );
        System.out.println ("Площадь прямоугольника "+ (number1*number2));



    }
}
