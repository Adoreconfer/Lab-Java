package Task;

public class Adres {
    String miasto;
    String ulica;
    int numerDomu;
    String kodPocztowy;

    public Adres(String miasto, String ulica, int numerDomu, String kodPocztowy) throws NieprawidlowyAdresException{
        setMiasto(miasto);
        setUlica(ulica);
        setNumerDomu(numerDomu);
        setKodPocztowy(kodPocztowy);
    }

    public void setMiasto(String miasto){
        if(miasto==null) new NieprawidlowyAdresException("Miasto nie może być nullem").printStackTrace();
        else this.miasto = miasto;
    }

    public void setUlica(String ulica){
        if(ulica==null) new NieprawidlowyAdresException("Ulica nie może być nullem").printStackTrace();
        else this.ulica = ulica;
    }

    public void setNumerDomu(int numerDomu){
        if(numerDomu<=0) new NieprawidlowyAdresException("Numer domu nie może być mniejszy lub równy zeru").printStackTrace();
        else this.numerDomu = numerDomu;
    }

    public void setKodPocztowy(String kodPocztowy){
        if(kodPocztowy==null) new NieprawidlowyAdresException("Kod pocztowy nie może być nullem").printStackTrace();
        else this.kodPocztowy = kodPocztowy;
    }


}
