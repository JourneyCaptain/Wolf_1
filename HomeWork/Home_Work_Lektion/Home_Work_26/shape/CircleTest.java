package Home_Work_26.shape;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(expectedArea, actualArea, 0.0001); // Допустимая погрешность 0.0001
    }

    @Test
    void calcPerimeter() {
        Circle circle = new Circle(10);
        double expectedPerimeter = 2 * Math.PI * 10;
        double actualPerimeter = circle.calcPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 0.0001); // Допустимая погрешность 0.0001
    }
}







