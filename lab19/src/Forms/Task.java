package Forms;

public class Task {
    private String tytul;
    private String opis;
    private String priorytet;
    private String data;

    public Task(String tytul, String opis, String priorytet, String data) {
        this.tytul = tytul;
        this.opis = opis;
        this.priorytet = priorytet;
        this.data = data;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setPriorytet(String priorytet) {
        this.priorytet = priorytet;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTytul() {
        return tytul;
    }

    public String getOpis() {
        return opis;
    }

    public String getPriorytet() {
        return priorytet;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return getTytul();
    }
}
