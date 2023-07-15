package Home_Work_6;


public class L_1_String {
    public static void main(String[] args) {

//        Задача 1
//        Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!" Повторить практикум с этой строкой.


       // Распечатать последний символ строки.
        String st = "I'm proud to learn Java! Java is the most famous programming language!!!";
        char last = st.charAt(st.length() - 1);
        System.out.println("Last character of the string is: " + last);

        // Найти позицию подстроки “Java” в строке.
        //String st1 = "I'm proud to learn Java!";
        int index = st.indexOf("Java");
        System.out.println("The position of a substring in a string is: " + index);

       // Проверить, содержит ли заданная строка подстроку “Java”.
        boolean st2 = st.contains("Java");
        System.out.println ("Java: " + st2);

       // Заменить все символы “o” на “a”.
        String st3 = st.replace("o", "a");
        System.out.println(st3);

       // Преобразуйте строку к верхнему регистру.
        String st4 = st.toUpperCase();
        System.out.println(st4);

       // Преобразуйте строку к нижнему регистру.
        String st5 = st.toLowerCase();
        System.out.println(st5);

        // Вырезать строку Java c помощью метода String.substring().
        String st6 = st.substring(19, 23);
        System.out.println("Java: " + st6);

       // Вырезать строку Java c помощью метода substring().
        String st7 = st.substring(index,index + 4 );
        System.out.println ("Cut substring Java: " + st7);

        // Проверка окончания строки подстрокой "!!!"
       boolean st8 = st.endsWith("!!!");
       System.out.println("The string ends with '!!!': " + st8);

        // Проверить, начинается ли ваша строка подстрокой “I'm proud”.
        boolean st9 = st.startsWith("I'm proud");
        System.out.println("String starrts with: " + st9);



    }





    }

