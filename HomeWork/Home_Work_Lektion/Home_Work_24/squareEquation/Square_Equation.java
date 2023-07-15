package Home_Work_24.squareEquation;
public class Square_Equation {
    //Задача 2. Оформить решение квадратного уравнения как класс с необходимыми методами,
    // в решении использовать переменные типа классов-оберток, сделать необходимые тесты.
    private Double a;
    private Double b;
    private Double c;
    public Square_Equation(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public String solve() {
        if (a == 0) {
            return "Not a quadratic equation";//В данной строке происходит проверка условия a == 0, то есть проверка,
            // является ли коэффициент a равным нулю. Если условие выполняется (коэффициент a равен нулю),
            // то возвращается строка "Not a quadratic equation",
            // a равно нулю, это означает, что уравнение не является квадратным.
            // Эта проверка необходима, так как в квадратном уравнении при делении на коэффициент a может возникнуть деление на ноль,
            // что приведет к ошибке. Поэтому в случае, когда a равно нулю,
            // нет смысла продолжать решение уравнения и сразу возвращается сообщение о отсутствии решений.
        }
        Double dis = b * b - 4 * a * c;

        if (dis > 0) {
            Double x1 = (-b + Math.sqrt(dis)) / (2 * a);
            Double x2 = (-b - Math.sqrt(dis)) / (2 * a);
            return "Discriminant " + dis + " Root 1 " + x1 + " Root 2 " + x2;

        } else if (dis == 0) {
            Double x = (-b) / (2 * a);
            return " Root " + x;

        } else {
            return "Discriminant less than zero-the equation has no solutions:";
        }
    }

}