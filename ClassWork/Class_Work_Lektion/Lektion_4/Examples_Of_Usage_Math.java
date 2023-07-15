package Lektion_4;

public class Examples_Of_Usage_Math {
    public static void main(String[] args) {
        // примеры использования Math

        int x, y;
        x = 135;
        y = 213;

        int z = Math.max(x, y);
        System.out.println("Максимальное из " + x + " и " + y + " = " + z);

        int z1 = Math.min(x, y);
        System.out.println("Минимальное из " + x + " и " + y + " = " + z1);

        int a = -321;
        System.out.println(Math.abs(a)); // модуль числа a

        int b = 512;
        System.out.println(Math.abs(b)); // модуль числа b

        int n = 2;
        int k = 10;
        int pow2 = (int) Math.pow(n, k); // возведение в степень
        System.out.println(pow2);// целое число
        double pow2d = Math.pow(n, k);
        System.out.println(pow2d); // дробное число

        System.out.println(Math.PI); // число Пи

        double s = Math.sqrt(10000.0d); // извлечение квадратного корня
        System.out.println(s);
    }
}
