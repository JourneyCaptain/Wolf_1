package Lektion_3;

import java.util.Scanner;

public class arithmetics2 {
    public static void main(String[] args) {

//        Написать программу для вычисления средней стомости поездки по транспортному проездному.
//        Попросить пользователя ввести стоимость проездного на месяц
//        и количество рабочих дней в месяце. Считая, что в рабочий день в среднем две поездки,
//        и 1.5 поездки в выходной, посчитать и округлить общее число поездок в месяц
//        и посчитать среднюю стоимость одной поезд

         //Программирование задачи на вычисления


        Scanner scan = new Scanner(System.in);

        System.out.println("Input cost of ticket: ");
        double priceMonatKarte = scan.nextDouble();

        System.out.println("Input number of working days in current month: ");
        int workingDays = scan.nextInt();

        int trip = workingDays * 2;
        int holydays = 31 - workingDays;

        int holydayTrip =(int) Math.round(1.5 * holydays);

      //  trip = trip + holydayTrip;
        int trips = 0;
        trips = trip + holydayTrip;

       double averageTripPrice = priceMonatKarte/trips;

       // System.out.println("Average price = " + averageTripPrice);

        System.out.printf ("Average price = %.2f", averageTripPrice );


        System.out.println(" Number of trips in May: " + trips);











    }
}

//       //vicesliti dliny okrujnosti i ploseady radiusa
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Calculate length and area of circle");
//
//        System.out.println("Imput radius of circle: ");
//        double radius = scan.nextDouble();
//
//        double l = 2 * Math.PI * radius;
//
//        double s = Math.PI * radius * radius;
//
//        float s1 =(float) (Math.PI * Math.pow(radius, 2));
//
//        System.out.println( " Length of circle: " + l);
//        System.out.println( " Area of circle: " + s);
//        System.out.println( " Area of circle: " + s1);















// Сумма углов в треугольнике = 180 гра

//        System.out.println("Введите первый угол");
//        int alfa = scan.nextInt();
//
//        System.out.println("Введите второй угол");
//        int alfa2 = scan.nextInt();
//
//        int alfa3 = 180 - alfa - alfa2;
//
//        System.out.println("tretii ugol v treugolnik " + alfa3);
