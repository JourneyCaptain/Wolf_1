package Lektion_24.practice.wrapper;

public class WrapperClassesAppl {
    public static void main(String[] args) {

        // как найти кол-во цифр в числе - версия 2 (цикл делим число на 10 пока оно не кончится)

        System.out.println("=======Digits in  number======");
        Integer x = 1000;
        String st = x.toString();
        System.out.println(" Number of digits in " + x + " are " + st.length());
        Double y = 3275.58;
        String st1 = y.toString();
        System.out.println(" Number of digits in " + y + " are " + st1.length());

        // присвоения и вычисления

        System.out.println("=======Calculation======");
        int n = 20;
        Integer z = 10;
        System.out.println(n);
        System.out.println(z);
        z = z + 100;
        System.out.println(z);
        Double pi = 3.14;
        double circleLength = 2 * pi * 10;
        System.out.println(circleLength);

        // методы с константами классов

        System.out.println("=======Constance of Wrapper Classes======");
        System.out.println("Integer MAX " + Integer.MAX_VALUE);
        System.out.println("Integer MIN " + Integer.MIN_VALUE);
        System.out.println("Long MAX " + Long.MAX_VALUE);
        System.out.println("Double " + Double.MAX_VALUE);

        // как "обработать" деление на ноль?

        System.out.println("_______Not-aNumber  (NaN)________");
        double a = 20.0 / 0;
        if (Double.isInfinite(a) || Double.isNaN(a)) {
            System.out.println("Wrong operation or wrong result");
        }else {
            System.out.println(a);
        }
        // парсинг String to number (приведение строки к числу)

        String str1 = "987654";
        int num = Integer.parseInt(str1);
        System.out.println(num);
        String str2 = "2.7118281828";
        double exp = Double.parseDouble(str2);
        System.out.println(exp);

    }
}