package Lektion_4;

public class Decimal_Separator {
    public static void main(String[] args) {
        // операции с числами с плавающей запятой, с десятичным разделителем
        double a = 10.0d;
        double b = 7.0d;

        double c;
        c = a / b;
        System.out.println(c);

        System.out.printf("Результат деления: %.2f", c); // форматированный вывод
    }
}
