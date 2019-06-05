package com.javagda25.comparator.zadanie1;

// Stwórz klasę Osoba (String imie, String nazwisko, int wiek), a następnie stwórz dla niego Comparator,
// który sortuje osoby po wieku.
// W mainie stwórz kilka instancji klasy osoba i dodaj je do Listy. Po dodaniu posortuj listę i na ekran
// wypisz  wynik przed sortowaniem, oraz po sortowaniu.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<Osoba> osobaList = new ArrayList<>();

        osobaList.add(new Osoba("Ania", "Kowalska", 25));
        osobaList.add(new Osoba("Anna", "Nowak", 28));
        osobaList.add(new Osoba("Waldek", "Lis", 12));
        osobaList.add(new Osoba("Kazik", "Kowalski", 45));
        osobaList.add(new Osoba("Bogdan", "Kot", 23));

        OsobaComparator osobaComparator = new OsobaComparator();
        Collections.sort(osobaList, osobaComparator);

        System.out.println(osobaList);
    }
}
