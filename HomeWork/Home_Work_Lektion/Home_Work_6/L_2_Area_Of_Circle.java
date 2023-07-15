package Home_Work_6;

import java.util.Scanner;

public class L_2_Area_Of_Circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the radius : ");
        double radius;
        radius = scanner.nextDouble();

        double area;
        area = calculateCircleArea(radius);
        System.out.printf("Area of a circle %.2f : " , area);
    }

    public static double calculateCircleArea(double radius) {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }
}









