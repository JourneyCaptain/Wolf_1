package Lektion_5;

import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        System.out.println("Как тебя звать? ");
        Scanner scan = new Scanner(System.in);
        String bot1 = scan.nextLine();
        System.out.println("Где ты живешь? ");
        String bot2 = scan.nextLine();
        System.out.println("Сколько тебе лет? ");
        int bot3 = scan.nextInt();

        System.out.println("Твоё имя: " + bot1 + ", ты проживаешь в " + bot2 + ", Тебе " + bot3 + " лет");


    }
}
