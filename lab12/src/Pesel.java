import java.time.LocalDate;

public class Pesel {
    private String numer;
    private String plec;
    private int dzien;
    private int miesiac;
    private int rok;

    public String getNumer() {
        return numer;
    }

    public Pesel(String numer) {
        this.numer = numer;
    }

    public int getDzien() {
        return dzien=Integer.parseInt(numer.substring(4,6));
    }

    public String getPlec(){
        return plec=((int)numer.charAt(9)%2==0 ? "k" : "m");
    }

    public int getMiesiac(){
        miesiac=Integer.parseInt(numer.substring(2,4));
        if(miesiac>=21 && miesiac<=32){
            return miesiac-20;
        } if (miesiac>=41 && miesiac<=52) {
            return miesiac-40;
        }
        else return miesiac;
    }

    public int getRok(){
        rok = Integer.parseInt(numer.substring(0,2));
        miesiac=Integer.parseInt(numer.substring(2,4));
        if(miesiac>=21 && miesiac<=32){
            return rok+2000;
        } if (miesiac>=41 && miesiac<=52) {
            return rok+2100;
        }
        else return rok+1900;
    }

    public LocalDate DataUrodzenia(){
        return LocalDate.of(getRok(), getMiesiac(), getDzien());
    }
}
