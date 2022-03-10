package model;

public class Bicycle extends Vehicule {
    private int height;

    public Bicycle(Long id, String name, Double price, String model, Boolean limitedEdition, int height) {
        super(id, name, price, model, limitedEdition);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
