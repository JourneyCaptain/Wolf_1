package Home_Work_17.pet;

public class Pet {


//    Задача 1. Создайте класс Pet (домашние животные) с полями:
//
//    тип (кошка, собака, ...)
//    вес
//    условия проживания (дома, на улице)
//    Создайте дочерние классы Cat и Dog c дополнительными полями: имя, порода, возраст.
//    Создайте метод eat,sleep для обоих классов и метод run (гулять) для класса Dog.
//    Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
//    Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
//    Смоделируйте жизнь в этом доме в течение дня
    private String type;
    private double weight;
    private String livingConditions;

    public Pet(String type, double weight, String livingConditions) {
        this.type = type;
        this.weight = weight;
        this.livingConditions = livingConditions;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getLivingConditions() {
        return livingConditions;
    }

    public void setLivingConditions(String livingConditions) {
        this.livingConditions = livingConditions;
    }
}

//    public void eat() {
//        System.out.println("Pet is eating");
//    }
//
//    public void sleep() {
//        System.out.println("Pet is sleeping");

