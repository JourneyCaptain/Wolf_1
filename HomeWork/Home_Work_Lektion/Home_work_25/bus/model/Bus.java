package Home_work_25.bus.model;


public class Bus {
    //Задача 2. Создать класс Bus (автобус) - с полями номер маршрута,
    // вместимость, скорость на маршруте, длина маршрута.
    // Реализовать методы go, stop, speedUp, speedDown

     public String routeNumber;
     public int capacity;
     public int routeSpeed;
     public int routeLength;

     public String getRouteNumber() {
          return routeNumber;
     }

     public void setRouteNumber(String routeNumber) {
          this.routeNumber = routeNumber;
     }

     public int getCapacity() {
          return capacity;
     }

     public void setCapacity(int capacity) {
          this.capacity = capacity;
     }

     public int getRouteSpeed() {
          return routeSpeed;
     }

     public void setRouteSpeed(int routeSpeed) {
          this.routeSpeed = routeSpeed;
     }

     public int getRouteLength() {
          return routeLength;
     }

     public void setRouteLength(int routeLength) {
          this.routeLength = routeLength;
     }

     public Bus(String routeNumber, int capacity, int routeSpeed, int routeLength ) {
          this.routeNumber = routeNumber;
          this.capacity = capacity;
          this.routeSpeed = routeSpeed;
          this.routeLength = routeLength;

     }
     public void go (int goSpeed) {
           routeSpeed = goSpeed;
          System.out.println("Bus number " + routeNumber + " started on the route " + routeSpeed + " km/h." );
     }
     public void stop () {
          routeSpeed = 0;
          System.out.println("Bus number " + routeNumber + " stopped " + routeSpeed + " km/h." );
     }
     public void speedUp (int maxSpeed){
           routeSpeed = routeSpeed + maxSpeed;
          System.out.println("Bus number " + routeNumber + " increased the speed to " + routeSpeed + " km/h.");
     }
     public void speedDown (int minSpeed) {
          routeSpeed = routeSpeed - minSpeed;
          System.out.println("Bus number " + routeNumber + " reduced the speed to " + routeSpeed + " km/h." );
     }
     public void displayBus (){
          System.out.println("Route " + routeNumber + " Speed: " + routeSpeed);

     }

}

