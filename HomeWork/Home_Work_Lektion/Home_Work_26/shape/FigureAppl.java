package Home_Work_26.shape;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4]; //массив фигур
        shapes[0] = new Circle(10.0);
        shapes[1] = new Circle(3.0);
        shapes[2] = new Triangle(4.0);
        shapes[3] = new Square(6.0);

        double totalArea = 0.0;
        double totalPerimeter = 0.0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].calcArea();
            totalPerimeter += shapes[i].calcPerimeter();
        }

        System.out.printf("  Total Area: %.2f %n  " , totalArea);
        System.out.printf("Total Perimeter: %.2f  " , totalPerimeter);
        System.out.println();
        System.out.printf("  Area: %.2f " , shapes [0].calcPerimeter());
    }
}
