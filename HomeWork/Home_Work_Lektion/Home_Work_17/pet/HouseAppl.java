package Home_Work_17.pet;

public class HouseAppl {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Cat", 3.8, "Indoors", "Tom", "Maine Coon", 2);
        Cat cat2 = new Cat("Cat", 4.2, "Indoors", "Barsik", "Siberian", 3);
        Cat cat3 = new Cat("Cat", 2.8, "Indoors", "Murka", "Russian blue", 1);

        Dog dog1 = new Dog("Dog", 15.5, "Outdoors", "Buddy", "Labrador Retriever", 4);
        Dog dog2 = new Dog("Dog", 12.8, "Outdoors", "Rex", "German Shepherd", 5);

        // Simulating life in a house during the day
        cat1.eat();
        cat2.sleep();
        dog1.eat();
        dog2.sleep();
        dog1.run();
        cat3.voice();
        cat2.voice();
        dog2.voice();
    }
}