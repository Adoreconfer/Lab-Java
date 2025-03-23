package Task;
import Class.*;
import RunInput.Input;

public class Tasks {
    public void Zadanie1(){
        Point point = new Point();
        Point point1 = new Point(2.4,4.8);

        class Figura {

            //pola metody i kontruktory
            Point punkt;
            String kolor = "bialy";

            Figura(){
                punkt = new Point(0,0);
            }
            Figura(String kolor){
                this.kolor=kolor;
            }
            Figura(Point punkt){
                this.punkt=punkt;
            }
            String getKolor(){
                return kolor;
            }
            String opis(String nazwa){
                return "------\n"+"Klasa Figura. "+ nazwa +":\nKolor obiektu: "+kolor+
                        "\nx = "+ punkt.x+", y = "+punkt.y;
            }
        }

        class Prostokat  extends Figura
        {
            double wys=0, szer=0;

            Prostokat(double wys, double szer){
                this.wys = wys;
                this.szer = szer;

            }

            Prostokat(double wys,double szer, String kolor){
                super(kolor);
                this.wys = wys;
                this.szer = szer;
            }

            public void przesun(double x, double y){
                super.punkt.x+=x;
                super.punkt.y+=y;
            }


            double getPowierzchnia() {
                return (szer * wys);
            }

            public String opis(String nazwa){
                return super.opis(nazwa)+"\nPowierzchnia: "+getPowierzchnia()+"\nBoki: "+wys+", "+szer;
            }
        }

        class Kwadrat extends Prostokat{


            private Kwadrat(double wys, double szer) {
                super(wys,szer);
            }
            public void setWys(double wys_){ wys = wys_;}
            public void setSzer(double szer_){ szer = szer_; }
            public double getWys(){ return wys;}
            public double getSzer(){ return szer;}


        }


        class Trojkat extends Figura
        {
            double wys=0, podst=0;

            Trojkat(double wys, double podst)
            {
                this.wys = wys;
                this.podst = podst;
            }

            Trojkat(double wys, double podst, String kolor){
                super(kolor);
                this.wys = wys;
                this.podst = podst;
            }

            double getPowierzchnia() {
                return 0.5*(podst * wys);
            }

            public String opis(String nazwa){
                return super.opis(nazwa)+"\nPowierzchnia: "+getPowierzchnia()+"\nWysokosc: "+wys+", Podstawa: "+podst;
            }
        }

        class Okrag extends Figura{

            double p;
            Point srodek;

            public double getPpowierzchnia(){
                return Math.PI*Math.pow(p,2);
            }

            public double getSrednica(){
                return 2*p;
            }

            public void setPromien(double p) {
                this.p = p;
            }

            public double getPromien() {
                return p;
            }

            public String wSrodku(Point point){
                if( ( Math.pow((srodek.x-point.x),2) + Math.pow((srodek.y-point.y),2)) <= Math.pow(p,2) ){
                    return "Punkt w srodku okregu";
                }
                else{
                    return "Punk nie jest w okregu";
                }
            }

            public Okrag() {
                p = 0;
                srodek = new Point(0,0);
            }

            public Okrag(double p, Point srodek) {
                this.p = p;
                this.srodek = srodek;
            }

            public String opis(String nazwa, Point point){
                return super.opis(nazwa)+"\nPowierzchnia: "+getPpowierzchnia()+"\nPromien: "+getPromien()+", srednica: "+getSrednica()+"\n"+wSrodku(point);
            }

        }

        Prostokat prostokat = new Prostokat(5,4);
        prostokat.przesun(3,5);
        System.out.println(prostokat.opis("Prostokat"));

        Kwadrat kwadrat = new Kwadrat(4,3);
        kwadrat.punkt = new Point(2,3);
        System.out.println(kwadrat.opis("Kwadrat"));

        Trojkat trojkat = new Trojkat(3,4);
        System.out.println(trojkat.opis("Trojkat"));

        Okrag okrag = new Okrag(3, new Point(2,1));
        System.out.println(okrag.opis("Okrag", new Point(0,0)));
    }

    public void Zadanie2(){
        class Samochod{
            private String marka;
            private String model;
            private String nadwozie;
            private String kolor;
            private int rok;
            private float przebieg;

            public Samochod(String marka, String model, String nadwozie, String kolor, int rok, float przebieg) {
                this.marka = marka;
                this.model = model;
                this.nadwozie = nadwozie;
                this.kolor = kolor;
                this.rok = rok;
                if (przebieg<0) this.przebieg = -przebieg; else this.przebieg = przebieg;
            }

            public Samochod(){
                marka = getMarka();
                model = getModel();
                nadwozie = getNadwozie();
                kolor = getKolor();
                rok = getRok();
                przebieg = getPrzebieg();
            }

            public void setMarka(String marka) {
                this.marka = marka;
            }

            public void setModel(String model) {
                this.model = model;
            }

            public void setNadwozie(String nadwozie) {
                this.nadwozie = nadwozie;
            }

            public void setKolor(String kolor) {
                this.kolor = kolor;
            }

            public void setRok(int rok) {
                this.rok = rok;
            }

            public void setPrzebieg(float przebieg) {
                if (przebieg<0) this.przebieg = -przebieg; else this.przebieg = przebieg;
            }

            public String getMarka() {
                return marka;
            }

            public String getModel() {
                return model;
            }

            public String getNadwozie() {
                return nadwozie;
            }

            public String getKolor() {
                return kolor;
            }

            public int getRok() {
                return rok;
            }

            public float getPrzebieg() {
                return przebieg;
            }

            public String toString() {
                return
                        "marka='" + marka + '\'' +
                        ", model=" + model +
                        ", nadwozie='" + nadwozie + '\'' +
                        ", kolor='" + kolor + '\'' +
                        ", rok=" + rok +
                        ", przebieg=" + przebieg;
            }
        }


        class SamochodOsobowy extends Samochod{
            float waga;
            float pojemnosc;
            int iloscOs;


            public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rok, float przebieg, float waga, float pojemnosc, int iloscOs) {
                super(marka, model, nadwozie, kolor, rok, przebieg);
                if(!(waga>=2 && waga<=4.5)) this.waga = 2;
                else this.waga = waga;
                if(!(pojemnosc>=0.3 && pojemnosc<=0.8)) this.pojemnosc = 0.3F;
                else this.pojemnosc = pojemnosc;
                this.iloscOs = iloscOs;
            }

            public void setWaga(float waga) {
                if(!(waga>=2 && waga<=4.5)) this.waga = 2;
                else this.waga = waga;
            }

            public void setPojemnosc(float pojemnosc) {
                if(!(pojemnosc>=0.3 && pojemnosc<=0.8)) this.pojemnosc = 0.3F;
                else this.pojemnosc = pojemnosc;
            }

            public void setIloscOs(int iloscOs) {
                this.iloscOs = iloscOs;
            }

            public String toString() {
                return  super.toString()+
                        "\twaga=" + waga +
                        ", pojemnosc=" + pojemnosc +
                        ", iloscOs=" + iloscOs;
            }
        }

        Samochod samochod = new Samochod("Toyota","Corolla","Sedan","czarny", 2020, 45000);
        System.out.println(samochod.toString());

        Samochod samochod1 = new Samochod();
        samochod1.setMarka("BMW");
        samochod1.setModel("X5");
        samochod1.setNadwozie("SUV");
        samochod1.setKolor("Bialy");
        samochod1.setRok(2019);
        samochod1.setPrzebieg(60000);
        System.out.println(samochod1.toString());

        SamochodOsobowy samochodOsobowy = new SamochodOsobowy("Mercedes-Benz","E-Class","Kombi","srebrny", 2021, 30000, 2.2f,2,5);
        System.out.println(samochodOsobowy.toString());

    }

    public void Zadanie3(){
        Ksiegarnia ksiegarnia = new Ksiegarnia();

        Ksiazka p1 = new Podrecznik("Matematyka 101", "Jan Kowalski", 49.99F, "Matematyka");
        Ksiazka p2 = new Powiesc("Hobbit", "J.R.R. Tolkien", 39.99F, "Fantasy");

        ksiegarnia.dodajKsiazke(p1);
        ksiegarnia.dodajKsiazke(p2);

        Klient klient1 = new Klient("Anna","Nowak");
        ksiegarnia.dodajKlienta(klient1);

        klient1.kupKsiazke(p1);
        klient1.kupKsiazke(p2);

        ksiegarnia.pokazKsiazki();
        klient1.pokazZakupy();

    }

}
