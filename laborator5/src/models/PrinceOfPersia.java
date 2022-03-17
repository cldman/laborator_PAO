package models;

public class PrinceOfPersia extends SinglePlayerGame implements Product{
    //defining constants
    public static final String BAR_CODE = "bar_code_prince_of_persia";

    private final GameGenre GENRE = GameGenre.RPG;
    private final String name; //final attribute needs to instatiated
    private int price;
    private int minAge;
    private final boolean limitedEdition;

    public PrinceOfPersia(String name, int price, int minAge, boolean limitedEdition) {
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.limitedEdition = limitedEdition;
    }

    @Override
    public GameGenre genre() {
        return GENRE;
    }

    @Override
    public int parentalControlMinAge() {
        return minAge;
    }

    @Override
    public String barcode() {
        return BAR_CODE;
    }

    @Override
    public int price() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public boolean isLimitedEdition() {
        return limitedEdition;
    }

    @Override
    //println(princeOfPersia)
    public String toString() {
        return "PrinceOfPersia{" +
                "GENRE=" + GENRE +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", minAge=" + minAge +
                ", limitedEdition=" + limitedEdition +
                ", category=" + category() +
                '}';
    }
}
