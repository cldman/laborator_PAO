package exercitii.inheritance;


public interface Phone {
    int valoare = 10;

    String getPrefix();

    default int getLength() {
        return valoare;
    }
}
