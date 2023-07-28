package Home_Work_26.shape;

public class Circle extends Shape {
    public Circle(double radius) {
        super();
        this.side = radius;
    }


    public double calcArea() {
        return Math.PI * side * side;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * side;
    }
}

