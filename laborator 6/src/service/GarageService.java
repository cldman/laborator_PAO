package service;

import exceptions.GarageIsFullException;
import models.messaging.Notification;
import models.messaging.Receiver;
import models.transportation.Garage;
import models.transportation.Vehicle;

public class GarageService {

    private NotificationService notificationService;

    public GarageService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    public void addVehicleToGarage(Garage garage, Vehicle vehicle) {
        int nextAvailableIdex = getNumberOfVehicles(garage);
        if (nextAvailableIdex < garage.getVehicles().length) {
            garage.getVehicles()[nextAvailableIdex] = vehicle;

            //send notification to user
            String message = "Vehicle" + vehicle + "was added to garage";
            Receiver receiver = new Receiver("John", "john@gmail.com");
            notificationService.sendNotification(new Notification(message, "office@shop.com", receiver));
        } else {
            //todo throw custom exception if garage does not have avilable space
            throw new GarageIsFullException();
        }

    }

    public void printVehicleDetails(Garage garage) {
        for (Vehicle item : garage.getVehicles()) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    private int getNumberOfVehicles(Garage garage) {
        int numberOfVehicles = 0;

        for (Vehicle item : garage.getVehicles()) {
            if (item != null) {
                numberOfVehicles++;
            }
        }
        return numberOfVehicles;
    }
}
