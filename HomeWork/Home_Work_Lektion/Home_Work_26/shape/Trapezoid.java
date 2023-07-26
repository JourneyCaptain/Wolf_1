package Home_Work_26.shape;

public class Trapezoid extends Shape{
    private double upperWidth; // Верхнее основание трапеции
    private double height; // Высота трапеции

    public Trapezoid(double lowerWidth, double upperWidth, double height) {
        super(lowerWidth);
        this.upperWidth = upperWidth;
        this.height = height;
    }

    public double getUpperWidth() {
        return upperWidth;
    }

    public void setUpperWidth(double upperWidth) {
        this.upperWidth = upperWidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * (getSide() + upperWidth) * height;
    }

    @Override
    public double calcPerimeter() {
        double sideA = getSide();
        double sideB = upperWidth;
        double sideC = Math.sqrt((sideA - sideB) * (sideA - sideB) + height * height);
        return sideA + sideB + 2 * sideC;
    }
}

