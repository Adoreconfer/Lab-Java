package Class;

import java.awt.*;

public class Prostokat extends Figura implements IFigury{
	private float wys=0;
	private float szer=0;
	
	public Prostokat(float wys, float szer, String kolor, Punkt punkt){
		this.wys = wys;
		this.szer = szer;
		super.kolor = kolor;
		super.punkt = punkt;
	}

	@Override
	public String opis(){
		return "\nProstokat o wymairach: "+szer+" x "+wys+
				"\nZnajduje sie w punkcie: ("+punkt.x+","+punkt.y+")"+
				"\nPowierzchnia: "+getPowierzchnia();
	}

	@Override
	public void skaluj(float skala) {
		wys = wys*skala;
		szer = szer*skala;
	}

	@Override
	public float getPowierzchnia() {
		return wys*szer;
	}

	@Override
	public boolean wPolu(Punkt p) {
		if( (punkt.x<=p.x && p.x<=(punkt.x+szer)) && (punkt.y<=p.y && p.y<=(punkt.x+wys))){ return true;}
		else return false;
	}
}