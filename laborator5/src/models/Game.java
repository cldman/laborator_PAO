package models;

public interface Game {
    //not a good practice to define constants or attributes at interface level
    GameGenre genre();
    GameCategory category();

    default int parentalControlMinAge() {
        return getMinAge();
    }

    private int getMinAge(){
        return 3;
    }
}
