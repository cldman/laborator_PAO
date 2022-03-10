package model;

public class Car extends Vehicule{
    private String engine;

    public Car(Long id, String name, Double price, String model, Boolean limitedEdition, String engine) {
        super(id, name, price, model, limitedEdition);
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
