package Home_Work_22.code;

import java.util.Scanner;

public class Amoeba_2 {
    public static void main(String[] args) {

        //Задача 2. (цикл) Одноклеточная амёба каждые 3 часа делится на 2 такие же амёбы.
        // Необходимо определить, сколько будет амёб через n часов, если первоначально была только одна амёба.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the number of hours: ");
        int hours = scanner.nextInt();

        int amoebas = getAmoebasCount(hours);


        System.out.println("After " + hours + " hours will be " + amoebas + " amoebas.");
    }

    public static int getAmoebasCount(int hours) {
        int amoebas = 1;
        for (int i = 0; i < hours / 3; i++) {
            amoebas = amoebas * 2;
        }
        return amoebas;
    }
}