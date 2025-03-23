package Class;

public class Powiesc extends Ksiazka{
    private String gatunek;

    public Powiesc(String tytul, String autor, float cena, String gatunek) {
        super(tytul, autor, cena);
        this.gatunek = gatunek;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void Info(){
        super.Info();
        System.out.println("Gatunek: "+gatunek);
    }
}
