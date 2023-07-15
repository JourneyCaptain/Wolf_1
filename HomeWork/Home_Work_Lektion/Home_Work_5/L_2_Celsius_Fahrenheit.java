package Home_Work_5;

import java.util.Scanner;

public class L_2_Celsius_Fahrenheit {
    public static void main(String[] args) {

//        Задача 2
//        Написать программу для перевода градусов по Фаренгейту в шкалу Цельсия.
//        Формула для перевода С = 5*(F-32)/9. Запросить у пользователя темпаратуру.

        System.out.println("I greet you ");

        System.out.print("Enter temperature in fahrenheit ");

        Scanner scan = new Scanner(System.in);
        double fahrenheit = scan.nextDouble();

        double c;
        c = 5*(fahrenheit-32)/9;
        System.out.printf("Temperature in degrees celsius %.2f ",c);


    }
}
