package skladiste;

public abstract class Proizvod implements Uporediv, Cloneable {
	
	public abstract char vrsta();
	
	public abstract double zapremina();
	
	@Override
	public boolean istovetan(Uporediv u) {
		return vrsta() == ((Proizvod)u).vrsta();
	}
	
	@Override
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException g) {return null;}
	}
	
	public String toString() {
		return Character.toString(vrsta());
	}
}
