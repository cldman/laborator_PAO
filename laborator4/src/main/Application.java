package main;

import model.Bicycle;
import model.Car;
import model.Shop;
import service.ShopService;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Shop shop =  new Shop();
        ShopService shopService = new ShopService();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Please type one of the following: add, exit, total");
            String line = scanner.nextLine();

            switch (line) {
                case "add" :
                    System.out.println("Choose product type: bicycle or car");
                    String productType = scanner.nextLine();
                    switch (productType) {
                        case "bicycle":
                        shopService.addNewProductToShop(shop, getBicycle());
                        break;

                        case "car":
                            shopService.addNewProductToShop(shop, getCar());
                           break;
                        default:
                            System.out.println("No product for that type");
                    }
                    break;
                case "total" :
                    System.out.println("total price is: " + shopService.getTotalPrice(shop));
                    break;

                case "exit" :
                    System.out.println("exiting!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Command does not exit");
            }
        }
    }

    public static Bicycle getBicycle() {
        return  new Bicycle(1L, "cube", 120.00, "mtb", false, 2);
    }

    public static Car getCar(){
        return new Car(2L, "VOLVO", 12000.00, "SUV", true, "combustion");
    }
}
