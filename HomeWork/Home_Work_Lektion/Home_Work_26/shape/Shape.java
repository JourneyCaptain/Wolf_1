package Home_Work_26.shape;

import java.util.Objects;
 public abstract class Shape {

//    Задача 2.
//
//    Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//    Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
//    Напишите класс FigureAppl с методом main. В методе создайте массив фигур.
//    Добавьте в массив два круга, один треугольник и один квадрат.
//    Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
    protected double side; //объявление защищенного (protected) поля класса

    public Shape(double side) {
        this.side = side;
    }// конструктор класса Shape.
    //Конструкторы используются для инициализации объектов класса при их создании.
    // Конструкторы имеют то же имя, что и класс, и не возвращают никакого значения.
    public Shape() {//конструктор класса Shape без аргументов.
        //Конструкторы без аргументов, такие как этот,
        // называются конструкторами по умолчанию.
        // Они используются для создания объектов класса
        // без необходимости передачи аргументов инициализации.

    }
       //Метод Гетер и Сеттер
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Shape shape)) return false;
        return Double.compare(shape.side, side) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }

    public abstract double calcArea();
    public abstract double calcPerimeter();
}



