package com.javagda25.comparator.zadanie1;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {

    public int compare(Osoba o1, Osoba o2) {
        if (o1.getWiek() > o2.getWiek()) {
            return 1;
        } else if (o1.getWiek() < o2.getWiek()) {
            return -1;
        }
        return 0;
    }
}
