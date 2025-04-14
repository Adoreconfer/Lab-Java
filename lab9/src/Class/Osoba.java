package Class;

public class Osoba {
    private String id;
    private String imie;
    private int wiek;

    public Osoba(String id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "id=" + id + ", imie=" + imie+
                ", wiek=" + wiek;
    }
}
