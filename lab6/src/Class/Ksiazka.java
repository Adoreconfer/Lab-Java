package Class;

public class Ksiazka {
    private String tytul;
    private String autor;
    private float cena;

    public Ksiazka(String tytul, String autor, float cena) {
        this.tytul = tytul;
        this.autor = autor;
        this.cena = cena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public float getCena() {
        return cena;
    }

    public void Info(){
        System.out.println("Tytuł: "+tytul+", Autor: "+autor+", Cena: "+cena+" PLN");
    }

}
