package Class;

public class Ksiazka {
    private String tytul;
    private String autor;

    public Ksiazka(String tytul, String autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "tytul=" + tytul +", autor=" + autor;
    }
}
