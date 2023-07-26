package Home_Work_26.shape;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle();
    }

    @Test
    void calcArea() {
        Circle circle = new Circle(10);
        double expectedArea = Math.PI * 10 * 10;
        double actualArea = circle.calcArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        Circle circle = new Circle(10);
        double expectedPerimeter = 2 * Math.PI * 10;
        double actualPerimeter = circle.calcPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}






