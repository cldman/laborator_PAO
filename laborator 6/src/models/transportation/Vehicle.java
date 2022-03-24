package models.transportation;

public abstract class Vehicle{
    protected String model;
    private String make;
    private String color;

    protected Vehicle(String model, String make, String color) {
        this.model = model;
        this.make = make;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
