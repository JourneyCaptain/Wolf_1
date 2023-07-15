package Lektion_13;

public class Applicant_Grades {
    public static void main(String[] args) {
//
//        Задача 1.
//        Имеются оценки абитуриента из его аттестата, всего 12 оценок.
//        Найдите средний балл абитуриента.
        System.out.println("Average marks of students");

        int[] array = {5,3,3,4,5,3,4,5,4,5,3,3};
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }
        double result =  sum / array.length;
        System.out.printf("The average score of the applicant: %.2f " , result);
    }
}
