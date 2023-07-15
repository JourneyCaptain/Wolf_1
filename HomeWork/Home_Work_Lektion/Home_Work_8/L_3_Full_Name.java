package Home_Work_8;

import java.util.Scanner;


public class L_3_Full_Name {
    public static void main(String[] args) {


          // Задача 3
          // Написать программу, в которую пользователь вводит имя и фамилию в одну строку через пробел.
          // Программа должна выводить имя и фамилию на разных строках.
          // Первая буква имени и фамилии больжны быть большими не зависимо от того,
          // как их ввел пользователь, лишние пробелы должны быть удалены.
          // (повторение методов String)


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();
        // Удаление лишних пробелов
        fullName = fullName.trim();

        // Поиск индекса первого пробела
        int spaceIndex = fullName.indexOf(" ");

        if (spaceIndex != -1) {
            // Извлечение имени и фамилии
            String firstName = fullName.substring(0, spaceIndex);

            String lastName = fullName.substring(spaceIndex + 1);

            // Преобразование первой буквы в имени и фамилии в верхний регистр
            firstName = firstName.substring(0, 1).toUpperCase()
                    + firstName.substring(1);

            lastName = lastName.substring(0, 1).toUpperCase()
                    + lastName.substring(1);

            System.out.println("FirstName: " + firstName);
            System.out.println("LastName: " + lastName);
        } else {
            System.out.println("Invalid input. Please enter both first name and last name. ");
        }


    }
}

