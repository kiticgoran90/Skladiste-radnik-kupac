package skladiste;

import greske.GNemaMesta;
import greske.GZapremina;

public class Radnik extends Osoba {
	private Skladiste s;
	private Proizvod kalup;
	
	public Radnik(String ime, Skladiste s, Proizvod p) {
		super(ime); this.s = s; kalup = p;
	}
	
	public Radnik proizvedi() throws GZapremina, GNemaMesta {
		s.stavi((Proizvod)kalup.clone());
		return this;
	}
	
	public String toString() {
		return super.toString() + ": " + kalup;
	}
}
