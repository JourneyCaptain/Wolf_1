package Lektion_32.practice.cats;

import java.util.Objects;

public class Cat implements Comparable <Cat> {
    //пример с классом Cat
    // Создать класс Cat, 4 поля
    // стандартные конструктор, геттеры и сеттеры
    // toString, equals - переопределить // Создать класс для тестирования
    // создать массив с представителями класса
    // добавить interfeis comparable в класс Cat, переопределить метод compareTo
    // отсортировать массив кошек
    private String name;
    private int age;
    private String color;
    private double weight;

    public Cat(String name, int age, String color, double weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + name + " ', age= " + age + ", color=' " + color + ", weight= " + weight + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return getAge() == cat.getAge() && Double.compare(getWeight(), cat.getWeight()) == 0 && Objects.equals(getName(), cat.getName()) && Objects.equals(getColor(), cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getColor(), getWeight());
    }

    //    @Override
//    public int compareTo(Cat o) {
//        int res1 = this.name.compareTo(o.name);//  otveceaet za imea
//        int res2 =  this.age -o.age;
//        int res = 0;
//        if (res1 <=0 && res2 <=0) { res = -1;} else {res = 1; }
//
//        return res;
//    }
////
    @Override
    public int compareTo(Cat o) {
        // return -this.name.compareTo(o.name);// meneati poreadok sortirovky Z-A

        return this.name.compareTo(o.name);// sravnenie dvuh strok ,alfavitnii poreadok A-Z

        // return o.age - this.age;// bolise k menise
        // return  this.age - o.age;// mense bolise

        // sravnenie po vozrostu, esli rezultat otritatelinii , to poreadok ostanetsea,
        //a esli polojitelinii, to objekti meneati mestami

    }
}
