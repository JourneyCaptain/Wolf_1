package Lektion_4;

public class Remainder_Of_The_Division {
    public static void main(String[] args) {


        int x = 57;
        int y = 10;

        int z;
        z = x / y;
        System.out.println("Частное " + x + " и " + y + " = " + z);

        int zz;
        zz = x % y; // получаем остаток от деления
        System.out.println("Остаток от деления " + x + " на " + y + " = " + zz);

        int x1 = 3;
        int y1 = 10;

        int z1;
        z1 = x1 / y1;
        System.out.println("Частное " + x1 + " и " + y1 + " = " + z1);

        int zz1;
        zz1 = x1 % y1;
        System.out.println("Остаток от деления " + x1 + " на " + y1 + " = " + zz1);

        int a = 12;
        System.out.println(a % 4); // деление с остатком
        System.out.println(a % 6); // деление с остатком
        // когда число разделилось нацело, то остаток от деления = 0
    }
}
