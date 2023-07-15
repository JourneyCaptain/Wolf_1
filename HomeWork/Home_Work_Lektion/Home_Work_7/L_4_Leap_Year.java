package Home_Work_7;

import java.util.Scanner;

public class L_4_Leap_Year {
    public static void main(String[] args) {

//        Задача 4 (*)
//        Написать программу, определяющую является ли год високосным.
//        Для того, чтобы быть високосным год должен:
//        делится без остатка на 4 и либо не должен делится без остатка на 100 либо
//        если он делится на 100, то он должен делится также на 400.

        System.out.print("Enter year please:");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();


        if (( a % 4 == 0 && a % 100 > 0) || (a % 400 == 0 )){
            System.out.println("---------------------");
            System.out.println("---------------------");
            System.out.println(a + " is a leap year.");
        } else {
            System.out.println(a + " is not a leap year.");
        }





//        boolean  b =  (( a  % 4 == 0 && a % 100 > 0) || (a % 400 == 0));
//        System.out.println(b);



    }
}
