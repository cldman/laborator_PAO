package exercitii.inheritance;

public class Address {
    private final String str;
    private final Integer number;

    public Address(String str, Integer number) {
        this.str = str;
        this.number = number;
    }

    public String getStr() {
        return str;
    }

    public Integer getNumber() {
        return number;
    }
}
