package Home_Work_14.part_1;//import java.util.Scanner;

public class L_4_Shopping_Discount {
    public static void main(String[] args) {

       // Задача 4
       // Пусть цена товара A обычно составляет 1000 евро, и товара B составляет 500 евро.
       // Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
        // Выведите на экран стоимость суммы A + B со скидкой.
        // Отдельно выведите на экран абсолютную величину скидки для этой покупки.

       // Scanner scan = new Scanner(System.in);
//        int a = scan. nextInt();
//        int b = scan. nextInt();
//
////        int a = 1000;
////        int b = 500;
////        int c = 150;
//
//        System.out.println(a + b  );
//        System.out.println(  (a+b) *10/100);

//        System.out.println("Inter your summa A");
//        int a = scan.nextInt();
//        System.out.println("Inter your summa B");
//        int b = scan.nextInt();
//        int c =  (a+b)*10/100;
//        System.out.println("Стоимость суммы A + B со скидкой: " + (a+b-c +" $"));
//        System.out.println("абсолютная величина скидки:  "+ (a+b)*10/100);     //(a+b)*10/100


        double priceA = 1000.0;
        double priceB = 500.0;
        double discountRate = 0.1;

        double totalPrice = priceA + priceB;
        double discountAmount = totalPrice * discountRate;
        double discountedPrice = totalPrice - discountAmount;

        System.out.println("Общая стоимость покупки (A + B): " + totalPrice + " Euro");
        System.out.println("Скидка на покупку: " + discountAmount + " Euro");
        System.out.println("Итоговая стоимость со скидкой: " + discountedPrice + " Euro");



    }
}
