package model;

public class Receiver {
    private String name;
    private String address;


    public Receiver(String name, String adress) {
        this.name = name;
        this.address = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
