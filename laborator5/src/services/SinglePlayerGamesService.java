package services;

import models.PrinceOfPersia;

import java.util.ArrayList;

public class SinglePlayerGamesService {
    private ArrayList<PrinceOfPersia> princeOfPersiaGames;

    public SinglePlayerGamesService(ArrayList<PrinceOfPersia> princeOfPersiaGames) {
        this.princeOfPersiaGames = princeOfPersiaGames;
    }

    public int getCountOfPEGI18(){
        int count = 0;
        for (PrinceOfPersia item: princeOfPersiaGames){
            if(item.getMinAge() == 18) {
                count++;
            }
        }
        return count;
    }
}
