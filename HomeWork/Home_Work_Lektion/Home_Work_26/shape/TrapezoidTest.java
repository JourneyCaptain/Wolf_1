package Home_Work_26.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrapezoidTest {
    Trapezoid trapezoid;
    @BeforeEach
    void setUp() {
        trapezoid = new Trapezoid(5.0, 8.0, 4.0);
    }

    @Test
    void getUpperWidth() {
        double expectedUpperWidth = 8.0;
        double actualUpperWidth = trapezoid.getUpperWidth();
        assertTrue(expectedUpperWidth == actualUpperWidth);
    }

    @Test
    void setUpperWidth() {
        double newUpperWidth = 9.0;
        trapezoid.setUpperWidth(newUpperWidth);
        double actualUpperWidth = trapezoid.getUpperWidth();
        assertTrue(newUpperWidth == actualUpperWidth);
    }

    @Test
    void getHeight() {
        double expectedHeight = 4.0;
        double actualHeight = trapezoid.getHeight();
        assertTrue(expectedHeight == actualHeight);
    }

    @Test
    void setHeight() {
        double newHeight = 5.0;
        trapezoid.setHeight(newHeight);
        double actualHeight = trapezoid.getHeight();
        assertTrue(newHeight == actualHeight);
    }

    @Test
    void calcArea() {
        double expectedArea = 0.5 * (5.0 + 8.0) * 4.0;
        double actualArea = trapezoid.calcArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        double sideA = 5.0;
        double sideB = 8.0;
        double sideC = Math.sqrt((sideA - sideB) * (sideA - sideB) + 4.0 * 4.0);
        double expectedPerimeter = sideA + sideB + 2 * sideC;
        double actualPerimeter = trapezoid.calcPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}