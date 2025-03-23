package Class;

import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Ksiazka> zakupioneKsiazki = new ArrayList<>();

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void kupKsiazke(Ksiazka ksiazka){
        zakupioneKsiazki.add(ksiazka);
        System.out.println(imie+" "+nazwisko+" kupił książkę: "+ksiazka.getTytul());
    }

    public void pokazZakupy(){
        System.out.println("Zakupione książki klienta "+imie+" "+nazwisko+" :");
        for(Ksiazka k: zakupioneKsiazki)
            k.Info();
    }

}
