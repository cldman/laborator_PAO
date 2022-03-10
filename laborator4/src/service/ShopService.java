package service;

import model.Product;
import model.Shop;

public class ShopService {

    public void addNewProductToShop(Shop shop, Product product) {
        for(int i=0; i< shop.getProducts().length; i++) {
            if(shop.getProducts()[i] == null){
                shop.getProducts()[i] = product;
                break;
            }
        }
    }

    public Double getTotalPrice(Shop shop) {
        Double price = 0.00;

        for(Product item : shop.getProducts()) {
            if(item != null) {
                price += item.getPrice();
            }
        }

        return price;
    }
}
