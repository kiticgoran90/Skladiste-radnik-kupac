package skladiste;

public class Sfera extends Proizvod {
	private double r;
	
	public Sfera(double r) {
		this.r = r;
	}
	
	@Override
	public char vrsta() {return 'S';}

	@Override
	public double zapremina() {return 4/3.*r*r*r*Math.PI;}
	
	@Override
	public boolean istovetan(Uporediv u) {
		if(!super.istovetan(u)) return false;
		Sfera s =(Sfera)u;
		return r == s.r;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + r + ")";
	}
}
