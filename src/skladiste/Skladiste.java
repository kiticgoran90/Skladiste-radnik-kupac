package skladiste;
import greske.*;

public class Skladiste {
	private Proizvod[] niz;
	private double maxV, trenV = 0;
	
	public Skladiste(int kap, double maxV) {
		niz = new Proizvod[kap];
		this.maxV = maxV;
	}
	
	public Skladiste(double maxV) {
		this(10, maxV);
	}
	
	public Skladiste stavi(Proizvod p) throws GZapremina, GNemaMesta {
		if(trenV + p.zapremina() > maxV) throw new GZapremina();
		int i = 0;
		while(i<niz.length && niz[i]!=null) i++;
		if(i==niz.length) throw new GNemaMesta();
		niz[i] = p;
		trenV += p.zapremina();
		return this;
	}
	
	public Proizvod uzmi(Proizvod p) throws GNemaProizvoda {
		int i = 0;
		while(i<niz.length && (niz[i]==null || !niz[i].istovetan(p))) i++;
		if(i == niz.length) throw new GNemaProizvoda();
		p = niz[i]; niz[i] = null;
		trenV -= p.zapremina();
		return p;
	}

	public int imaMesta() {
		int s = 0;
		for(int i=0; i<niz.length; i++)
			if(niz[i] == null) s++;
		return s;
	}
	
	public double slobodnaV() {return maxV - trenV;}
}
