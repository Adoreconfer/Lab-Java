package Forms;

public class Osoba {
    private String imie;
    private String email;
    private long numer;
    private String address;
    private String dataofbirth;

    public Osoba(String imie, String email, long numer, String address, String dataofbirth) {
        this.imie = imie;
        this.email = email;
        this.numer = numer;
        this.address = address;
        this.dataofbirth = dataofbirth;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumer(long numer) {
        this.numer = numer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDataofbirth(String dataofbirth) {
        this.dataofbirth = dataofbirth;
    }

    public String getImie() {
        return imie;
    }

    public String getEmail() {
        return email;
    }

    public long getNumer() {
        return numer;
    }

    public String getAddress() {
        return address;
    }

    public String getDataofbirth() {
        return dataofbirth;
    }

    public String toString(){
        return imie;
    }


}
