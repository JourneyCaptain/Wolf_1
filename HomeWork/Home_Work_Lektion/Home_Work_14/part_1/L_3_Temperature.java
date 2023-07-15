package Home_Work_14.part_1;

import java.util.Scanner;

public class L_3_Temperature {
    public static void main(String[] args) {
//        Задача 3
//        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
//        Вычислите среднюю температуру за неделю и выведете ее на печать.

        Scanner scan = new Scanner(System.in);

        double[] temperatures = new double[7];
        double sum = 0;

        System.out.println("Введите температуру за каждый день прошедшей недели:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Температура дня " + (i + 1) + ": ");
            temperatures[i] = scan.nextDouble();
            sum += temperatures[i];
        }

        double averageTemperature = sum / 7;

        System.out.println("Средняя температура за неделю: " + averageTemperature);

    }
}
