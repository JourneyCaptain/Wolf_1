package Home_Work_32.car_mileage;

import java.util.Objects;

public class Car_Mileage implements Comparable <Car_Mileage> {

    //    Task 2. Add a vehicle mileage field to the Car class.
//    Add the value of this field to the cars in the garage
//    and list sorted by mileage in reverse order (highest mileage car on top)

    private String model; // Private fields.
    private String company;
    private double engineCapacity;
    private double mileage; // Private field to store the car's mileage.

    // Constructor to initialize the car object with the given model, company, engine capacity, and mileage.
    public Car_Mileage(String model, String company, double engineCapacity, double mileage) {
        this.model = model;
        this.company = company;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
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

    // Getter method to retrieve the car's mileage.
    public double getMileage() {
        return mileage;
    }

    // Setter method to set the car's mileage.
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    // Override toString() method to provide a string representation of the car object.
    @Override
    public String toString() {
        return "Car{ " + "model: " + model + ", company: " + company + ", engineCapacity: " + engineCapacity + ", mileage: " + mileage + " km " + '}';
    }

    // Override equals() method to compare if two car objects are equal based on their model, company, engine capacity and mileage.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car_Mileage that)) return false;
        return Double.compare(getEngineCapacity(), that.getEngineCapacity()) == 0 && Double.compare(getMileage(),
                that.getMileage()) == 0 && Objects.equals(getModel(), that.getModel()) && Objects.equals(getCompany(), that.getCompany());
    }

    // Override hashCode() method to generate a hash code based on the car's model, company, engine capacity and mileage.
    @Override
    public int hashCode() {
        return Objects.hash(model, company, engineCapacity, mileage);
    }

    // Override compareTo() method to define the natural ordering of car objects based on their mileage in reverse order.
    @Override
    public int compareTo(Car_Mileage o) {
        return 0;// (int) (o.mileage - this.mileage);
    }
}