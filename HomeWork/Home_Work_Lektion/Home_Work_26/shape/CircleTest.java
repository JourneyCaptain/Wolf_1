package Home_Work_26.shape;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CircleTest {
    Circle circle;

    @BeforeEach
    void setUp() {
        circle = new Circle(10);
    }

    @Test
    void calcArea() {
        double expectedArea = Math.PI * 10 * 10;
        //assertEquals(314.15926535897932,circle.calcArea());
        double actualArea = circle.calcArea();
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        double expectedPerimeter = 2 * Math.PI * 10;
       // assertEquals(62.83185307179586,circle.calcPerimeter());
        double actualPerimeter = circle.calcPerimeter();
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}






