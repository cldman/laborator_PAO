package service;

import model.Product;
import model.Shop;

public class ShopServiceImpl implements ShopService{

    @Override
    public void addProduct(Shop shop, Product product) {
        for(int i = 0; i < shop.getProducts().length; i++) {
            if(shop.getProducts()[i] == null) {
                shop.getProducts()[i] = product;
                break;
            }
        }
    }

    @Override
    public void printProducts(Shop shop) {
        for(Product product : shop.getProducts()) {
            if(product != null) {
                System.out.println("Shop service product name: " + product.getName());
            }
        }
    }
}
