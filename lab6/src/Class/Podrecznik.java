package Class;

public class Podrecznik extends Ksiazka{
    private String przedmiot;

    public Podrecznik(String tytul, String autor, float cena, String przedmiot) {
        super(tytul, autor, cena);
        this.przedmiot = przedmiot;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Przedmiot: "+przedmiot);
    }
}
