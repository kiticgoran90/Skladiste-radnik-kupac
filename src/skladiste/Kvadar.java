package skladiste;

public class Kvadar extends Proizvod {
	private double a, b, c;
	
	public Kvadar(double a, double b, double c) {
		this.a = a; this.b = b; this.c = c;
	}
	
	@Override
	public char vrsta() {return 'K';}
	
	@Override
	public double zapremina() {return a*b*c;}
	
	@Override
	public boolean istovetan(Uporediv u) {
		if(!super.istovetan(u)) return false;
		Kvadar k =(Kvadar)u;
		return a == k.a && b == k.b && c == k.c;
	}
	
	@Override
	public String toString() {
		return super.toString() + "(" + a + "," + b + "," + c + ")";
	}
}
