package Class;

public class Okrag extends Figura implements IFigury, RuchFigury{

    private float r;

    public Okrag(float r, String kolor, Punkt punkt){
        this.r = r;
        super.kolor = kolor;
        super.punkt = punkt;
    }
    @Override
    public String opis() {
        return "\nOkrag o promieniu: "+r+
                "\nZnajduje sie w punkcie: ("+punkt.x+","+punkt.y+")"+
                "\nPowierzchnia: "+getPowierzchnia();
    }

    @Override
    public void skaluj(float skala) {
        r = (int) (r*skala);
    }

    @Override
    public float getPowierzchnia() {
        return (float) (Math.PI*Math.pow(r,2));
    }

    @Override
    public boolean wPolu(Punkt p) {
        if( (Math.pow(punkt.x-p.x,2) + Math.pow(punkt.y-p.y,2)) <= r ){ return true;}
        else return false;
    }

    @Override
    public void przesun(float x, float y) {
        punkt.x += x;
        punkt.y += y;
        System.out.println("Okrag został przesuniety do punktu: ("+x+","+y+")");
    }
}
