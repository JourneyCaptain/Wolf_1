package Home_Work_13.part_1;



import java.util.Scanner;

public class L_3_Five_digit_Number {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите  пятизначное число :");
        int number = scan.nextInt();


        System.out.println((number%100000)/10000);
        System.out.println((number%10000)/1000);
        System.out.println((number%1000)/100);
        System.out.println((number%100)/10);
        System.out.println((number%10));





    }
}
