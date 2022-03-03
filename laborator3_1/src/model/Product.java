package model;

import java.util.Objects;

public class Product {
    private String name;
    private int code;
    private EProduct type;

    public Product(String name, int code, EProduct type) {
        this.name = name;
        this.code = code;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return code == product.code && name.equals(product.name) && type == product.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, type);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public EProduct getType() {
        return type;
    }

    public void setType(EProduct type) {
        this.type = type;
    }
}
