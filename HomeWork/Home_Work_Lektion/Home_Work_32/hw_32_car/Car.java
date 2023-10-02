package Home_Work_32.hw_32_car;

import java.util.Objects;

public class Car implements Comparable <Car> {
    //    Task 1. Create some cars in the Car class.
//    Sort and print the list of cars in order:
//    model
//    company
//    engine capacity
//    Task 2. Add a vehicle mileage field to the Car class.
//    Add the value of this field to the cars in the garage
//    and list sorted by mileage in reverse order (highest mileage car on top)
    private String model; // Private fields
    private String company;
    private double engineCapacity;

    // Constructor to initialize the car object with the given model, company, and engine capacity.
    public Car(String model, String company, double engineCapacity) {
        this.model = model;
        this.company = company;
        this.engineCapacity = engineCapacity;
    }

    // Getter method to retrieve the car's model.
    public String getModel() {
        return model;
    }

    // Setter method to set the car's model.
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method to retrieve the car's company.
    public String getCompany() {
        return company;
    }

    // Setter method to set the car's company.
    public void setCompany(String company) {
        this.company = company;
    }

    // Getter method to retrieve the car's engine capacity.
    public double getEngineCapacity() {
        return engineCapacity;
    }

    // Setter method to set the car's engine capacity.
    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    // Override toString() method to provide a string representation of the car object.
    @Override
    public String toString() {
        return "Car{ " + "model ='" + model + "', company ='" + company + "', engineCapacity = " + engineCapacity + " }";
    }

    // Override equals() method to compare if two car objects are equal based on their model, company, and engine capacity.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                Objects.equals(model, car.model) &&
                Objects.equals(company, car.company);
    }

    // Override hashCode() method to generate a hash code based on the car's model, company, and engine capacity.
    @Override
    public int hashCode() {
        return Objects.hash(model, company, engineCapacity);
    }

    // Override compareTo() method to define the natural ordering of car objects based on their model.
    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}