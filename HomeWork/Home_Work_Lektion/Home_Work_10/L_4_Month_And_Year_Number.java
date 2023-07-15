package Home_Work_10;

import java.util.Scanner;


public class L_4_Month_And_Year_Number {
    public static void main(String[] args) {

//        Задача 4 (*)
//        Написать программу, которая принимает с клавиатуры номер месяца и год
//        и выводит на экран название месяца и количество дней в нем.
//        (повторение условного оператора)

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month number please: 1 - 12 ");
        int month = scan.nextInt();

        System.out.println("Enter year please");
        int year = scan.nextInt();

        String monthName;
        int daysInMonth;

        switch (month) {
            case 1:
                monthName = "January ";
                daysInMonth = 31;
                break;

            case 2:
                monthName = "February ";

                if (isLeapYear(year)){

                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            case 3:
                monthName = "March ";
                daysInMonth = 31;
                break;
            case 4:
                monthName = "April ";
                daysInMonth = 30;
                break;

            case 5:
                monthName = "May ";
                daysInMonth = 31;
                break;
            case 6:
                monthName = "June ";
                daysInMonth = 30;
                break;
            case 7:
                monthName = "July ";
                daysInMonth = 31;
                break;
            case 8:
                monthName = "August ";
                daysInMonth = 31;
                break;

            case 9:
                monthName = "September ";
                daysInMonth = 30;
                break;
            case 10:
                monthName = "October ";
                daysInMonth = 31;
                break;
            case 11:
                monthName = "November ";
                daysInMonth = 30;
                break;
            case 12:
                monthName = "December";
                daysInMonth = 31;
                break;
            default:
                monthName = "Wrong month number";
                daysInMonth = 0;


        }

        System.out.println("Name of the month: " + monthName);
        System.out.println("Number of days in a month: " + daysInMonth + " Days");
    }


    private static boolean isLeapYear(int year) {
        return ( year  % 4 == 0 && year % 100 > 0) || (year % 400 == 0 ) ;
    }
}

