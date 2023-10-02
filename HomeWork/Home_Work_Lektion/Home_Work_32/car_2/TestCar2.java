package Home_Work_32.car_2;

import java.util.ArrayList;

public class TestCar2 {
    public static void main(String[] args) {

       ArrayList<Car2> myCarsArrayList = new ArrayList<>();

        Car2 car1 = new Car2("Mercedes", "Atlant", 2.9,50369);
        Car2 car2 = new Car2("Audi", "BSR", 3.0, 458365);
        Car2 car3 = new Car2("VW", "BVG", 2.0,2100);
        Car2 car4 = new Car2("Opel", "TiR", 1.8, 15000);

        myCarsArrayList.add(car1);
        myCarsArrayList.add(car2);
        myCarsArrayList.add(car3);
        myCarsArrayList.add(car4);

        System.out.println("=========== Cars unsorted ===========");
        for (Car2 cars : myCarsArrayList) {
            System.out.println(cars);

        }
        Mileage myMileage = new Mileage();
        myCarsArrayList.sort(myMileage);

        System.out.println();
        System.out.println("Sorted by mileage: ");

        for (Car2 cars : myCarsArrayList) {
            System.out.println(cars);
        }
    }
}
