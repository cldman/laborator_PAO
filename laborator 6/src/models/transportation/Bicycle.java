package models.transportation;

public class Bicycle extends Vehicle {
    private int height;

    public Bicycle(String model, String make, String color, int height) {
        super(model, make, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "height=" + height +
                ", model='" + model + '\'' +
                '}';
    }
}
