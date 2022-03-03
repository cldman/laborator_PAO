import model.EProduct;
import model.Product;
import model.Shop;
import service.ShopService;
import service.ShopServiceImpl;

import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application");

        Shop shop =  new Shop();
        Product product = new Product("Buragoo", 1, EProduct.TOY);
        Product product1 = new Product("Ceddar", 2, EProduct.CHEESE);

        ShopService service = new ShopServiceImpl();
        service.addProduct(shop, product);
        service.addProduct(shop, product1);

        service.printProducts(shop);

        System.out.println("Produsele sunt egale: " + product.equals(product1));

        System.out.println("Value before change " + product.getName());

        changeProductName(product);

        System.out.println("Value after change " + product.getName());
    }


    public static void changeProductName(Product product) {
        product.setName("other");
    }
}
