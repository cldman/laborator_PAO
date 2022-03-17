package models;

public class CallOfDuty extends MultiPlayerGame implements Product, Comparable<CallOfDuty>{
    private final GameGenre GENRE = GameGenre.SHOOTING;
    public static final String BAR_CODE = "bar_code_call_of_duty";

    private int price;
    private int minAge;

    public CallOfDuty(int maxNumberOfPlayers, int price, int minAge) {
        super(maxNumberOfPlayers);
        this.price = price;
        this.minAge = minAge;
    }


    @Override
    public GameGenre genre() {
        return GENRE;
    }

    @Override
    public String barcode() {
        return BAR_CODE;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public int compareTo(CallOfDuty o) {
        return (o.price() == price) ? 0 : (price > o.price()) ? 1 : -1;
    }

    public int getMinAge() {
        return minAge;
    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "GENRE=" + GENRE +
                ", price=" + price +
                ", minAge=" + minAge +
                ", maxNumberOfPlayers=" + getMaxNumberOfPlayers() +
                '}';
    }
}
