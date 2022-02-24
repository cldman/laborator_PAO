package exercitii.inheritance;

public class PhoneImpl implements Phone {
    private Integer number;

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String getPrefix() {
        return "+40";
    }
}
