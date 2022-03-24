package models.transportation;

public class Car extends Vehicle{
    private String type;
    private Engine engine;
    private Transmission transmission;

    public Car(String model, String make, String color, String type, Engine engine, Transmission transmission) {
        super(model, make, color);
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", transmission=" + transmission +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
