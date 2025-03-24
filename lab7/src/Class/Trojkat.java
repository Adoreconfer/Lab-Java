package Class;

public class Trojkat extends Figura implements IFigury{
	private float wys=0;
	private float podst=0;
	public Trojkat(float wys, float podst, String kolor, Punkt punkt){
		this.wys = wys;
		this.podst = podst;
		super.kolor = kolor;
		super.punkt = punkt;
	}

	@Override
	public String opis(){
		return "\nTrojkat o wymairach: "+wys+"  "+podst+
				"\nZnajduje sie w punkcie: ("+punkt.x+","+punkt.y+")"+
				"\nPowierzchnia: "+getPowierzchnia();
	}

	@Override
	public void skaluj(float skala) {
		wys = wys*skala;
		podst = podst*skala;
	}

	public float getPowierzchnia(){
		return (float) (0.5*podst*wys);
	}

	@Override
	public boolean wPolu(Punkt p) {
		if( (punkt.x<= p.x && p.x<=(punkt.x+podst)) && (punkt.y<=p.y && p.y<=(punkt.y+wys)) && ( p.y <= (  (((punkt.y+wys) - punkt.y) / (punkt.x - (punkt.x+podst)) * (p.x - (punkt.x+podst))) + punkt.y )) ){ return true;}
		else return false;
	}

}