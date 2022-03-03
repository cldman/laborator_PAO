package service;

import model.Product;
import model.Shop;

public interface ShopService {
    /**
     * Adds given product to shop.
     * @param shop shop to which the product will be stored
     * @param product the product to be stored
     */
    void addProduct(Shop shop, Product product);

    /**
     * Prints products from given shop
     * @param shop shop
     */
    void printProducts(Shop shop);

    default int getNumberOfProducts(Shop shop) {
        return  shop.getProducts().length;
    }
}
