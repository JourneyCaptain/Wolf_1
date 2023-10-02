package Lektion_35.practice.city;

public class City1 implements Comparable<City1> {

    private String name;
    private int population;

    public City1(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
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
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City1 o) {
        //return this.population - o.population;
        return Integer.compare(population, o.population);
    }
}

