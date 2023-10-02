package Home_Work_32.car_2;

import java.util.Comparator;

public class Mileage implements Comparator <Car2> {

    public int compare ( Car2 care1, Car2 care2) {
        if (care1.getMileage() == care2.getMileage()) {
            return  0;
        }
        if (care2.getMileage() > care1.getMileage()) {
            return 1;

        }
        else {
            return -1;
        }
    }
}


