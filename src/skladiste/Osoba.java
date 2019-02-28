package skladiste;

public abstract class Osoba {
	private String ime;
	
	public Osoba(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {return ime;}
	
	public String toString() {
		return ime;
	}
}
