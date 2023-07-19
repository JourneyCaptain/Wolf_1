package Home_Work_26.shape;

public class Triangle extends Shape {
    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double calcArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    @Override
    public double calcPerimeter() {
        return 3 * side;
    }
}