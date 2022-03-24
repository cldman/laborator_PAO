package models.transportation;

public class Engine {
    private int power;
    private int numberOfCylinders;
    private String fuel;

    public Engine(int power, int numberOfCylinders, String fuel) {
        this.power = power;
        this.numberOfCylinders = numberOfCylinders;
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", numberOfCylinders=" + numberOfCylinders +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
