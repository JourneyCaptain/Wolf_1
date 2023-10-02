package Lektion_33.practice.city;

import java.util.Objects;

public class City implements Comparable<City>{

    private String name;
    private int population;
    private int pollution;
    private String postCode;

    public City(String name, int population, int pollution, String postCode) {
        this.name = name;
        this.population = population;
        this.pollution = pollution;
        this.postCode = postCode;
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

    public int getPollution() {
        return pollution;
    }

    public void setPollution(int pollution) {
        this.pollution = pollution;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "City{" + "name='" + name + ", population= " + population + ", pollution=" + pollution + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return Objects.equals(getName(), city.getName()) && Objects.equals(getPostCode(), city.getPostCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPostCode());
    }

    @Override
    public int compareTo(City o) {
       // return this.name.compareTo(o.name);
        return - (this.population - o.population);
    }
}
