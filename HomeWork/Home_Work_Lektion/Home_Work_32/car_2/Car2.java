package Home_Work_32.car_2;

import java.util.Objects;

public class Car2 implements Comparable <Car2> {
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
    private double mileage;


    public Car2(String model, String company, double engineCapacity, double mileage) {
        this.model = model;
        this.company = company;
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Car{");
        sb.append("model =").append(model);
        sb.append(", company =").append(company);
        sb.append(", engineCapacity ='").append(engineCapacity).append('\'');
        sb.append(", mileage =").append(mileage);
        sb.append('}');
        return sb.toString();


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car2 car2)) return false;
        return Double.compare(getEngineCapacity(), car2.getEngineCapacity()) == 0 && Double.compare(getMileage(),
                car2.getMileage()) == 0 && Objects.equals(getModel(), car2.getModel()) && Objects.equals(getCompany(), car2.getCompany());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getCompany(), getEngineCapacity(), getMileage());
    }

    @Override
    public int compareTo(Car2 o) {
        return this.model.compareTo(o.getModel());
    }
}
