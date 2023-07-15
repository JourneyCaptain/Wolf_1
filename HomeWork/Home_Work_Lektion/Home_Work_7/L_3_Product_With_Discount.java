package Home_Work_7;

import java.util.Scanner;

public class L_3_Product_With_Discount {
    public static void main(String[] args) {

        // Задача 3
        // Сделайте расчет покупки товаров со скидками. Стоимость,
        // количество товаров и скидку на них вводит пользователь.
        // Товар А стоит X руб и на него скидка D%, а товар B стоит Y руб и на него скидка С%.
        // Клиент взял N товаров A и M товаров B.
        // Программа не должна допускать ввода отрицательных чисел.
        // Выведите итоговую стоимость покупки и полученной скидки.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Print the Cost of products  A: ");
        float a = yourNumber(scanner);

        System.out.println("Print the discount for product A in percent: ");
        float b  = yourNumber(scanner);

        System.out.println("Print the number of products A: ");
        float c  = yourNumber(scanner);

        System.out.println("Print the Cost of products  B: ");
        float a1 = yourNumber(scanner);

        System.out.println("Print the discount for product B in percent: ");
        float b1  = yourNumber(scanner);

        System.out.println("Print the number of products B: ");
        float c1  = yourNumber(scanner);


        float priceA = a * c;
        float priceB = a1 * c1;
        float discountValueA = priceA * b / 100;
        float discountValueB = priceB * b1 / 100;
        float totalA = priceA - discountValueA;
        float totalB = priceB - discountValueB;
        float total = totalA + totalB;

        System.out.println("Total cost of product A with discount: " + totalA);
        System.out.println("Total cost of product B with discount: " + totalB);
        System.out.println("Total cost of product A and B with discount: " + total);


    }

    public static float yourNumber(Scanner scanner) {
        float input = scanner.nextFloat();
        if (input < 0) {
            System.out.println("Error: Enter a positive number.");
            System.out.print("Please re-enter: ");
            input = scanner.nextFloat();

        }
        return input;
        
    }

}




//       System.out.println("Discount for goods");
//
//               Scanner scanner = new Scanner(System.in);
//               System.out.println("Input price: ");
//               double price = scanner.nextDouble();
//
//               if (price <= 0) {
//               System.out.println("Wrong input ");
//               } else {
//               System.out.println("Good price!");
//               }
//
//               }
//               }
//



//        System.out.println("Print the Cost of products  A: ");
//                float a = scanner.nextFloat();
//                if (a < 0) {
//        System.out.println("Ошибка: введите положительное число.");
//        System.out.print("Повторите ввод: ");
//        return;
//
//        } else {
//
//        System.out.println("Print the number of products A: ");
//        }
//        float b = scanner.nextFloat();
//        if (b < 0) {
//
//        System.out.println("This number  is odd.");
//        return;
//        } else {
//        System.out.println("Print the discount for product A in percent: ");
//        }
//
//
//        float c = scanner.nextFloat();
//
//
//        System.out.println("Print the Cost of products  B:: ");
//        float a1 = scanner.nextFloat();
//
//        System.out.println("Print the number of products B: ");
//        float b1 = scanner.nextFloat();
//
//        System.out.println("Print the discount for product B in percent: ");
//        float c1 = scanner.nextFloat();
//
//
//        if (a + b + c < 0) {
//
//
//
//        return;
//
//        } else {
//
//
//        float price = a * b, priceB = a1 * b1;
//        float rabat = (b * a) * 10 / 100, rabatB = (a1 * b1) * 10 / 100;
//
//        float total = price - rabat, totalB = priceB - rabatB;
//
//
//        System.out.println("итоговую стоимость товара (A) со скидкой: " + total);
//        System.out.println("итоговую стоимость товара (B) со скидкой : " + totalB);
//        System.out.println("итоговую стоимость товара (A+B) со скидкой " + (total + totalB));
//
//          private static float pokupky (Scanner scanner) {
//        float input = scanner.nextFloat();
//        if (input < 0) {
//            System.out.println("Ошибка: введите положительное число.");
//            System.out.print("Повторите ввод: ");
//            input = pokupky (scanner);
//        }
//        return input;
//    }
//
//
//}
