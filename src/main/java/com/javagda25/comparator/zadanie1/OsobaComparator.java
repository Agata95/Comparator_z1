package com.javagda25.comparator.zadanie1;

import java.util.Comparator;

public class OsobaComparator implements Comparator<Osoba> {

    public int compare(Osoba o1, Osoba o2) {
        // prównanie w formie skróconej
        // (warunek) ? (jeśli prawda) : (jeślli fałsz)
//        return o1.getWiek() > o2.getWiek() ? 1 : (o1.getWiek() == o2.getWiek() ? 0 : -1);
        return Integer.compare(o1.getWiek(), o2.getWiek());
    }
}
