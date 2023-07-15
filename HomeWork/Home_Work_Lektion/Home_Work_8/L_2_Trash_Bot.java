package Home_Work_8;

import java.util.Scanner;

public class L_2_Trash_Bot {
    public static void main(String[] args) {


//        Задача 2
//        Используя оператор switch ... case написать бот,
//        который помогает выбрасывать мусор в баки разных цветов:
//
//        упаковки в желтый бак
//        пищевые отходы в коричневый бак
//        бумага в зеленый бак
//        прочие отходы в черный бак

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("====================");

        System.out.println("packaging, foodwaste, paper, other. ");

        System.out.println("____________________");
        System.out.print("Enter the operation: ");

        String operation = scanner.next();

        switch (operation) {
            case "packaging": {
                System.out.println("Put the packaging in the yellow bin.");
                break;
            }
            case "foodwaste": {
                System.out.println("Put the food waste in the brown bin.");
                break;
            }
            case "paper": {
                System.out.println("Put the paper in the green bin.");
                break;
            }
            case "other": {
                System.out.println("Put other waste in the black bin.");
                break;
            }
            default: {
                System.out.println("wrong input ");

            }
        }
    }
}



