package Home_Work_26.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    Square square;

    @BeforeEach
    void setUp() {
        square = new Square(5); // Создаем квадрат со стороной 5
    }

    @Test
    void calcArea() {
        double expectedArea = 5 * 5; // Ожидаемая площадь квадрата
        double actualArea = square.calcArea(); // Вычисленная площадь квадрата
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        double expectedPerimeter = 4 * 5; // Ожидаемый периметр квадрата
        double actualPerimeter = square.calcPerimeter(); // Вычисленный периметр квадрата
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}