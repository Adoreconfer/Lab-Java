package Class;

public class Gatunek {
    String rodzaj;
    String gatunek;
    int liczbaChrom2n;
    int podstliczbaChromX;
    String opis;

    public Gatunek(String rodzaj, String gatunek, int liczbaChrom2n, int podstliczbaChromX, String opis) {
        this.rodzaj = rodzaj;
        this.gatunek = gatunek;
        this.liczbaChrom2n = liczbaChrom2n;
        this.podstliczbaChromX = podstliczbaChromX;
        this.opis = opis;
    }

    public String RodzajGatunek(){
        return rodzaj+" "+gatunek;
    }

    public int HaploidalnaLiczbaChrom(){
        return liczbaChrom2n/2;
    }

    public void Wypisz(){
        System.out.println("---\nPełna nazwa:"+RodzajGatunek()+
                "\nLiczba chromosomów 2n: "+ liczbaChrom2n+
                "\nPodstawowa liczba chromosomów x: "+ podstliczbaChromX+
                "\nHaploidajna liczba chromoosomów: "+HaploidalnaLiczbaChrom()+
                "\nOpis: "+opis);
    }

    public Gatunek Clon(){
        return new Gatunek(rodzaj, gatunek, liczbaChrom2n, podstliczbaChromX, opis);
    }


}
