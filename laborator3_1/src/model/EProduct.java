package model;

public enum EProduct {
    TOY(1),
    CHEESE(2);

    private int code;

    EProduct(int code) {
        this.code = code;
    }

    public EProduct getByCode(int code) {
        EProduct result = null;
        for(EProduct product : EProduct.values()) {
            if(product.code == code) {
                result = product;
            }
        }
        return result;
    }
}
