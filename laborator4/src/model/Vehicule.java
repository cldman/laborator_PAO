package model;

public abstract class Vehicule extends Product {
    public String model;
    public Boolean limitedEdition;


    public Vehicule(Long id, String name, Double price, String model, Boolean limitedEdition) {
        super(id, name, price);
        this.model = model;
        this.limitedEdition = limitedEdition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getLimitedEdition() {
        return limitedEdition;
    }

    public void setLimitedEdition(Boolean limitedEdition) {
        this.limitedEdition = limitedEdition;
    }
}
