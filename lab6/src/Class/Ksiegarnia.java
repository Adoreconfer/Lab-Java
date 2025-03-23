package Class;

import java.util.ArrayList;

public class Ksiegarnia {
    private ArrayList<Ksiazka> dostepneKsiazki = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajKsiazke(Ksiazka ksiazka) {
        dostepneKsiazki.add(ksiazka);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void pokazKsiazki() {
        System.out.println("Dostępne książki w księgarni: ");
        for (Ksiazka k : dostepneKsiazki) {
            k.Info();
        }
    }
}
