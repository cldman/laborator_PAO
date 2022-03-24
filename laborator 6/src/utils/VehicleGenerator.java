package utils;

import models.transportation.Bicycle;
import models.transportation.Car;
import models.transportation.Engine;
import models.transportation.Transmission;
import models.transportation.Vehicle;

public class VehicleGenerator {
    private VehicleGenerator() {};
    public static Vehicle buildCar(String[] carDetails) {
        String model = carDetails[0];
        String make = carDetails[1];
        String color = carDetails[2];
        String type = carDetails[3];
        Engine engine = new Engine(Integer.valueOf(carDetails[4]), Integer.valueOf(carDetails[5]), carDetails[6]);
        Transmission transmission = new Transmission(Integer.valueOf(carDetails[7]),carDetails[8]);

        return new Car(model, make, color, type, engine, transmission);
    }

    public static Vehicle buildBicycle(String[] bicycleDetails) {
        String model = bicycleDetails[0];
        String make = bicycleDetails[1];
        String color = bicycleDetails[2];
        int height = Integer.valueOf(bicycleDetails[3]);

        return new Bicycle(model, make, color, height);
    }
}
