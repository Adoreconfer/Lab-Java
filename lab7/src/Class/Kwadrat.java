package Class;

public class Kwadrat extends Prostokat implements IFigury{
	private float a;

	public Kwadrat(float bok,String kolor, Punkt punkt){
		super(bok,bok,kolor, punkt);
		this.a = bok;
		super.punkt = punkt;
	}

	public float getPowierzchnia() {
		return (float) Math.pow(a,2);
	}

	public String opis(){
		return "\nKwadrat o wymairach: "+a+" x "+a+
				"\nZnajduje sie w punkcie: ("+punkt.x+","+punkt.y+")"+
				"\nPowierzchnia: "+getPowierzchnia();
	}

	@Override
	public void skaluj(float skala) {
		a = a*skala;
	}

	public boolean wPolu(Punkt p) {
		if( (punkt.x<=p.x && p.x<=(punkt.x+a)) && (punkt.y<=p.y && p.y<=(punkt.x+a))){ return true;}
		else return false;
	}
}