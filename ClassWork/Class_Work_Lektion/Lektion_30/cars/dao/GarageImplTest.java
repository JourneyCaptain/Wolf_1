package Lektion_30.cars.dao;

import Lektion_30.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
Garage garage;
Car[] cars = new Car[6];


    @BeforeEach
    void setUp() {
        garage = new  GarageImpl(10);
        cars[0] = new Car("BV 100","Audi", "BVB", 2.0, "Silver");
        cars[1] = new Car("BV 101","Mercedes", "BVG",3.5, "Blue");
        cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White");
        cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue" );
        cars[4] = new Car("BV 104", "Mercedes", "RIT", 4.0, "Gray");
        cars[5] = new Car("BV 105", "Audi", "BVG", 5.0, "Black");
        for (int i = 0; i < cars.length; i++) {
            garage.addCar(cars[i]);// позволяет добавить машину с указанными характеристиками в гараж.
        }
    }

    @Test
    void addCar() {
        assertEquals(6, garage.size());
        assertFalse(garage.addCar(null));//Нельзя добавить "пустую"  машину.
        assertFalse(garage.addCar(cars[0]));// Машина с таким номером уже есть в гараже.
        Car car1 = new Car("BV 106", "VW", "BIR", 3.0, "Blue");
        assertTrue(garage.addCar(car1));// Успешное добавление новой машины.
        assertEquals(7,garage.size());
    }

    @Test
    void removeCar() {
        assertEquals(6, garage.size());
        assertNull(garage.removeCar("BV 200")); // Машина с таким номером отсутствует в гараже.
        Car removedCar = garage.removeCar("BV 101");
        assertNotNull(removedCar);// Проверяем, что удаленная машина не равна null
        assertEquals("Mercedes", removedCar.getModel());
        assertEquals(5, garage.size());// После удаления одной машины размер должен уменьшиться на 1
        assertNull(garage.findCarByRegNumber("BV 101")); // Проверяем, что машина была удалена.

    }

    @Test
    void findCarByRegNumber() {
        Car foundCar = garage.findCarByRegNumber("BV 102");
        assertNotNull(foundCar); // Проверяем, что машина была найдена
        assertEquals("Opel", foundCar.getModel());
        assertNull(garage.findCarByRegNumber("BV 200")); // Машина с таким номером отсутствует в гараже.
    }

    @Test
    void findCarsByModel() {
        Car[] audiCars = garage.findCarsByModel("Audi");
        assertEquals(2, audiCars.length);
        assertArrayEquals(new Car[]{cars[0],cars[5]},audiCars);


        Car[] bmwCars = garage.findCarsByModel("BMW");
        assertEquals(1, bmwCars.length);
        assertArrayEquals(new Car[]{cars[3]},bmwCars);

        Car[] ladaCars = garage.findCarsByModel("Lada");
        assertEquals(0, ladaCars.length);
        assertArrayEquals(new Car[]{},ladaCars);// Машин марки lada нет в гараже.
    }

    @Test
    void findCarsByCompany() {
        Car[] bvgCars = garage.findCarsByCompany("BVG");
        assertEquals(2, bvgCars.length);
        assertArrayEquals(new Car[]{cars[1],cars[5]},bvgCars);


        Car[] bsrCars = garage.findCarsByCompany("BSR");
        assertEquals(1, bsrCars.length);
        assertArrayEquals(new Car[]{cars[2]},bsrCars);


        Car[] tirCars = garage.findCarsByCompany("TIR");
        assertEquals(0, tirCars.length);
        assertArrayEquals(new Car[]{},tirCars); // Машин от компании BIR нет в гараже.
    }

    @Test
    void findCarsByEngine() {
        Car[] foundCars = garage.findCarsByEngine(1.8, 2.0);
        assertEquals(2, foundCars.length);
        assertArrayEquals(new Car[]{cars[0], cars[2]},foundCars);

        foundCars = garage.findCarsByEngine(0.0, 2.8);
        assertEquals(3,foundCars.length);
        assertArrayEquals(new Car[]{cars[0],cars[2],cars[3]},foundCars);

        foundCars = garage.findCarsByEngine(5.5, 6.5);
        assertEquals(0, foundCars.length);
        assertArrayEquals(new Car[]{},foundCars);

    }
    @Test
    void findCarsByColor() {
        Car[] silverCars = garage.findCarsByColor("Silver");
        assertEquals(1, silverCars.length);
        assertArrayEquals(new Car[]{cars[0]},silverCars);

        Car[] blueCars = garage.findCarsByColor("Blue");
        assertEquals(2, blueCars.length);
        assertArrayEquals(new Car[]{cars[1],cars[3]},blueCars);


        Car[] redCars = garage.findCarsByColor("Red");
        assertEquals(0, redCars.length);
        assertArrayEquals(new Car[]{},redCars); // Машин красного цвета нет в гараже.
    }
}

//package Lektion_30.cars.dao; // Объявление пакета, в котором находится класс GarageImplTest
//
//import Lektion_30.cars.model.Car; // Импорт класса Car из пакета Lektion_30.cars.model
//import org.junit.jupiter.api.BeforeEach; // Импорт аннотации BeforeEach из библиотеки JUnit
//import org.junit.jupiter.api.Test; // Импорт аннотации Test из библиотеки JUnit
//
//import static org.junit.jupiter.api.Assertions.*; // Импорт всех статических методов из класса Assertions из библиотеки JUnit
//
//class GarageImplTest { // Объявление тестового класса GarageImplTest
//
//    Garage garage; // Объявление переменной garage типа Garage
//    Car[] cars = new Car[7];; // Объявление массива cars размером 7 элементов
//
//    @BeforeEach // Аннотация BeforeEach - метод, помеченный этой аннотацией, будет выполняться перед каждым тестовым методом
//    void setUp() { // Начало определения метода setUp
//        garage = new GarageImpl(10); // Создание объекта garage типа GarageImpl с размером 10
//        cars[0] = new Car("BV 100","Audi", "BVB", 2.0, "Silver"); // Создание объекта cars[0] типа Car с указанными характеристиками
//        cars[1] = new Car("BV 101","Mercedes", "BVG",3.5, "Blue"); // Создание объекта cars[1] типа Car с указанными характеристиками
//        cars[2] = new Car("BV 102", "Opel", "BSR", 1.8, "White"); // Создание объекта cars[2] типа Car с указанными характеристиками
//        cars[3] = new Car("BV 103", "BMW", "RES",2.8, "Blue" ); // Создание объекта cars[3] типа Car с указанными характеристиками
//        cars[4] = new Car("BV 104", "Mercedes", "RIT", 4.0, "Gray"); // Создание объекта cars[4] типа Car с указанными характеристиками
//        cars[5] = new Car("BV 105", "Audi", "BVG", 5.0, "Black"); // Создание объекта cars[5] типа Car с указанными характеристиками
//        for (int i = 0; i < cars.length; i++) { // Начало цикла for, который проходит по всем элементам массива cars
//            garage.addCar(cars[i]); // Добавление машины с указанными характеристиками в гараж
//        } // Конец цикла for
//    } // Конец метода setUp
//
//    @Test // Аннотация Test - метод, помеченный этой аннотацией, будет являться тестовым методом
//    void addCar() { // Начало определения тестового метода addCar
//        assertEquals(6, garage.size()); // Проверка на равенство ожидаемого и фактического значения размера гаража
//        assertFalse(garage.addCar(null)); // Проверка, что добавление "пустой" машины в гараж вернет false
//        assertFalse(garage.addCar(cars[0])); // Проверка, что добавление машины с уже существующим номером вернет false
//        Car car1 = new Car("BV 106", "VW", "BIR", 3.0, "Blue"); // Создание объекта car1 типа Car с указанными характеристиками
//        assertTrue(garage.addCar(car1)); // Проверка, что успешное добавление новой машины вернет true
//        assertEquals(7, garage.size()); // Проверка на равенство ожидаемого и фактического значения размера гаража после добавления новой машины
//    } //

//
//    void removeCar() {
//        assertEquals(6, garage.size()); // Проверка на равенство ожидаемого и фактического значения размера гаража
//        assertNull(garage.removeCar("BV 200")); // Проверка, что удаление машины с несуществующим номером вернет null
//        Car removedCar = garage.removeCar("BV 101"); // Удаление машины с указанным номером и сохранение удаленной машины в переменную removedCar
//        assertNotNull(removedCar); // Проверка, что удаленная машина не равна null
//        assertEquals("Mercedes", removedCar.getModel()); // Проверка на соответствие ожидаемой и фактической модели удаленной машины
//        assertEquals(5, garage.size()); // Проверка на равенство ожидаемого и фактического значения размера гаража после удаления машины
//        assertNull(garage.findCarByRegNumber("BV 101")); // Проверка, что машина была удалена и ее поиск по номеру вернет null
//    }
//
//    @Test
//    void findCarByRegNumber() {
//        Car foundCar = garage.findCarByRegNumber("BV 102"); // Поиск машины по указанному номеру и сохранение найденной машины в переменную foundCar
//        assertNotNull(foundCar); // Проверка, что найденная машина не равна null
//        assertEquals("Opel", foundCar.getModel()); // Проверка на соответствие ожидаемой и фактической модели найденной машины
//        assertNull(garage.findCarByRegNumber("BV 200")); // Проверка, что машина с несуществующим номером не будет найдена и ее поиск вернет null
//    }
//
//    @Test
//    void findCarsByModel() {
//        Car[] audiCars = garage.findCarsByModel("Audi"); // Поиск всех машин с указанной моделью и сохранение результатов в массив audiCars
//        assertEquals(2, audiCars.length); // Проверка на равенство ожидаемого и фактического значения количества машин с указанной моделью
//        assertEquals("Audi", audiCars[0].getModel()); // Проверка на соответствие ожидаемой и фактической модели первой найденной машины
//        assertEquals("Audi", audiCars[1].getModel()); // Проверка на соответствие ожидаемой и фактической модели второй найденной машины
//
//        // Проверки для других моделей аналогичны, а также проверяется, что машин с указанной моделью нет в гараже.
//    }
//
//    @Test
//    void findCarsByCompany() {
//        Car[] bvgCars = garage.findCarsByCompany("BVG"); // Поиск всех машин с указанной компанией и сохранение результатов в массив bvgCars
//        assertEquals(2, bvgCars.length); // Проверка на равенство ожидаемого и фактического значения количества машин с указанной компанией
//        assertEquals("BVG", bvgCars[0].getCompany()); // Проверка на соответствие ожидаемой и фактической компании первой найденной машины
//        assertEquals("BVG", bvgCars[1].getCompany()); // Проверка на соответствие ожидаемой и фактической компании второй найденной машины
//
//        // Проверки для других компаний аналогичны, а также проверяется, что машин от указанной компании нет в гараже.
//    }
//
//    @Test
//    void findCarsByEngine() {
//        Car[] foundCars = garage.findCarsByEngine(1.8, 2.0); // Поиск всех машин с двигателем в указанном диапазоне и сохранение результатов в массив foundCars
//        assertEquals(2, foundCars.length); // Проверка на равенство ожидаемого и фактического значения количества найденных машин
//        assertArrayEquals(new Car[]{cars[0], cars[2]}, foundCars); // Проверка на соответствие ожидаемых и фактических машин в массиве foundCars
//
//        // Проверки для других диапазонов аналогичны, а также проверяется, что машин с указанным диапазоном двигателя