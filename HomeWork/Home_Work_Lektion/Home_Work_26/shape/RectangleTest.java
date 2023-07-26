package Home_Work_26.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle;
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(6.0, 4.0);
    }

    @Test
    void getWidth() {
        double expectedWidth = 4.0;
        double actualWidth = rectangle.getWidth();
        assertTrue(expectedWidth == actualWidth);
    }

    @Test
    void setWidth() {
        double newWidth = 5.0;
        rectangle.setWidth(newWidth);
        double actualWidth = rectangle.getWidth();
        assertTrue(newWidth == actualWidth);
    }

    @Test
    void calcArea() {
        double expectedArea = 6.0 * 4.0;
        double actualArea = rectangle.calcArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        double expectedPerimeter = 2 * (6.0 + 4.0);
        double actualPerimeter = rectangle.calcPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}