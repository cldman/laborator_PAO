package models.comparators;

import models.PrinceOfPersia;

import java.util.Comparator;

public class PrinceOfPersiaComparator implements Comparator<PrinceOfPersia> {
    @Override
    public int compare(PrinceOfPersia o1, PrinceOfPersia o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
        /*if(o1.price() == o2.price()) {
            return 0;

        }else if(o1.price() > o2.price()) {
            return 1;
        }
        return -1;*/
    }
}
