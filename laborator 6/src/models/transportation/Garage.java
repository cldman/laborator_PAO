package models.transportation;

public class Garage {
    private Vehicle[] vehicles = new Vehicle[10];

    public Vehicle[] getVehicles() {
        return  vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
