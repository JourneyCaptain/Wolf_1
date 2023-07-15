package Lektion_21.practice.string;

public class Practice_String {
    public static void main(String[] args) {

        String str = "Ich liebe Java sehr stark!";
        System.out.println();
        System.out.println("String: " + str);

        String[] words = str.split(" ");
        int n = words.length;
        System.out.println();
        System.out.println("Quantity of words in string: " + n);
        for (int i = 0; i < words.length; i++) {

            System.out.print(words[i] + " ");

        }
        String[] simbols = str.split("");
        int m = simbols.length;
        System.out.println();
        System.out.println("\nQuantity of simbols in string: " + m);
        for (int i = 0; i < simbols.length; i++) {
            System.out.print(simbols[i] + " | ");
            
        }
    }
}