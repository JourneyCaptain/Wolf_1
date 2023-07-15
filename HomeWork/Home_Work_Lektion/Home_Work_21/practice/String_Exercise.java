package Home_Work_21.practice;

public class String_Exercise {
    public static void main(String[] args) {
//        Задча 1.
//        Выполнить все упражнения, которые мы делали на занятии со строкой.
//        В качестве примера строки взять свое слово или короткое предложение,
//        например, "Меня зовут Имя и Фамилия".

        String str = "My name is Iwan Iwanow ";
        System.out.println(str.length()); //возвращает колличество символов в стринге;

        String str1 = "My name is Iwan Iwanow ";//возвращает символ находящийся на данной позиции (нумерация позиций начинается с нуля);
        System.out.println(str1.charAt(5));

        String str2 = "My name is Iwan Iwanow ";//возвращает символ находящийся на данной позиции (нумерация позиций начинается с нуля);
        for (int i = 0; i <=5; i++) {
            System.out.print(str2.charAt(i));

        }
        System.out.println();
        String st = "My name is Iwan Iwanow ";
        String st1 = "my name is iwan iwanow ";
        System.out.println(st.equalsIgnoreCase( st1));//сравнивает стринги игнорируя разницу между большими и маленькими буквами;


        String str4 = "My name is Iwan Iwanow ";
        System.out.println(str4.toUpperCase());//возвращает строку в верхнем, или нижнем регистре соответственно;
        String str5 = "My name is Iwan Iwanow ";
        System.out.println(str5.toLowerCase());


        String str6 = "My name is Iwan Iwanow ";
        System.out.println(str6.indexOf("n"));// возвращают позицию первой найденной строки или символа в стринге начиная искать с начала (indexOf)

        String str7 = "My name is Iwan Iwanow ";
        System.out.println(str7.lastIndexOf(""));// или с конца (lastIndexOf), могут искать также начиная с заданной позиции indexOf(String str, int pos);

        String str8 = "My name is Iwan Iwanow ";
        System.out.println(str8.substring(2 ));// возвращает часть стринга (подстроку), начиная с позиции start, и заканчивая позицией end

        String str9 = "My name is Iwan Iwanow ";
        System.out.println(str9.substring(2,20));//при этом символ стоящий на стартовой позиции будет включен в результирующую строку, а символ стоящий на позиции end не включен;

        String str10 = "My name is Iwan Iwanow ";
        String str11 = "Iwan ";
        String str12 = "John ";
        System.out.println(str10.replace(str11,str12));//заменяет все найденные в стринге строки str1 на str2;

        String str13 = "          My name is Iwan Iwanow         ";
        System.out.println(str13);
        System.out.println(str13.trim());//убирает пробелы в начале и в конце строки;

        String str14 = "My name is Iwan Iwanow ";
        System.out.println();
        System.out.println("String: " + str);

        String[] words = str14.split(" ");//разделяет строку, результат помещает в массив типа String.
        int n = words.length;
        System.out.println();
        System.out.println("Quantity of words in string: " + n);
        for (int i = 0; i < words.length; i++) {

            System.out.print(words[i] + " ");

        }
        String[] simbols = str14.split("");
        int m = simbols.length;
        System.out.println();
        System.out.println("\nQuantity of simbols in string: " + m);
        for (int i = 0; i < simbols.length; i++) {
            System.out.print(simbols[i] + " | ");


        }

    }
}