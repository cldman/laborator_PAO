package main;

import exceptions.GarageIsFullException;
import models.transportation.Garage;
import models.transportation.Vehicle;
import service.GarageService;
import service.NotificationService;
import utils.VehicleGenerator;

import java.io.IOException;
import java.util.Scanner;

/*
    Exceptions
            Throwable
    Error                  Exception
                RuntimeException        checked exceptions
                NullPointerException,           IOException,
                IllegalArgumentException,       SqlException
                ArithmeticException
 */
public class Application {

    public static void main(String[] args) {
        Garage garage = new Garage();
        NotificationService notificationService = new NotificationService();
        GarageService garageService = new GarageService(notificationService);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following commands: " +
                    "add_vehicle, view_vehicles or exit, create_folder, create_file, delete_file, list_files, view_notifications ");
            String line = scanner.nextLine();
            switch(line) {
                case "add_vehicle" : {
                    addVehicle(garage, garageService, scanner);
                    break;
                }
                case "view_vehicles" : {
                    garageService.printVehicleDetails(garage);
                    break;
                }
                case "exit" : {
                    System.out.println("Bye bye!");
                    System.exit(0);
                    break;
                }
                case "create_folder" : {
                    System.out.println("Please provide the folder name:");
                    String folderName = scanner.nextLine();
                    try {
                        notificationService.createFolder(folderName);
                    } catch (IOException e) {
                        System.out.println("Cannot create folder with name " + folderName);
                    }
                    break;
                }
                case "create_file" : {
                    System.out.println("Please provide the file name:");
                    String fileName = scanner.nextLine();
                    try {
                        notificationService.createFile(fileName);
                    } catch (IOException e) {
                        System.out.println("Cannot create file with name " + fileName);
                    }
                    break;
                }
                case "delete_file" : {
                    System.out.println("Please provide the file name to be deleted:");
                    String fileName = scanner.nextLine();
                    try {
                        notificationService.deleteFile(fileName);
                    } catch (IOException e) {
                        System.out.println("Cannot delete file with name " + fileName);
                    }
                    break;
                }
                case "list_files":
                {
                    System.out.println("Please provide the folder name:");
                    String folderName = scanner.nextLine();
                    try {
                        notificationService.listFolder(folderName);
                    } catch (IOException e) {
                        System.out.println("Cannot list files from folder with name " + folderName);
                    }
                    break;
                }
                case "view_notifications" :
                    notificationService.viewNotifications(scanner.nextLine());
                    break;
                default : System.out.println("This command doesn't exist.");
            }
        }
    }

    private static void addVehicle(Garage garage, GarageService garageService, Scanner scanner) {
        System.out.println("Please choose a vehicle type: bicycle or car ");
        String productType = scanner.nextLine();
        switch(productType) {
            case "bicycle" : {
                System.out.println("Please specify the bicycle details: model/make/color/height");
                try {
                    Vehicle bicycle = VehicleGenerator.buildBicycle(scanner.nextLine().split("/"));
                    garageService.addVehicleToGarage(garage, bicycle);
                } catch(NumberFormatException e) { //multi-catch: catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
                    System.out.println("Invalid inputs for vehicle creation. The vehicle was not added to the garage.");
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Not enough inputs for vehicle creation. The vehicle was not added to the garage.");
                } catch(GarageIsFullException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            case "car" : {
                System.out.println("Please specify the car details: " +
                        "model/make/color/type/power/numberOfCylinders/fuel/transmissionNoGears/transmissionType");
                try {
                    Vehicle car = VehicleGenerator.buildCar(scanner.nextLine().split("/"));
                    garageService.addVehicleToGarage(garage, car);
                } catch(NumberFormatException e) { //multi-catch: catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
                    System.out.println("Invalid inputs for vehicle creation. The vehicle was not added to the garage.");
                } catch(ArrayIndexOutOfBoundsException e) {
                    System.out.println("Not enough inputs for vehicle creation. The vehicle was not added to the garage.");
                } catch(GarageIsFullException e) {
                    System.out.println(e.getMessage());
                }
                break;
            }
            default : System.out.println("This vehicle type doesn't exist.");
        }
    }

}
