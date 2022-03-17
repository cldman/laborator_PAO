package main;

import models.CallOfDuty;
import models.PrinceOfPersia;
import models.comparators.PrinceOfPersiaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Application {

    public static void main(String[] args) {
        PrinceOfPersia first = new PrinceOfPersia("Dark times", 250, 12, false);
        PrinceOfPersia second = new PrinceOfPersia("Sands of time", 125, 12, true);
        PrinceOfPersia third = new PrinceOfPersia("Good vibes", 300, 12, false);

        ArrayList<PrinceOfPersia> princeOfPersiaGames = new ArrayList<>();
        princeOfPersiaGames.add(first);
        princeOfPersiaGames.add(second);
        princeOfPersiaGames.add(third);

        System.out.println("Print list of games unsorted");
        for (PrinceOfPersia item : princeOfPersiaGames) {
            System.out.println(item);
        }
        //let's sort the list
        PrinceOfPersiaComparator comparator = new PrinceOfPersiaComparator();
        princeOfPersiaGames.sort(comparator);
        System.out.println("Print sorted games by price using custom Comparator");

        for (PrinceOfPersia item : princeOfPersiaGames) {
            System.out.println(item);
        }
        //another way to sort elements using compartor
        princeOfPersiaGames.sort(Comparator.comparing(PrinceOfPersia::getName));
        System.out.println("Print sorted games by name");

        //System.out.println(Arrays.toString(princeOfPersiaGames.toArray()));
        for (PrinceOfPersia item : princeOfPersiaGames) {
            System.out.println(item);
        }

        CallOfDuty multiFirst = new CallOfDuty(50, 100, 18);
        CallOfDuty multiSecond = new CallOfDuty(40, 130, 18);
        CallOfDuty multiThird = new CallOfDuty(30, 120, 18);

        ArrayList<CallOfDuty> multiPlayerGames = new ArrayList<>();

        multiPlayerGames.add(multiFirst);
        multiPlayerGames.add(multiSecond);
        multiPlayerGames.add(multiThird);

        System.out.println("sorted multiplayer games by price");
        Collections.sort(multiPlayerGames);

        for (CallOfDuty item : multiPlayerGames) {
            System.out.println(item);
        }

        System.out.println("sorted multiplayer games by max number Of Players");
        multiPlayerGames.sort(Comparator.comparing(CallOfDuty::getMaxNumberOfPlayers));
        for (CallOfDuty item : multiPlayerGames) {
            System.out.println(item);
        }

    }
}
