package models;

public abstract class SinglePlayerGame implements Game{
    private final GameCategory category = GameCategory.SINGLEPLAYER;

    @Override
    public GameCategory category() {
        return category;
    }
}
