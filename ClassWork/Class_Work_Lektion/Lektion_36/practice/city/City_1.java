package Lektion_36.practice.city;

public class City_1 implements Comparable<City_1> {
    private String name; // field

    private int population;

    public City_1(String name, int population) {// constructor
        this.name = name;
        this.population = population;
    }

    public String getName() {//getter setter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City_1{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City_1 o) {
        return Integer.compare(this.population, o.population);// сравнили по размеру популяции
    }
}
