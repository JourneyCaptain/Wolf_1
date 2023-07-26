package Home_Work_26.shape;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle(6);
    }

    @Test
    void calcArea() {
        // Ожидаемая площадь равностороннего треугольника
        double expectedArea = (Math.sqrt(3) / 4) * 6 * 6;

        // Вычисленная площадь треугольника с помощью метода calcArea()
        double actualArea = triangle.calcArea();

        // Сравниваем ожидаемое значение с фактическим значением
        assertTrue(expectedArea == actualArea);
    }

    @Test
    void calcPerimeter() {
        // Ожидаемый периметр равностороннего треугольника
        double expectedPerimeter = 3 * 6;

        // Вычисленный периметр треугольника с помощью метода calcPerimeter()
        double actualPerimeter = triangle.calcPerimeter();

        // Сравниваем ожидаемое значение с фактическим значением
        assertTrue(expectedPerimeter == actualPerimeter);
    }
}