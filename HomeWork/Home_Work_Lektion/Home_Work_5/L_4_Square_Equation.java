package Home_Work_5;

import java.util.Scanner;


public class L_4_Square_Equation {
    public static void main(String[] args) {

//
//        Задача 4 (*)
//        Напишите приложение для решения квадратного уравнения,
//        корни уравнения ищутся по коэффициентам a, b и с.
//        Коэффициенты запросить у пользователя.

//        Scanner scan = new Scanner(System.in);
//
//        System.out.print(" Enter coefficient (a)");
//        double a = scan.nextDouble();
//
//        System.out.print(" Enter coefficient (b)");
//        double b = scan.nextDouble();
//
//        System.out.print(" Enter coefficient (c)");
//        double c = scan.nextDouble();
//
//
//        double dis = b * b - 4 * a * c;
//
//        System.out.println("Discriminant " + dis);
//
//            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
//            double x2 = (-b - Math.sqrt(dis)) / (2 * a);
//
//            System.out.println(" Root 1 " + x1);
//            System.out.println(" Root 2 " + x2);





//        double a = 5;
//        double b = 9;
//        double c = 4;

        // double discriminant = b * b - 4 * a * c;
       // ax²+bx+c=0











        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter coefficient (a)");
        double a = scan.nextDouble();

        System.out.print(" Enter coefficient (b)");
        double b = scan.nextDouble();

        System.out.print(" Enter coefficient (c)");
        double c = scan.nextDouble();


        double dis = b * b - 4 * a * c;

        System.out.println("Discriminant " + dis);
        if (dis > 0) {
            double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            double x2 = (-b - Math.sqrt(dis)) / (2 * a);

            System.out.println(" Root 1 " + x1);
            System.out.println(" Root 2 " + x2);
        } else if (dis==0) {
            double x = (-b)/ (2 * a);

            System.out.println(" Root " + x);

        } else {
            System.out.println("Discriminant less than zero-the equation has no solutions:");
        }


//        System.out.println(3+2);
//
//        System.out.println(Math.pow(3,4));
//        System.out.println(3*3*3*3);










            }
}
