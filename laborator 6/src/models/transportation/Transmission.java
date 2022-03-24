package models.transportation;

public final class Transmission {
    private final int numberOfGears;
    private final String type;

    public Transmission(int numberOfGears, String type) {
        this.numberOfGears = numberOfGears;
        this.type = type;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "numberOfGears=" + numberOfGears +
                ", type='" + type + '\'' +
                '}';
    }
}
