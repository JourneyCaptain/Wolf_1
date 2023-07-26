package Home_Work_26.shape;

public class Rectangle extends Shape {
    private double width; // Ширина прямоугольника

    public Rectangle(double length, double width) {
        super(length);
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calcArea() {
        return getSide() * width;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (getSide() + width);
    }
}

