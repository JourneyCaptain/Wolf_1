package Home_work_25.bus.controller;

import bus.model.Bus;

public class BusAppl {
    public static void main(String[] args) {

        System.out.println();
        Bus bus = new Bus("M36",150,30,15);
        bus.go();
        bus.speedUp(10);
        bus.speedDown(20);
        bus.stop();

        System.out.println();

        Bus bus1 = new Bus("X37",155, 40, 18);
        bus1.go();
        bus1.speedUp(10);
        bus1.speedDown(20);
        bus1.stop();

        System.out.println();

        Bus bus2 = new Bus("M45", 99, 35, 26);
        bus2.go();
        bus2.speedUp(10);
        bus2.speedDown(20);
        bus2.stop();


    }
}
