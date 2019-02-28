package skladiste;

import greske.GNemaProizvoda;

public class Kupac extends Osoba {
	
	public Kupac(String ime) {
		super(ime);
	}
	
	public Proizvod kupi(Skladiste s, Proizvod p) throws GNemaProizvoda {
		return s.uzmi(p);
	}
}
