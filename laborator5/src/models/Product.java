package models;

public interface Product {

    String barcode();
    int price();

    default int weight() {
        return 0;
    }

    default String description() {
        return this.toString();
    }

}
