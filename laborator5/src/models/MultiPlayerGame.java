package models;

public abstract class MultiPlayerGame implements Game{
    private final GameCategory category = GameCategory.MULTIPLAYER;
    private final int maxNumberOfPlayers;


    public MultiPlayerGame(int maxNumberOfPlayers) {
        this.maxNumberOfPlayers = maxNumberOfPlayers;
    }

    @Override
    public GameCategory category() {
        return category;
    }

    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }
}
